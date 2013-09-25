import fr.ippon.bdx.poc.nosql.dao.mongodb.MarcheDAOImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 16:26
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:mongoDB-daoContext.xml"})
public class MongoDaoTest {

    @Autowired
    private MarcheDAOImpl marcheDAO;

    @Test
    public void test(){

    }
}
