import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgendaDAO {
	
	   public void inserir(Agenda agenda){
		   String sqlInsert = "insert into agenda (nome, email, telefone, endereco) values(?,?,?,?)";
		   try (Connection conn = ConexaoBD.obtemConexao(); 
				   PreparedStatement stm = conn.prepareStatement(sqlInsert);){
					stm.setString(1, agenda.getNome());
					stm.setString(2, agenda.getEmail());
					stm.setString(3, agenda.getTelefone());
					stm.setString(4, agenda.getEndereco());
					stm.execute();
		      }
		      catch(SQLException e){
		         e.printStackTrace();
		      }
		      catch(Exception exc){
		         JOptionPane.showMessageDialog(null, exc);
		      }   
		   }
	   
	   
		public Agenda carregar(int id) {

			Agenda agenda = new Agenda();

			String sqlSelect = "SELECT id, nome, email, telefone, endereco FROM agenda";
			try (Connection conn = ConexaoBD.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setInt(1, id);
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						agenda.setId(rs.getInt("id"));
						agenda.setNome(rs.getString("nome"));
						agenda.setEmail(rs.getString("email"));
						agenda.setTelefone(rs.getString("telefone"));
						agenda.setEndereco(rs.getString("endereço"));

					} else {
						agenda.setId(-1);
						agenda.setNome(null);
						agenda.setEmail(null);
						agenda.setTelefone(null);
						agenda.setEndereco(null);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
			return agenda;
		}
		   
		   public void editar(Agenda agenda){
			   String sqlUpdate = "UPDATE agenda SET nome = ?, email = ?, telefone = ?, endereco = ? WHERE id = ?";
		      try (Connection conn = ConexaoBD.obtemConexao(); 
		    		  PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
		         conn.setAutoCommit(false);
		         stm.setString(1, agenda.getNome());
		         stm.setString(2, agenda.getEmail());
		         stm.setString(3, agenda.getTelefone());
		         stm.setString(4, agenda.getEndereco());
		         stm.setInt(5, agenda.getId());
		         stm.execute();
		         conn.commit();
		      }
		      catch (Exception e) {
		         e.printStackTrace();
		      }
		   }
		   
		   public void excluir(int id){
			   String sqlDelete = "DELETE FROM agenda WHERE id = ?";
		      try (Connection conn = ConexaoBD.obtemConexao();
						PreparedStatement stm = conn.prepareStatement(sqlDelete);)  {
		         stm.setInt(1, id);
		         stm.execute();
		      }
		      catch (Exception e) {
		         e.printStackTrace();
		      }
		   }
	
}
