
public class AgendaService {
	private AgendaDAO dao;
	
	public AgendaService() {
		dao = new AgendaDAO();
	}

	public void inserir(Agenda agenda) {
		dao.inserir(agenda);
	}

	public void excluir(int id) {
		dao.excluir(id);
	}

	public Agenda carregar(int id) {
		return dao.carregar(id);
	}

	public void editar(Agenda agenda) {
		dao.editar(agenda);
	}
	
	
}
