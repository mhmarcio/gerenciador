package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet (urlPatterns = "/oi")//a URL que evoca o Servlet
public class OlaMundoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	 PrintWriter out= resp.getWriter();
	 
	 out.println("<html>");
     out.println("<body>");
     out.println("Parab�ns, voc� escreveu sua primeira servlet");
     out.println("</body>");
     out.println("</html>");
     
     System.out.println("o servlet OiMundoServlet foi chamado");
	}
		
}
