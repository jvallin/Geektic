package jvallin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jvallin.dao.GeekDao;

@WebServlet("Geektic")
public class ServletRecherche extends HttpServlet {
	
	private GeekDao geekDao;
	
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
		
	    String type = request.getParameter("type_recherche");
	    
	    if (type.equals("0")) // recherche par pseudo
	    {
	    	
	    }
	    else // recherche par sexe et interet(s)
	    {
	    	
	    }
	    
	    String pseudo = request.getParameter("pseudo");

		PrintWriter out = response.getWriter();

		
		request.setAttribute("listeGeeks", geekDao.findBySexe("M"));

		getServletConfig().getServletContext().getRequestDispatcher("index.jsp").forward(request, response);

	}
}
