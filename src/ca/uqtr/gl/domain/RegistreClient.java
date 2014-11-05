package ca.uqtr.gl.domain;

import java.util.Date;
import java.util.HashMap;

import ca.uqtr.gl.entities.Adresse;
import ca.uqtr.gl.entities.Client;

public class RegistreClient {
	private static RegistreClient _instance;
	private static HashMap<Integer, Client> listeClients;
	
	// identifiant unique pour nouveau client
	public static int compteurIdentifiant = 0;
		
	public RegistreClient() {
		if (listeClients == null) {
			listeClients = new HashMap<Integer, Client>();
		}
	}

	public HashMap<Integer, Client> getListeClients() {
		return listeClients;
	}
	
	public static Client rechercherClient(int identifiant) {
		return listeClients.get(identifiant);
	}

	public void ajouterClient(String noCarteMembre, String nom, String prenom, 
			Date dateNaissance, Adresse adresse, String noTel) {
		listeClients.put(++compteurIdentifiant, new Client(compteurIdentifiant, noCarteMembre, nom, prenom, dateNaissance, adresse, noTel));
	}

	public void supprimerClient(Client client) {
		listeClients.remove(client);
	}

	public void modifierClient(Client c, String nom, String prenom, 
			Date dateNaissance, Adresse adresse, String noTel) {
		
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setNoTelephone(noTel);
	}
}
