package serviceBD;

import java.sql.Connection;
import java.sql.SQLException;

public class BD {
	private Connection connexion = null;
	
	// initialisation de la BD
	public void init() {
		String id;
		String password;
		System.out.print("id oracle: ");
		id = LectureClavier.lireChaine();
		System.out.print("password oracle: ");
		password = LectureClavier.lireChaine();
		Connexion connexion = new Connexion(id, password);
		this.connexion = connexion.getConnection();
		// script de création des tables à ajouter ici
	}
	// insertion des tuples dans la BD
	void insert() {
		
	}
	// drop de toutes les tables
	void erase() {
		
	}
	// recuper la bd
	public Connection getConnection() throws SQLException {
		return null;
	}
}
