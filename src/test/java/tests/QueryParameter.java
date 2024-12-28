package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class QueryParameter {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .queryParam("userId", 1)
                .when()
                .get("/posts")
                .then()
                .log().all()
                .statusCode(200)
                .body("[0].userId", equalTo(1)); // Validate filtered response



    }
}
