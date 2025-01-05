package tests;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Filter {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .filter(new RequestLoggingFilter())  // Logs requests
                .filter(new ResponseLoggingFilter()) // Logs responses
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200);

    }
}
