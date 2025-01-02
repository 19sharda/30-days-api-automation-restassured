package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class ResponseTime {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .when()
                .get("/posts/1")
                .then()
                .log().all()
                .time(lessThan(2000L)); // Ensure response time is under 2 seconds


    }
}
