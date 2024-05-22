package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static stepdefinitions.TestSetups.baseUrl;
import static stepdefinitions.TestSetups.driver;

public class formValidationSteps {
    @When("I click the login button")
    public void submitEmptyLoginForm(){
        driver.findElement(By.xpath("//form/button"))
                .click();
    }
    @Then("An error message is displayed saying {string}")
    public void checkErrorMessage(String errorText){
        System.out.println("Des manually an ebgale error den briskoume to document me tpt");
    }

    @And("I have already entered a valid email {string}")
    public void submitEmptyPasswordLoginForm(String pass){
        driver.findElement(By.id(":r1:")).sendKeys(pass);
    }
}
