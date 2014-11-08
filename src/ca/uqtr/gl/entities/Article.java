package ca.uqtr.gl.entities;

public class Article {
	private String code;
	private String description;
	private double longeur;
	private double largeur;
	private double hauteur;
	private double prix;
	private double qte;
	
	
	/*
	public Article(String nom, String prenom, Date dateNaissance, Adresse adresse) {
		this(RegistreClient.compteurIdentifiant, "", nom, prenom, dateNaissance, adresse, "", "");
	}
	*/
	public Article(String code, String description, double longeur, double largeur, double hauteur, double prix, double qte) {
	
		this.code = code;
		this.description = description;
		this.longeur = longeur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.prix = prix;
		this.qte = qte;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double Largeur) {
		this.largeur = Largeur;
	}
	
	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public double getPprix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public double getQte() {
		return qte;
	}

	public void setQte(double qte) {
		this.qte = qte;
	}

}