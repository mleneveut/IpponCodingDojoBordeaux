package fr.ippon.bdx.poc.nosql.data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 11:06
 * To change this template use File | Settings | File Templates.
 */
public class Horaire {
    private Jours jour;
    private String heureMinDebut;
    private String heureMinFin;
    /**
     * Semaines dans le mois.
     * Si vide, chaque semaine
     */
    private List<Integer> semaines;

    /**
     * TODO Déterminer si cet élément doit être ici ou directement sur une entité
     * Jours de fermeture exceptionnelle (au format jj/MM) (par exemple 25/12)
     */
    private List<String> exclusions;

    public Jours getJour() {
        return jour;
    }

    public void setJour(Jours jour) {
        this.jour = jour;
    }

    public String getHeureMinDebut() {
        return heureMinDebut;
    }

    public void setHeureMinDebut(String heureMinDebut) {
        this.heureMinDebut = heureMinDebut;
    }

    public String getHeureMinFin() {
        return heureMinFin;
    }

    public void setHeureMinFin(String heureMinFin) {
        this.heureMinFin = heureMinFin;
    }
}
