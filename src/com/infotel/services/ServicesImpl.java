package com.infotel.services;

import java.util.List;

import com.infotel.dao.DaoImpl;
import com.infotel.dao.Idao;
import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;


public class ServicesImpl implements Iservices {

	private Idao dao = new DaoImpl();

	public int ajouterStagiaire(Stagiaire s) {
		return dao.ajouterStagiaire(s);
	}

	public int supprimerStagiaire(Stagiaire s) {
		return dao.supprimerStagiaire(s);
	}

	public List<Stagiaire> findAllStagiaires() {
		return dao.findAllStagiaires();
	}

	public int ajouterPromo(Promo p) {
		return dao.ajouterPromo(p);
	}

	public int supprimerPromo(Promo p) {
		return dao.supprimerPromo(p);
	}

	public List<Promo> findAllPromos() {
		return dao.findAllPromos();
	}

	public int ajouterFormation(Formation f) {
		return dao.ajouterFormation(f);
	}

	public int supprimerFormation(Formation f) {
		return dao.supprimerFormation(f);
	}

	public List<Formation> findAllFormations() {
		return dao.findAllFormations();
	}

	
	public void attribuerStagiairePromo(Stagiaire s, Promo p) {
		
	}

	public void attribuerPromoFormation(Promo p, Formation f) {
		
	}
	

}
