package fr.ippon.bdx.poc.nosql.dao.redis;

import fr.ippon.bdx.poc.nosql.dao.GenericMarcheDAO;
import fr.ippon.bdx.poc.nosql.data.Marche;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 11:32
 * To change this template use File | Settings | File Templates.
 */
public class RedisDAO implements GenericMarcheDAO {

    private RedisTemplate redisTemplate;

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    @Override
    public void putMarche(Marche marche) {
        redisTemplate.opsForHash().put(marche.getObjectKey(),marche.getKey(),marche);
    }

    @Override
    public void delete(String key) {
        redisTemplate.opsForHash().delete(Marche.MARCHE, key);
    }

    @Override
    public Marche get(String key) {
        return (Marche) redisTemplate.opsForHash().get(Marche.MARCHE,
                key);
    }

    @Override
    public List<Marche> getObjects() {
        List<Marche> marches = new ArrayList<Marche>();
        for (Object marche : redisTemplate.opsForHash().values(Marche.MARCHE)) {
            marches.add((Marche)
                    marche);
        }
        return marches;
    }

    @Override
    public List<Marche> getProducteurDansVille(String value) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
