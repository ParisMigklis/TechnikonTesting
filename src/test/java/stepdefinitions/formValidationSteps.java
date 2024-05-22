package stepdefinitions;

import io.cucumber.java.bs.A;
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
    public void submitEmptyLoginForm() {
        driver.findElement(By.xpath("//form/button"))
                .click();
    }

    @Then("An error message is displayed saying {string}")
    public void checkErrorMessage(String errorText) {
        System.out.println("Des manually an ebgale error den briskoume to document me tpt");
    }

    //Edw vazoume legit email
    @And("I have already entered a valid email {string}")
    public void submitEmptyPasswordLoginForm(String pass) {
        driver.findElement(By.id(":r1:")).sendKeys(pass);
    }

    //Edw vazoume invalid email
    @And("I enter an invalid e-mail {string}")
    public void enterInvalidEmail(String invalidEmail) {
        driver.findElement(By.id(":r1:")).sendKeys(invalidEmail);
    }

    //Edw vazoume password sto field
    @And("I enter a password {string}")
    public void enterPassword(String pass) {
        driver.findElement(By.id(":r3:")).sendKeys(pass);
    }
    @Then("A new user is created")
    public void newUserMsg(){
        System.out.println("Gia thn wra to exoume edw otan ftiaxtei tha valoume assertion");
    }
}
