package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Upload_Download {
    public static void main(String[] args) throws IOException {
        baseURI = "https://jsonplaceholder.typicode.com";
        File file = new File("path");

        Response response = RestAssured.given()
                .multiPart("file", file)
                .formParam("userId", "12345")
                .post("/upload")
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("Response: " + response.asString());


        Response response1 = RestAssured.given()
                .get("/download/sample.pdf")
                .then()
                .statusCode(200)
                .extract().response();

        byte[] fileContent = response1.asByteArray();
        File outputFile = new File("downloaded_sample.pdf");
        FileOutputStream fos = new FileOutputStream(outputFile);
        fos.write(fileContent);
        fos.close();

        System.out.println("File saved at: " + outputFile.getAbsolutePath());


    }
}
