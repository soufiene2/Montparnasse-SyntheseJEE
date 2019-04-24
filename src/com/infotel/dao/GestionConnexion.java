package com.infotel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GestionConnexion {
	
			private String url="jdbc:postgresql://localhost:5432/SyntheseJEE";
			private String user="postgres";
			private String passwd="IN-MP-029";
			
			//Objet connexion
			
			private static Connection connect;

			//Création d'un constructeur privé
			
			private GestionConnexion() {					//Méthode qui permet de créer une connexion
				try {
					Class.forName("org.postgresql.Driver");
					connect = DriverManager.getConnection(url, user, passwd);
				} catch (Exception e) {
					System.out.println("Erreur de construction");
				}
			}
			
			
			//Méthode d'attribution de connexion
			
			public static Connection getInstance() {		//Méthode qui permet de vérifier l'unicité de la connexion
				if (connect == null) {
					new GestionConnexion();
				}
				return connect;
			}
}