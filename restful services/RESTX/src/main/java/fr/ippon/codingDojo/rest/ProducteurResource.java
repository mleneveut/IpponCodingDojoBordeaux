package fr.ippon.codingDojo.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import fr.ippon.codingDojo.model.Coordinates;
import fr.ippon.codingDojo.model.Producteur;
import fr.ippon.codingDojo.model.ProducteurSearch;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import org.bson.types.ObjectId;
import restx.annotations.GET;
import restx.annotations.POST;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.jongo.JongoCollection;

/**
 * Created with IntelliJ IDEA.
 * User: kjahan
 * Date: 24/09/13
 * Time: 11:03
 * To change this template use File | Settings | File Templates.
 */
@Component
@RestxResource
public class ProducteurResource {

	private final JongoCollection producteurs;

	public ProducteurResource(@Named("producteur")JongoCollection producteurs) {
		this.producteurs = producteurs;
	}

	@GET("/producteurs")
	public Iterable<Producteur> getProducteurs(){
		return producteurs.get().find().as(Producteur.class);
	}

	/**@POST("/producteurs/search")
	public Iterable<Producteur> getProducteursAtCoordinates(ProducteurSearch producteurSearch){
		System.out.println(producteurSearch.getPerimeter());
		return staticProducteurs;
	}**/

	@GET("/producteur/{id}")
	public Optional<Producteur> getProducteur(String id){

		return Optional.fromNullable(producteurs.get().findOne(new ObjectId(id)).as(Producteur.class));
	}
}
