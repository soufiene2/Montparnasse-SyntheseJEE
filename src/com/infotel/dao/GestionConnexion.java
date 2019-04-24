package com.infotel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GestionConnexion {
	
			private String url="jdbc:postgresql://localhost:5432/SyntheseJEE";
			private String user="postgres";
			private String passwd="IN-MP-029";
			
			//Objet connexion
			
			private static Connection connect;

			//Cr�ation d'un constructeur priv�
			
			private GestionConnexion() {					//M�thode qui permet de cr�er une connexion
				try {
					Class.forName("org.postgresql.Driver");
					connect = DriverManager.getConnection(url, user, passwd);
				} catch (Exception e) {
					System.out.println("Erreur de construction");
				}
			}
			
			
			//M�thode d'attribution de connexion
			
			public static Connection getInstance() {		//M�thode qui permet de v�rifier l'unicit� de la connexion
				if (connect == null) {
					new GestionConnexion();
				}
				return connect;
			}
}