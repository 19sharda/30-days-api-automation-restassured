package tests;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonValidation {
    public static void main(String[] args) {
        baseURI = "https://jsonplaceholder.typicode.com";
        String response = given()
                .when()
                .get("/posts/1")
                .then()
                .extract().asString();
// Extract and validate fields using JSONPath
        int userId = JsonPath.from(response).getInt("userId");
        String title = JsonPath.from(response).getString("title");

        System.out.println("User ID: " + userId);
        System.out.println("Title: " + title);
        assertEquals(userId, 1);
        assertEquals(title, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");


    }
}
