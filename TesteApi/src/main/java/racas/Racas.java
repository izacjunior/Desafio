package racas;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;

import static org.hamcrest.Matchers.hasItems;

import org.junit.Test;

import io.restassured.http.ContentType;

public class Racas {

	@Test
	public void validandoRacaEspecifica() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d").pathParam("attach_breed", "1")
				.pathParam("page", "1").pathParam("limit", "1").when()
				.get("https://api.thecatapi.com/v1/breeds?attach_breed={attach_breed}&page={page}&limit={limit}").then()
				.statusCode(200).contentType(ContentType.JSON).log().all()
				.body("weight[0]", hasKey(containsString("imperial")))
				.body("weight[0]", hasKey(containsString("metric"))).body("id", hasSize(1))
				.body("id", is(not(nullValue()))).body("id[0]", containsString("aege"))
				.body("name[0]", containsString("Aegean")).body("origin[0]", containsString("Greece"))
				.body("temperament", is(not(nullValue()))).body("description", is(not(nullValue())))
				.body("experimental[0]", is(lessThan(2))).body("hairless[0]", is(lessThan(2)))
				.body("natural[0]", is(lessThan(2))).body("rare[0]", is(lessThan(2))).body("rex[0]", is(lessThan(2)))
				.body("suppressed_tail[0]", is(lessThan(2))).body("short_legs[0]", is(lessThan(2)))
				.body("hypoallergenic[0]", is(lessThan(2))).body("adaptability[0]", is(lessThan(6)))
				.body("affection_level[0]", is(lessThan(6))).body("child_friendly[0]", is(lessThan(6)))
				.body("dog_friendly[0]", is(lessThan(6))).body("energy_level[0]", is(lessThan(6)))
				.body("grooming[0]", is(lessThan(6))).body("health_issues[0]", is(lessThan(6)))
				.body("intelligence[0]", is(lessThan(6))).body("shedding_level[0]", is(lessThan(6)))
				.body("social_needs[0]", is(lessThan(6))).body("stranger_friendly[0]", is(lessThan(6)))
				.body("vocalisation[0]", is(lessThan(6)))

		// .body("$", hasKey(hasItem("Greece")), hasKey(hasItem("origin")))

		;

	}

	@Test
	public void validandoTodasRaca() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d").pathParam("attach_breed", "0").when()
				.get("https://api.thecatapi.com/v1/breeds?attach_breed={attach_breed}").then().statusCode(200)
				.contentType(ContentType.JSON).log().all().body("id", is(not(nullValue())));
	}

	@Test
	public void validandoTipoRaca() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d").pathParam("attach_breed", "99999").when()
				.get("https://api.thecatapi.com/v1/breeds?attach_breed={attach_breed}").then().statusCode(200)
				.contentType(ContentType.JSON).log().all().body("id", is(not(nullValue())));
	}
	
}
