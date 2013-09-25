package fr.ippon.bdx.poc.nosql.dao;

import fr.ippon.bdx.poc.nosql.data.Marche;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */
public interface GenericMarcheDAO {
    void putMarche(Marche marche);

    void delete(String key);

    Marche get(String key);

    List<Marche> getObjects();

    public List<Marche> getProducteurDansVille(String value);
}
