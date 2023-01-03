package api.tests.theCatAPITests;

import api.baseURI.TheCatAPIBaseURI;
import api.pojo.theCatAPI.getPojo.ResponsePojoAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;

public class GetTestWithAPIKey extends TheCatAPIBaseURI {
    @Test
    public void Test01() {


        //Query Params
        HashMap<String,String> params = new HashMap<>();
        params.put("limit","10");
        params.put("page","0");
        params.put("order","DESC");


        Response response = RestAssured
                .given()
                .spec(spec)
                .header("x-api-key",ConfigReader.getProperty("theCat_api_key"))
                .basePath("images")
                .queryParams(params)
                .when()
                .get()
                .then()
                .log()
                .all()
                .extract().response();

        assertThat(response.getStatusCode(),equalTo(200));
        assertThat(response.contentType(),equalTo("application/json; charset=utf-8"));

        System.out.println("*********************************************");

        ResponsePojoAPI[] responsePojoAPI = response.as(ResponsePojoAPI[].class);


        assertThat(responsePojoAPI.length,equalTo(Integer.parseInt(params.get("limit")))); //the limit's value must be equal to length

        for (ResponsePojoAPI item:responsePojoAPI) {
            assertThat(item.getId(),notNullValue());
            assertThat(item.getApproved(),notNullValue());
            assertThat(item.getBreeds(),notNullValue());
        }



        //to show urls with png
        ArrayList<ResponsePojoAPI> urlListWithPng = new ArrayList<>();

        for(int i = 0;i < responsePojoAPI.length;i++){
            if(responsePojoAPI[i].getUrl().contains("png")){
                urlListWithPng.add(responsePojoAPI[i]);
            }
        }

        assertThat(urlListWithPng,hasSize(2));

        for (ResponsePojoAPI item:urlListWithPng) {
            System.out.println("ID= " + item.getId() + " URL= " + item.getUrl());
        }

        System.out.println("***********************************************************");


        //get the photos between width 500 and height 300
        for (int i = 0; i < responsePojoAPI.length; i++) {
            if(responsePojoAPI[i].getWidth() > 500 && responsePojoAPI[i].getHeight() > 300){
                System.out.println("ID= " + responsePojoAPI[i].getId() + " Width= " + responsePojoAPI[i].getWidth() + " Height= " + responsePojoAPI[i].getHeight());
            }
        }

















    }




}
