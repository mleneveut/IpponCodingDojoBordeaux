package fr.ippon.codingDojo.rest;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import fr.ippon.codingDojo.model.Marche;
import java.util.ArrayList;
import java.util.List;
import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;

/**
 * Created with IntelliJ IDEA.
 * User: kjahan
 * Date: 24/09/13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
@Component
@RestxResource
public class MarcheResource {
	static Marche marche1 = new Marche("1", "Bordeaux", "Le marche de Bordeaux");
	static Marche marche2 = new Marche("2", "Pessac", "Le marche de Pessac");
	static Marche marche3 = new Marche("3", "Talence", "Le marche de Talence");

	private static List<Marche> marches = Lists.newArrayList(marche1, marche2, marche3);

	@GET("/marches")
	public Iterable<Marche> getMarches(){
		return marches;
	}

	@GET("/marche/{id}")
	public Optional<Marche> getMarche(String id){
		Marche marche = null;

		for(Marche m : marches){
			if (m.getId().equals(id)){
				marche = m;
			}
		}

		return Optional.fromNullable(marche);
	}

}