package fr.ippon.bdx.poc.nosql.dao.mongodb;

import fr.ippon.bdx.poc.nosql.data.Marche;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
public interface MarcheDAO extends MongoRepository<Marche,String> {
}
