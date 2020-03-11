package imagens;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;

import io.restassured.http.ContentType;

public class ImagensPublicas {

	@Test
	public void validandoTodos() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")

				.when().get("https://api.thecatapi.com/v1/images/search").then().statusCode(200)
				.contentType(ContentType.JSON).body("id[0]", is(not(nullValue())))
				.body("url[0]", is(not(nullValue()))).body("width[0]", is(not(nullValue())))
				.body("height[0]", is(not(nullValue())))

		;

	}

	@Test
	public void validandoSize() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.pathParam("size", "completo")
		.when()
		.get("https://api.thecatapi.com/v1/images/search?size={size}")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		.body("id[0]", is(not(nullValue())))
		.body("url[0]", is(not(nullValue())))
		.body("width[0]", is(not(nullValue())))
		.body("height[0]", is(not(nullValue())))

		;
	}
	
	@Test
	public void validandoMime_Type() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.pathParam("Mime_Type", "true")
		.when()
		.get("https://api.thecatapi.com/v1/images/search?mime_types={Mime_Type}")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		.body("id[0]", is(not(nullValue())))
		.body("url[0]", is(not(nullValue())))
		.body("width[0]", is(not(nullValue())))
		.body("height[0]", is(not(nullValue())))

		;

	}
	
	@Test
	public void validandoOrder() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.pathParam("order", "desc")
		.when()
		.get("https://api.thecatapi.com/v1/images/search?order={order}")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		.body("id[0]", is(not(nullValue())))
		.body("url[0]", is(not(nullValue())))
		.body("width[0]", is(not(nullValue())))
		.body("height[0]", is(not(nullValue())))

		;

	}
	
	@Test
	public void validandoLimit() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.pathParam("limit", "5")
		.when()
		.get("https://api.thecatapi.com/v1/images/search?limit={limit}")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		.body("id[0]", is(not(nullValue())))
		.body("url[0]", is(not(nullValue())))
		.body("width[0]", is(not(nullValue())))
		.body("height[0]", is(not(nullValue())))

		;

	}
	
	@Test
	public void validandoPagina() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.pathParam("page", "5")
		.when()
		.get("https://api.thecatapi.com/v1/images/search?page={page}")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		.body("id[0]", is(not(nullValue())))
		.body("url[0]", is(not(nullValue())))
		.body("width[0]", is(not(nullValue())))
		.body("height[0]", is(not(nullValue())))

		;

	}
	
	@Test
	public void validandoJson() {

		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.pathParam("format", "json")
		.when()
		.get("https://api.thecatapi.com/v1/images/search?format={format}")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		.body("id[0]", is(not(nullValue())))
		.body("url[0]", is(not(nullValue())))
		.body("width[0]", is(not(nullValue())))
		.body("height[0]", is(not(nullValue())))
		
		;

	}
}
