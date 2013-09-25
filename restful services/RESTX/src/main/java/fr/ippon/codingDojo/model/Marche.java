package fr.ippon.codingDojo.model;

/**
 * Created with IntelliJ IDEA.
 * User: kjahan
 * Date: 24/09/13
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
public class Marche {
	private String id;
	private String nom;
	private String ville;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Marche(String id, String ville, String description) {
		this.id = id;
		this.ville = ville;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
