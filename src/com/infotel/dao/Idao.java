package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public interface Idao {
	
	
	public int ajouterStagiaire(Stagiaire s);		
	public int supprimerStagiaire(Stagiaire s);	
	public List<Stagiaire> findAllStagiaires();

	public int ajouterPromo(Promo p);		
	public int supprimerPromo(Promo p);	
	public List<Promo> findAllPromos();
	public void attribuerStagiairePromo(Stagiaire s, Promo p);

	
	public int ajouterFormation(Formation f);		
	public int supprimerFormation(Formation f);
	public List<Formation> findAllFormations();
	public void attribuerPromoFormation(Promo p, Formation f);
	

}
