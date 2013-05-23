package jvallin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Geektic")
public class ServletRecherche extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		super.doPost(request, response);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		String title = "Hello world test";
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"black\">");
		out.println("<h1 style='color:white;'>" + title + "</h1>");
		out.println("</body>");
		out.println("</html>");

		getServletConfig().getServletContext().getRequestDispatcher("index.jsp").forward(request, response);

	}
}
