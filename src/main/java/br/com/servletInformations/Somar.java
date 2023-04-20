package br.com.servletInformations;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/somar")
public class Somar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double p1 = Double.parseDouble(request.getParameter("p1"));
		double p2 = Double.parseDouble(request.getParameter("p2"));
		
		double resultado = p1 + p2;
		response.getWriter().println(resultado);
	}
}
