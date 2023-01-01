package api.baseURI;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class JSONPlaceHoldersBaseURI {

    protected RequestSpecification spec;

    @BeforeTest
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/").build();
    }
}
