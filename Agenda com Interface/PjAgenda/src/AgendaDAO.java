import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Agenda;
public class AgendaDAO {
	
		
	public void incluir(Agenda to) {
		String sqlInsert = "INSERT INTO agenda(nome, email, telefone, endereco) VALUES (?, ?, ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, to.getNome());
			stm.setString(2, to.getEmail());
			stm.setString(3, to.getTelefone());
			stm.setString(4, to.getEndereco());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Agenda to) {
		String sqlDelete = "DELETE FROM contato WHERE nome = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setString(1, to.getNome());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Agenda to, String novoTelefone) {
		String sqlUpdate = " UPDATE CLIENTE SET FONE = ? WHERE NOME = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, novoTelefone);
			stm.setString(2, to.getNome());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void carregar(Agenda to) {
		String sqlSelect = "Select * from telefone where nome = ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, to.getNome());
			try (ResultSet rs = stm.executeQuery();) {

				if (rs.next()) {
					to.setNome(rs.getString(1));
					to.setTelefone(rs.getString(3));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
