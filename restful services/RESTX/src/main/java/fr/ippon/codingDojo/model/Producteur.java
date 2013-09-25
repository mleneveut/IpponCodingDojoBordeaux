package fr.ippon.codingDojo.model;

import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

/**
 * Created with IntelliJ IDEA.
 * User: kjahan
 * Date: 24/09/13
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class Producteur {
	@Id @ObjectId
	private String id;
	private String name;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
