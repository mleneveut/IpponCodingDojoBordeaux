package fr.ippon.bdx.poc.nosql.data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: flopes
 * Date: 24/09/13
 * Time: 11:47
 * To change this template use() File | Settings | File Templates.
 */
public interface DomainObject extends Serializable {
    String getKey();

    String getObjectKey();

}
