package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ChainReq {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        // Step 1: Create a new resource and extract its ID
        int postId = given()
                .header("Content-Type", "application/json")
                .body("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}")
                .when()
                .post("/posts")
                .then()
                .log().all()
                .statusCode(201)
                .extract().path("id");

// Step 2: Use the extracted ID in a GET request
        given()
                .pathParam("id", postId)
                .when()
                .get("/posts/{id}")
                .then()
                .log().all()
                .statusCode(200)
                .body("title", equalTo("foo"));

    }
}
