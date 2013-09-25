package fr.ippon.bdx.poc.nosql.ko;

import fr.ippon.bdx.poc.nosql.dao.GenericMarcheDAO;
import fr.ippon.bdx.poc.nosql.data.Marche;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class MarcheDAOKOImpl extends SimpleMongoRepository<Marche, String> implements GenericMarcheDAO {

    //@Autowired
   // private static DefaultEntityInformationCreator entityInformationCreator;

    public MarcheDAOKOImpl(MongoEntityInformation<Marche, String> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }


    @Override
    public void putMarche(Marche marche) {
        this.save(marche);
    }

    @Override
    public Marche get(String key) {
        return this.findOne(key);
    }

    @Override
    public List<Marche> getObjects() {
        return this.findAll();
    }

    @Override
    public List<Marche> getProducteurDansVille(String value) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
