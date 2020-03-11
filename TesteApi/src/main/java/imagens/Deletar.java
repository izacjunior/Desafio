package imagens;

import static io.restassured.RestAssured.given;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import io.restassured.http.ContentType;

public class Deletar {

	@Test
	public void deletarImagem() {

		given().headers("x-api-key", "fe1580c0-ab9f-4cde-9bc7-7998457e7e9f").pathParam("deletar", "ABrCyeSpx").when()
				.delete("https://api.thecatapi.com/v1/images/{deletar}").then().statusCode(200)
				.contentType(ContentType.JSON)
				;

	}
	
	@Test
	public void imagemInexistente() {

		given().headers("x-api-key", "fe1580c0-ab9f-4cde-9bc7-7998457e7e9f").pathParam("deletar", "bhn").when()
				.delete("https://api.thecatapi.com/v1/images/{deletar}").then().statusCode(400)
				.contentType(ContentType.JSON).log().all()
		.body("level", is("info"))
		.body("message", is("INVALID_DATA"))
		.body("status", is(400))
		
		;
		

	}
}