package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Header {
    public static void main(String[] args) {
        // Base URI for the API
        baseURI = "https://jsonplaceholder.typicode.com"; // Example public API

        // Example 1: Adding custom headers
        given()
            .header("Custom-Header", "CustomValue") // Adding a custom header
            .header("Content-Type", "application/json") // Adding Content-Type header
        .when()
            .get("/posts/1") // Endpoint for testing
        .then()
            .statusCode(200) // Validate the status code
            .body("id", equalTo(1)) // Check 'id' field in the response
            .log().all(); // Log the response

        // Example 2: Removing a required header
        try {
            given()
                .when()
                .get("/posts/1") // No headers sent
            .then()
                .statusCode(200) // Public API doesn't require headers, so this will pass
                .log().all();
        } catch (Exception e) {
            System.out.println("Error occurred when no headers are sent: " + e.getMessage());
        }
    }
}
