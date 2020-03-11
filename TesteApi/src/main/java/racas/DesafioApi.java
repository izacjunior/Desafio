package racas;

import org.junit.Test;
import static io.restassured.RestAssured.given;
public class DesafioApi {

	
	//@Test
	public void teste() {
		
	 given()
	 .headers("x-api-key","f758823a-2b37-4143-9137-f2ad8a71960d")
	 .when()
	 .get("https://api.thecatapi.com/v1/images/search?limit=5&page=10&order=Desc")
	 .then()
	 .statusCode(200)
	 .log().all()
	 
	 ;
	}
	
	@Test
	public void teste1() {
		
	 given()
	 .headers("x-api-key","f758823a-2b37-4143-9137-f2ad8a71960d")
	 .when()
	 .get("https://api.thecatapi.com/images/search")
	 .then()
	 .statusCode(200)
	 .log().all()
	 
	 ;
	}
	
}
