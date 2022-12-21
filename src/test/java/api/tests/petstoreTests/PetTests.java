package api.tests.petstoreTests;

import api.baseURI.PetstoreBaseURI;
import api.pojo.PetPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PetTests extends PetstoreBaseURI {

    @Test
    public void postPet() throws JsonProcessingException {
        PetPojo bodyPojo = new PetPojo();
        bodyPojo.setCategoryId(1);
        bodyPojo.setCategoryName("dogs");
        bodyPojo.setId(52);
        bodyPojo.setName("bulent");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bodyPojo);

        Response response = RestAssured.given().
                        spec(spec).
                        body(json).
                        pathParam("first", "pet").
                        contentType(ContentType.JSON)
                .when().
                        post("/{first}")
                .then().
                        log().all().
                        extract().response();
    }

    @Test
    public void getPet(){
        Response response =
                            RestAssured.
                                        given().
                                            spec(spec).
                                            basePath("/pet/52").
                                            accept("application/json").
                                            contentType(ContentType.JSON).
                                        when().
                                            get().
                                        then().
                                            log().
                                            all().
                                            extract().
                                            response();
    }

    @Test
    public void deletePet(){
        Response response = RestAssured.
                                        given().
                                            spec(spec).
                                            basePath("/pet/52").
                                        when().
                                            delete().
                                        then().
                                            log().
                                            all().
                                            extract().
                                            response();
    }
}
