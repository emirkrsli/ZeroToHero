package stepDefinitions;

import io.cucumber.java.en.When;

public class CommonStepDef {

    @When("I wait {string} seconds")
    public void i_wait_seconds(String string) throws InterruptedException {
        Thread.sleep(Integer.parseInt(string));
    }
}
