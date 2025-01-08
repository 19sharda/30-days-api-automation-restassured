package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Mock {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        Response getResponse = RestAssured.given()
                .baseUri("http://localhost:8080")
                .get("/books");
        System.out.println("GET Response: " + getResponse.asPrettyString());
        String newBook = "{ \"title\": \"Learning WireMock\" }";
        Response postResponse = RestAssured.given()
                .baseUri("http://localhost:8080")
                .header("Content-Type", "application/json")
                .body(newBook)
                .post("/add-book");
        System.out.println("POST Response: " + postResponse.asPrettyString());

    }
}
