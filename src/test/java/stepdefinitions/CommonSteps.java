package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;

import static stepdefinitions.TestSetups.baseUrl;
import static stepdefinitions.TestSetups.driver;

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
}
