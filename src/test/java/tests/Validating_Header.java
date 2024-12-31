package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Validating_Header {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .when()
                .get("/posts/1")
                .then()
                .log().headers()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Cache-Control", "no-cache");
    }
}