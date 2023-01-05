package api.tests.theCatAPITests;

import api.baseURI.TheCatAPIBaseURI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTest extends TheCatAPIBaseURI {

    @Test
    public void Test01(){
        Response response = RestAssured
                .given()
                .spec(spec)
                .basePath("images/search")
                .queryParam("size","full")
                .when()
                .get()
                .then()
                .log()
                .all()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(),200);
    }


}
