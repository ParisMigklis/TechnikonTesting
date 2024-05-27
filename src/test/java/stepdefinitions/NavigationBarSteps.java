package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static stepdefinitions.TestSetups.*;

public class NavigationBarSteps {
    @Given("The navigation bar is displayed")
    public void navBar(){
        driver.get(baseUrl);
        String headerText =  driver.findElement(By.tagName("a")).getText();
        Assert.assertEquals("\nNAV BAR NOT FOUND!!\n","HOME",headerText);
    }
    @When("We click on the navigation login button")
    public void clickLogin(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/a[7]")).click();
    }
    @When("We click on the navigation signup button")
    public void clickSignup(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/a[6]")).click();
    }
    @When("We click the repairs button")
    public void clickRepairs(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/a[5]")).click();
    }
    @When("We click the properties button")
    public void clickProperties(){
        driver.findElement(By.xpath("//*[@id=\"scytalis-app\"]/div/header/div/a[4]")).click();
    }
    @When("We click the owner button")
    public  void clickOwnerButton(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/a[3]"))
                .click();
    }
    @When("We click the admin button")
    public  void clickAdminButton(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/a[2]"))
                .click();
    }
    @When("We click on the navigation home button")
    public  void clickHomeButton(){
        driver.findElement(By.xpath("/html/body/div/div/div/header/div/a[1]"))
                .click();
    }
}
