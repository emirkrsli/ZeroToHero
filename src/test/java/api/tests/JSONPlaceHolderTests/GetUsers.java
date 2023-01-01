package api.tests.JSONPlaceHolderTests;

import api.baseURI.JSONPlaceHoldersBaseURI;
import api.pojo.JSONPlaceHolder.UserPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetUsers extends JSONPlaceHoldersBaseURI {

    @Test
    public void Test01() {
        Response response =
                RestAssured.given()
                        .spec(spec)
                        .basePath("users")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.getContentType(),"application/json; charset=utf-8");

        System.out.println("*********************************************************************");

        UserPojo[] userPojo = response.as(UserPojo[].class);

        //Check the length of users
        System.out.println("Asserting length of users");
        Assert.assertEquals(userPojo.length,10);
        System.out.println("Assertion successfull");


        //Verify that there is no empty data
        for (UserPojo item: userPojo) {
            Assert.assertNotNull(item.getAddress());
            Assert.assertNotNull(item.getName());
            Assert.assertNotNull(item.getCompany());
            Assert.assertNotNull(item.getEmail());
            Assert.assertNotNull(item.getId());
            Assert.assertNotNull(item.getPhone());
            Assert.assertNotNull(item.getPhone());
        }


        System.out.println("***********************************************************************");
        //To show the address information of each user and assertion
        for (UserPojo item : userPojo) {
            Assert.assertNotNull(item.getAddress());
            System.out.println(item.getName() + "= " + item.getAddress());
        }

        System.out.println("*****************************************************************");




        //We can check with latitude that which part of america user lives
        ArrayList<UserPojo> latList = new ArrayList<>();

        for(int i = 0;i < userPojo.length;i++){
            if(Double.parseDouble(userPojo[i].getAddress().geo.getLat()) > 26){
                latList.add(userPojo[i]);
            }
        }
        for (UserPojo w: latList) {
            System.out.println(w.getName() + " " +  w.getAddress().getGeo() + " lives in South America.");
        }

        System.out.println("************************************************");

    }

}
