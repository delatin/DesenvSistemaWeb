
public class PaisService {
	private PaisDAO dao;

	public PaisService() {
		dao = new PaisDAO();
	}

	public void criar(Pais pais) {
		dao.criar(pais);
	}

	public void excluir(int id) {
		dao.excluir(id);
	}

	public Pais carregar(int id) {
		return dao.carregar(id);
	}

	public void atualizar(Pais pais) {
		dao.atualizar(pais);
	}

}
