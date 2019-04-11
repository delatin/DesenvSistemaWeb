import model.Agenda;
public class AgendaService extends Agenda {
	AgendaDAO dao;

	public void Agenda() {
		dao = new AgendaDAO();
	}

	public void incluir(Agenda to) {
		dao.incluir(to);
	}

	public void atualizar(Agenda to, String novoTelefone) {
		dao.atualizar(to, novoTelefone);
	}

	public void excluir(Agenda to) {
		dao.excluir(to);
	}

	public Agenda carregar(String id) {
		return null;
	}

}
