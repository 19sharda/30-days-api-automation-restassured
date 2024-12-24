package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class practiceDay4 {
    public static void main(String[] args) {
        // Base URI for the API
        baseURI = "https://jsonplaceholder.typicode.com";

        // Send POST request to create a new post
        given()
            .header("Content-Type", "application/json") // Set the content type to JSON
            .body("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}") // Define request body
            .log().all() // Log request details
        .when()
            .post("/posts") // Specify the endpoint for creating posts
        .then()
            .log().all() // Log response details
            .statusCode(201) // Validate that the server responds with a 201 status code (resource created)
            .body("title", equalTo("foo")) // Verify that the title is 'foo'
            .body("userId", equalTo(1)); // Verify that the userId is 1
    }
}
