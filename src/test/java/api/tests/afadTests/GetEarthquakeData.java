package api.tests.afadTests;

import api.baseURI.AfadBaseURI;
import api.pojo.DepremPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetEarthquakeData extends AfadBaseURI {


    @Test
    public void Test01() {

        Response response =
                RestAssured.given()
                        .spec(spec)
                        .queryParams("start", "2022-12-29 10:00:00", "end", "2022-12-29 11:00:00")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all().extract().response();

        DepremPojo[] depremPojo = response.as(DepremPojo[].class);

        ArrayList<DepremPojo> rmsDeger = new ArrayList<>();

//        for (int i = 0; i < depremPojo.length; i++) {
//            if (Double.parseDouble(depremPojo[i].getRms()) >= 0.8) {
//                rmsDeger.add(depremPojo[i]);
//                System.out.println("\n");
//                System.out.println(depremPojo[i] + "\n");
//
//            }
//        }


    }
}
