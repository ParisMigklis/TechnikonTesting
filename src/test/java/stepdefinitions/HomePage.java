package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static stepdefinitions.TestSetups.baseUrl;
import static stepdefinitions.TestSetups.driver;

public class HomePage {

    @Given("The home page is displayed")
    public void getHomePage(){
        driver.get(baseUrl);
    }
    @Then("We can see the title {string}")
    public void getTitleText(){

    }


}
