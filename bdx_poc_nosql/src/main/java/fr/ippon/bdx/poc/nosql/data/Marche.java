package fr.ippon.bdx.poc.nosql.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 10:52
 * To change this template use File | Settings | File Templates.
 */
@Document
public class Marche implements DomainObject {

    public final static String MARCHE = "Marche";
    @Id
    private String _id;
    private String nom;
    private String ville;
    private String description;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
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

    @Override
    public String getKey() {
        return _id;
    }

    @Override
    public String getObjectKey() {
        return MARCHE;
    }
}
