package com.infotel.servlet.stagiaire;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.infotel.metier.Stagiaire;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletStagiaireSupprimer
 */
@WebServlet("/ServletStagiaireSupprimer")
public class ServletStagiaireSupprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Iservices service = new ServicesImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletStagiaireSupprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idStagiaire = Integer.parseInt(request.getParameter("idStagiaire"));
		Stagiaire s = new Stagiaire();
		s.setIdStagiaire(idStagiaire);
		service.supprimerStagiaire(s);
		
		  //3 - préparation à l'envoi
        request.setAttribute("stagiaire", service.findAllStagiaires());
        
        //4- appel de la jsp
        request.getRequestDispatcher("Stagiaire.jsp")
        .forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
