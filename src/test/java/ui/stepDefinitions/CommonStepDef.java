package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CommonStepDef {

    @When("I wait {string} seconds")
    public void i_wait_seconds(String string) throws InterruptedException {
        Thread.sleep(Integer.parseInt(string));
    }

    @And("log {string}")
    public void log(String arg0) {
        synchronized (System.out){
            System.out.println(arg0);
        }
    }
}
