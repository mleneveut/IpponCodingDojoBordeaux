import fr.ippon.bdx.poc.nosql.dao.GenericMarcheDAO;
import fr.ippon.bdx.poc.nosql.data.Marche;
import fr.ippon.bdx.poc.nosql.ko.MarcheDAOKOImpl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:mongoDB-daoContext.xml"})
public class MongoDBTest extends NoSQLDBTest {

    @Autowired
    private GenericMarcheDAO marcheDaoImpl;

    @Override
    public GenericMarcheDAO getDAO() {
        return marcheDaoImpl;
    }

    @Test
    public void testSearchVille(){
        List<Marche> marches = marcheDaoImpl.getProducteurDansVille("Libourne");
        assertEquals(5000,marches.size());
    }
}
