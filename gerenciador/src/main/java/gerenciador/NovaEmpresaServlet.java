package gerenciador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Nova Empresa.");
		String nomeEmpresa = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa " + nomeEmpresa + " Cadastrada com Sucesso !</body></html>");
		
	}

}
