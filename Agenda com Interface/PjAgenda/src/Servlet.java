import model.Agenda;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Agenda.do")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pEmail = request.getParameter("email");
		String pTelefone = request.getParameter("telefone");
		String pEndereco = request.getParameter("endereco");
		
		// instanciar o javabean
		Agenda agenda = new Agenda();
		agenda.setNome(pNome);
		agenda.setEmail(pEmail);
		agenda.setTelefone(pTelefone);
		agenda.setEndereco(pEndereco);
		
		AgendaService as = new AgendaService();
		as.incluir(agenda);
		agenda = as.carregar(agenda.getId());
		
		// instanciar o service
		//enviarpara o jsp
		request.setAttribute("agenda", agenda);

		RequestDispatcher view =
		request.getRequestDispatcher("Agenda.jsp");
		view.forward(request, response);

	}
}