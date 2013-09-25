package fr.ippon.codingDojo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: kjahan
 * Date: 24/09/13
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public class ProducteurSearch {
	private Coordinates coordinates;
	private Long perimeter;
	private HashMap<String, Object> additionalProps = new HashMap<>();

	@JsonAnyGetter
	public Map<String,Object> any() {
		return additionalProps;
	}

	@JsonAnySetter
	public void set(String name, Object value) {
		additionalProps.put(name, value);
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Long getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(Long perimeter) {
		this.perimeter = perimeter;
	}
}
