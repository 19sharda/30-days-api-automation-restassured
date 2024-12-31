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

        Runtime runtime = Runtime.getRuntime();

        // Log initial memory usage
        System.out.println("Initial Memory (bytes):");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
        System.out.println("Max Memory: " + runtime.maxMemory());

        // Simulate some work
        for (int i = 0; i < 100000; i++) {
            String str = "Test " + i;
        }

        // Log memory usage after work
        System.out.println("\nMemory after some work:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
        System.out.println("Max Memory: " + runtime.maxMemory());

        // Trigger Garbage Collection and log again
        System.gc();

        System.out.println("\nMemory after Garbage Collection:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

    }
}