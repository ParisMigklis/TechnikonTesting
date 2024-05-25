package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static stepdefinitions.TestSetups.*;

public class CommonSteps {
    @Given("The login form is displayed")
    public void getLoginForm(){
        driver.get(baseUrl + "/login");
        String headerText =  driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","Login",headerText);
    }
    @Given("The signup form is displayed")
    public void getSignupForm(){
        driver.get(baseUrl + "/signup");
        String headerText =  driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","Sign Up",headerText);
    }
    @Given("The home page is displayed")
    public void getHomePage() {
        driver.get(baseUrl);
    }
    @Then("We are at the {string} page")
    public void validatePage(String endpoint){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), baseUrl+ endpoint);
        //System.out.println(driver.getCurrentUrl());
    }

    @Then("We get transferred to the owner page")
    public void validateOwnerpage(){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), ownerUrl);
    }
}
