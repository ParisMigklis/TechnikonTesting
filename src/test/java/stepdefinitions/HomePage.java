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

    @Then("We get transferred to the {string} page")
    public void validatePage(String endpoint){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), baseUrl+ endpoint);
        //System.out.println(driver.getCurrentUrl());
    }

    @When("We click on the signup button")
    public void clickHomePageSignUpButton(){
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/a[2]"))
                .click();
    }

//    @Then("We get transferred to the signup page")
//        public void validateSignupPage(){
//        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), signupUrl);
//        //System.out.println(driver.getCurrentUrl());
//    }

    @When("We click the admin button")
        public  void clickAdminButton(){
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/a[1]"))
                .click();
    }

    @Then("We get transferred to the admin page")
       public void validateAdminpage(){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), adminUrl);
    }

    @When("We click the owner button")
    public  void clickOwnerButton(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/div[3]/a"))
                .click();
    }

    @Then("We get transferred to the owner page")
    public void validateOwnerpage(){
        Assert.assertEquals("Url not expected",driver.getCurrentUrl(), ownerUrl);
    }
}
