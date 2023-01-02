package api.tests.fakeRestAPI;

import api.baseURI.ActivitiesBaseURI;
import api.pojo.fakeRestAPI.getPojo.ResponsePojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetActivities extends ActivitiesBaseURI {


    @Test
    public void Test01() {


        Response response =
                RestAssured.given()
                        .spec(spec)
                        .basePath("Activities")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        Assert.assertEquals(response.getStatusCode(),200);

        System.out.println("******************************************************************");

        ResponsePojo[] responsePojo = response.as(ResponsePojo[].class);

        //Verify that there is no empty data
        for (ResponsePojo item:responsePojo) {
            Assert.assertTrue(item.getId() > 0);
            Assert.assertNotNull(item.getDueDate());
            Assert.assertNotNull(item.getTitle());
        }



        //Getting the false completed items
        ArrayList<ResponsePojo> falseList = new ArrayList<>();
        for(int i = 0;i<responsePojo.length;i++){
            if(!responsePojo[i].isCompleted()){
                falseList.add(responsePojo[i]);
            }
        }

        for(ResponsePojo item:falseList){
            System.out.println("ID= " + item.getId() + " " + item.completed);
        }

        System.out.println("***********************************************************");



        //Getting the true completed items
        ArrayList<ResponsePojo> trueList = new ArrayList<>();

        for(int i = 0;i < responsePojo.length;i++){
            if(responsePojo[i].isCompleted()){
                trueList.add(responsePojo[i]);
            }
        }

        for (ResponsePojo item:trueList) {
            System.out.println("ID= " + item.getId() + " " + item.isCompleted());
        }

        System.out.println("*************************************************");


        //Checking the every title has  word "Activity"
        for(ResponsePojo item:responsePojo){
            Assert.assertTrue(item.getTitle().contains("Activity"));
        }

    }



}