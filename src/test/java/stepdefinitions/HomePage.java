package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepdefinitions.TestSetups.*;

public class HomePage {

    @Given("The home page is displayed")
    public void getHomePage() {
        driver.get(baseUrl);
    }

    @Then("We can see the title {string}")
    public void getTitleText(String expTitle) {
        String title = driver.findElement(By.tagName("h4")).getText();
        Assert.assertEquals("Page title is incorrect", title, expTitle);
    }

    @When("We click on the login button")
    public void clickHomePageLoginButton() {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/a[1]"))
                .click();
    }

    @Then("We get transferred to the login page")
    public void validateLoginPage(){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), loginUrl);
    }

    @When("We click on the signup button")
    public void clickHomePageSignUpButton(){
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/a[2]"))
                .click();
    }

    @Then("We get transferred to the signup page")
        public void validateSignupPage(){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), signupUrl);
    }

}
