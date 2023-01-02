package api.tests.dummyRestAPITests;

import api.baseURI.DummyRestAPIBaseURI;
import api.pojo.DummyRestAPI.GetPojo.DummyRestAPIPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetEmployees extends DummyRestAPIBaseURI {

    @Test
    public void Test01() {
        Response response =
                RestAssured.given()
                        .spec(spec)
                        .basePath("employees")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all().extract().response();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.getContentType(),"application/json");


        DummyRestAPIPojo dummyRestAPIPojo = response.as(DummyRestAPIPojo.class);
        
        Assert.assertEquals(dummyRestAPIPojo.getStatus(),"success");
        Assert.assertEquals(dummyRestAPIPojo.getMessage(),"Successfully! All records has been fetched.");

        Assert.assertEquals(dummyRestAPIPojo.getData().size(),24); // Must be 24 users

        //System.out.println(dummyRestAPIPojo.getData().get(0)); //Show the data of first user

        for(int i =0;i < dummyRestAPIPojo.getData().size();i++) {
            Assert.assertNotNull(dummyRestAPIPojo.getData().get(i).getEmployee_name());
            Assert.assertNotNull(dummyRestAPIPojo.getData().get(i).profile_image);
            Assert.assertTrue(dummyRestAPIPojo.getData().get(i).employee_age > 0);
            Assert.assertTrue(dummyRestAPIPojo.getData().get(i).employee_salary > 0);
            Assert.assertTrue(dummyRestAPIPojo.getData().get(i).id > 0);

        }

    }

}
