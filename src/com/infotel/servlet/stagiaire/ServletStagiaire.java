package com.infotel.servlet.stagiaire;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Stagiaire;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletStagiaireAjouter
 */
@WebServlet("/Stagiaire")
public class ServletStagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private Iservices services = new ServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletStagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		List<Stagiaire> stagList = services.findAllStagiaires();
		request.setAttribute("stagiaire", stagList);
		request.getRequestDispatcher("Stagiaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
