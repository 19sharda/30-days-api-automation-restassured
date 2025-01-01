package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Recap {
    public static void main(String[] args) {
        // Base URL for all requests (JSONPlaceholder API for demo purposes)
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request - Fetch all posts
        try {
            Response getResponse = RestAssured
                .given()
                .get("/posts");
            System.out.println("GET Response: " + getResponse.asPrettyString());
        } catch (Exception e) {
            System.out.println("Error during GET request: " + e.getMessage());
        }

        // POST Request - Add a new post
        try {
            String newPost = "{ \"title\": \"New Year Resolution\", \"body\": \"Learn REST API automation\", \"userId\": 1 }";
            Response postResponse = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(newPost)
                .post("/posts");
            System.out.println("POST Response: " + postResponse.asPrettyString());
        } catch (Exception e) {
            System.out.println("Error during POST request: " + e.getMessage());
        }

        // PUT Request - Update an existing post
        try {
            String updatedPost = "{ \"title\": \"Updated Title\", \"body\": \"REST API mastery\", \"userId\": 1 }";
            Response putResponse = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(updatedPost)
                .put("/posts/1"); // Update post with ID 1
            System.out.println("PUT Response: " + putResponse.asPrettyString());
        } catch (Exception e) {
            System.out.println("Error during PUT request: " + e.getMessage());
        }

        // DELETE Request - Remove a post
        try {
            Response deleteResponse = RestAssured
                .given()
                .delete("/posts/1"); // Delete post with ID 1
            System.out.println("DELETE Response: " + deleteResponse.asPrettyString());
        } catch (Exception e) {
            System.out.println("Error during DELETE request: " + e.getMessage());
        }

        // Basic Authentication - Access restricted data (using reqres.in for demo)
        try {
            RestAssured.baseURI = "https://reqres.in/api";
            Response authResponse = RestAssured
                .given()
                .auth()
                .basic("username", "password") // Replace with valid credentials for actual API
                .get("/users?page=2");
            System.out.println("Authenticated GET Response: " + authResponse.asPrettyString());
        } catch (Exception e) {
            System.out.println("Error during authenticated GET request: " + e.getMessage());
        }
    }
}
