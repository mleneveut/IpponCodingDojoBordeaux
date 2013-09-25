package fr.ippon.bdx.poc.nosql.data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 10:52
 * To change this template use File | Settings | File Templates.
 */
public class Producteur {
    private String nom;
    private String siret;
    private String raisonSociale;
    private String description;
    private String site;

    private boolean ab;
    private boolean venteDirecte;
    private List<String> labels;

    private CategorieProduit categProduit;
    private Coordonnees coords;

    private Statut statut;
    //private List<Jours>

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public boolean isAb() {
        return ab;
    }

    public void setAb(boolean ab) {
        this.ab = ab;
    }

    public boolean isVenteDirecte() {
        return venteDirecte;
    }

    public void setVenteDirecte(boolean venteDirecte) {
        this.venteDirecte = venteDirecte;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

}
