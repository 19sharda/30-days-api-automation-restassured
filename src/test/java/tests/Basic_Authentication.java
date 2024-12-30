package tests;

import static io.restassured.RestAssured.*;

public class Basic_Authentication {
    public static void main(String[] args) {
        given()
                .auth()
                .basic("username", "password")
                .when()
                .get("https://httpbin.org/basic-auth/username/password")
                .then()
                .log().all()
                .statusCode(200);
    }
}