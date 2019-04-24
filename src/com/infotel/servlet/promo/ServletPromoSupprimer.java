package com.infotel.servlet.promo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Promo;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletStagiaireSupprimer
 */
@WebServlet("/ServletStagiaireSupprimer")
public class ServletPromoSupprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Iservices service = new ServicesImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPromoSupprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idPromo = Integer.parseInt(request.getParameter("idPromo"));
		Promo p = new Promo();
		p.setIdPromo(idPromo);
		service.supprimerPromo(p);
		
		  //3 - préparation à l'envoi
        request.setAttribute("promo", service.findAllPromos());
        
        //4- appel de la jsp
        request.getRequestDispatcher("Promo.jsp")
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
