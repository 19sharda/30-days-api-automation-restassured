package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Delete {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .when()
                .delete("/posts/1")
                .then()
                .log().all()
                .statusCode(200); // Or 204 for successful deletion


    }
}
