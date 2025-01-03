package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {

    // Setting the base URI for RestAssured
    static {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    // DataProvider to supply test data to the test method
    @DataProvider(name = "testData")
    public Object[][] createTestData() {
        return new Object[][]{
                {1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"},
                {2, "et ea vero quia laudantium autem"}
        };
    }

    // Test method that consumes the data provided by the DataProvider
    @Test(dataProvider = "testData")
    public void testWithMultipleData(int userId, String expectedTitle) {
        given()
            .queryParam("userId", userId)
            .when()
            .get("/posts")
            .then()
                .log().all()
            .body("[0].title", equalTo(expectedTitle));
    }
}
