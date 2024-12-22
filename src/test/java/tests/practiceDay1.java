package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class practiceDay1 { // Ensure class name matches the file name
    public static void main(String[] args) {
        Response response = RestAssured.get("https://lnkd.in/gRN3y5UK");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
