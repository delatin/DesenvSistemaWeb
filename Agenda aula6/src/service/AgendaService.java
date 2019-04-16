package service;
import model.Agenda;
import dao.AgendaDAO;
public class AgendaService extends Agenda {
	AgendaDAO dao;

	public AgendaService() {
		dao = new AgendaDAO();
	}

	public void incluir(Agenda agenda) {
		dao.incluir(agenda);
	}

	public void atualizar(Agenda agenda) {
		dao.atualizar(agenda);
	}

	public void excluir(Agenda id) {
		dao.excluir(id);
	}

	public Agenda carregar(String id) {
		return null;
	}

}
