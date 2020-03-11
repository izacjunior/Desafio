package imagens;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;

import io.restassured.http.ContentType;

public class Post {

	@Test
	public void post() {
		//The API did not return a response. Is it running and accessible? If you are sending this request from a web browser, does the API support cors?
		given().headers("x-api-key", "f758823a-2b37-4143-9137-f2ad8a71960d")
		.when()
		.post("https://api.thecatapi.com/v1/images/upload")
		.then()
		.statusCode(200).contentType(ContentType.JSON)
		
	


		;
	}
	
}
