package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class practiceDay2 {

  public static void main(String[] args) {

    // Base URI
    RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

    // Make the GET request and store the response
    Response response = given()
      .when()
      .get("/posts/1");

    // Print the raw response body
    System.out.println("Response Body:");
    System.out.println(response.getBody().asPrettyString());

    // Run assertions with proper logging
    try {
      System.out.println("\nRunning assertions...");
      response.then()
        .statusCode(200)
        .body("userId", equalTo(1))
        .body("title", notNullValue());
      System.out.println("Assertions passed successfully!");
    } catch (AssertionError e) {
      System.err.println("One or more assertions failed:");
      System.err.println(e.getMessage());
    }
  }
}
