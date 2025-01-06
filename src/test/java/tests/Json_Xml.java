package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Json_Xml {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        // Handling JSON Response
        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));

// Handling XML Response
        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("name", equalTo("Leanne Graham"));

    }
}
