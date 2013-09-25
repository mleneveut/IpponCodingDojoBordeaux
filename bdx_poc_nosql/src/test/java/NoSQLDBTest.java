import fr.ippon.bdx.poc.nosql.dao.GenericMarcheDAO;
import fr.ippon.bdx.poc.nosql.data.Marche;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 14:55
 * To change this template use File | Settings | File Templates.
 */
public abstract class NoSQLDBTest {

    @Test
    public void testInsertData() {
        for (int i=0;i<10000;i++){
            Marche marche = getMarche(i);
            getDAO().putMarche(marche);
        }
    }

    private Marche getMarche(int i) {
        Marche marche = new Marche();
        marche.setId("Mar"
                + i);
        if (i % 2 == 0) {
            marche.setVille("Bordeaux");
        } else {
            marche.setVille("Libourne");
        }
        marche.setNom("Marche producteurs Cauderan");
        marche.setDescription("Marche varie avec plein de producteurs hyper sympas avec des produits qu'on s'en pourlèche les babines de longues heures durant.");
        return marche;
    }

    @Test
    public void testGetData() {
        Marche marche = getDAO().get("Mar0");
        assertNotNull(marche);
        assertEquals("Bordeaux", marche.getVille());
    }

    @Test
    public void testSearchData() {
        List<Marche> marches = getDAO().getObjects();
        System.out.println("Size " +marches.size());

    }

    public abstract GenericMarcheDAO getDAO();
}
