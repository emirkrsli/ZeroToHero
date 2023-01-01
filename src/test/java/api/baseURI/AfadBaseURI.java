package api.baseURI;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class AfadBaseURI {


    protected RequestSpecification spec;

    @BeforeTest
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://deprem.afad.gov.tr/apiv2/event/filter").build();
    }






}
