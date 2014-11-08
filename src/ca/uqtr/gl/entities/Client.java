package ca.uqtr.gl.entities;

import java.util.Date;

import ca.uqtr.gl.domain.RegistreClient;

public class Client extends Personne {
	private int identifiant;
	private String noCarteMembre;
	private String noTelephone;
	private String courriel;
	
	public Client(String nom, String prenom, Date dateNaissance, Adresse adresse) {
		this(RegistreClient.compteurIdentifiant, "", nom, prenom, dateNaissance, adresse, "", "");
	}
	
	public Client(int identifiant, String noCarteMembre, String nom, String prenom, Date dateNaissance, Adresse adresse, String noTel, String courriel) {
		super(nom, prenom, dateNaissance, adresse);
		
		this.identifiant = identifiant;
		this.noCarteMembre = noCarteMembre;
		this.noTelephone = noTel;
		this.courriel = courriel;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNoCarteMembre() {
		return noCarteMembre;
	}

	public void setNoCarteMembre(String noCarteMembre) {
		this.noCarteMembre = noCarteMembre;
	}

	public String getNoTelephone() {
		return noTelephone;
	}

	public void setNoTelephone(String noTelephone) {
		this.noTelephone = noTelephone;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String obtenirNomComplet() {
		return this.getPrenom() + " " + this.getNom();
	}
}