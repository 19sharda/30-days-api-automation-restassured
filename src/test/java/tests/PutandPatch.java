package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PutandPatch {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .header("Content-Type", "application/json")
                .body("{\"title\":\"Updated Title\",\"body\":\"Updated Content\",\"userId\":1}")
                .when()
                .put("/posts/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("title", equalTo("Updated Title"));

        // PATCH Request: Update specific fields
        given()
                .header("Content-Type", "application/json")
                .body("{\"title\":\"Partially Updated Title\"}")
                .when()
                .patch("/posts/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("title", equalTo("Partially Updated Title"));

    }
}
