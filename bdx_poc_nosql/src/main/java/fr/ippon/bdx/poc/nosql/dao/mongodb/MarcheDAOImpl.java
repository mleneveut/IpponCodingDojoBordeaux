package fr.ippon.bdx.poc.nosql.dao.mongodb;

import fr.ippon.bdx.poc.nosql.dao.GenericMarcheDAO;
import fr.ippon.bdx.poc.nosql.data.Marche;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class MarcheDAOImpl implements GenericMarcheDAO {



    private MongoTemplate mongoTemplate;

    @Override
    public void putMarche(Marche marche) {
        mongoTemplate.save(marche);
    }

    @Override
    public void delete(String key) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Marche get(String key) {
        Query query = new Query(Criteria.where("_id").is(key));
        return mongoTemplate.findOne(query,Marche.class);
    }

    public List<Marche> getProducteurDansVille(String value) {
        Query query = new Query(Criteria.where("ville").is(value));
        return mongoTemplate.find(query,Marche.class);
    }

    @Override
    public List<Marche> getObjects() {
        return mongoTemplate.findAll(Marche.class);
    }


    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
