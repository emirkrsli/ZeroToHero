package api.tests.dummyRestAPITests;

import api.baseURI.DummyRestAPIBaseURI;
import api.pojo.DummyRestAPI.PostPojo.RequestPojo;
import api.pojo.DummyRestAPI.PostPojo.ResponsePojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostUsers extends DummyRestAPIBaseURI {

    @Test
    public void Test01(){
        RequestPojo requestPojo = new RequestPojo();
        requestPojo.setName("emirhan");
        requestPojo.setAge("21");
        requestPojo.setSalary("5000");


        Response response = RestAssured.given()
                .spec(spec)
                .basePath("create")
                .body(requestPojo)
                .when()
                .post()
                .then()
                .log()
                .all()
                .extract().response();
        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        Assert.assertEquals(responsePojo.getStatus(),"success");

    }




}
