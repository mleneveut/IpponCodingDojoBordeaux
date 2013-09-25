import fr.ippon.bdx.poc.nosql.dao.GenericMarcheDAO;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 11:17
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:redis-daoContext.xml"})
public class RedisPerfTest extends NoSQLDBTest {

    @Autowired
    GenericMarcheDAO redisDAO;


    public GenericMarcheDAO getDAO(){
        return redisDAO;
    }



}
