package com.infotel.servlet.formation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Formation;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletStagiaireSupprimer
 */
@WebServlet("/ServletStagiaireSupprimer")
public class ServletFormationSupprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Iservices service = new ServicesImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormationSupprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idFormation = Integer.parseInt(request.getParameter("idFormation"));
		Formation f = new Formation();
		f.setIdFormation(idFormation);
		service.supprimerFormation(f);
		
		  //3 - préparation à l'envoi
        request.setAttribute("formation", service.findAllFormations());
        
        //4- appel de la jsp
        request.getRequestDispatcher("Formation.jsp")
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
