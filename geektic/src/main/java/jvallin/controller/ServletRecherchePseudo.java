package jvallin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jvallin.dao.GeekDao;

@WebServlet("/search1")
public class ServletRecherchePseudo extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String champ = request.getParameter("pseudo");
		
	    PrintWriter out = response.getWriter();
		
		out.println("champ = "+champ);

	}
}
