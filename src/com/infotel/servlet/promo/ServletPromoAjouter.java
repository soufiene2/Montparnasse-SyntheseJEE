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
 * Servlet implementation class ServletStagiaireAjouter
 */
@WebServlet("/ServletStagiaireAjouter")
public class ServletPromoAjouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private Iservices services = new ServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPromoAjouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomSession = request.getParameter("nomSession");
		int effectif = Integer.parseInt(request.getParameter("effectif"));
		
		Promo prom = new Promo();
		prom.setEffectif(effectif);
		prom.setNomSession(nomSession);

		services.ajouterPromo(prom);
		
		response.sendRedirect("/SyntheseJEE/Promo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
