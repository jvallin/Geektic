package jvallin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jvallin.dao.GeekDao;

@WebServlet("/search2")
public class ServletRechercheInterets extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String[] champ = request.getParameterValues("interet");
		
		String sexe = request.getParameter("sexe");
		
		if(sexe.equals("1"))
		{
			sexe = "H";
		}
		else if(sexe.equals("2"))
		{
			sexe = "f";
		}
		else if(sexe.equals("3"))
		{
			sexe = "H, F";
		}
		
	    PrintWriter out = response.getWriter();
		
		out.println("champ = "+champ+"\nsexe ="+sexe);

	}
}
