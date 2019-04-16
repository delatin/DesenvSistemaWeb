package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Agenda;
public class AgendaDAO {
	
		
	public int incluir(Agenda agenda) {
		String sqlInsert = "INSERT INTO agenda(nome, email, telefone, endereco) VALUES (?, ?, ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, agenda.getNome());
			stm.setString(2, agenda.getEmail());
			stm.setString(3, agenda.getTelefone());
			stm.setString(4, agenda.getEndereco());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try(PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if(rs.next()) {
					agenda.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return agenda.getId();
	}

	public void excluir(Agenda id) {
		String sqlDelete = "DELETE FROM contato WHERE nome = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setString(1, id.getNome());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Agenda agenda) {
		String sqlUpdate = " UPDATE CLIENTE SET FONE = ? WHERE NOME = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(2, agenda.getNome());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void carregar(Agenda id) {
		String sqlSelect = "Select * from telefone where nome = ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, id.getNome());
			try (ResultSet rs = stm.executeQuery();) {

				if (rs.next()) {
					id.setNome(rs.getString(1));
					id.setTelefone(rs.getString(3));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
