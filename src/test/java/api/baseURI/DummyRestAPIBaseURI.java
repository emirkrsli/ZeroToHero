package api.baseURI;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class DummyRestAPIBaseURI {
    protected RequestSpecification spec;

    @BeforeTest
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://dummy.restapiexample.com/api/v1/").build();
    }


}
