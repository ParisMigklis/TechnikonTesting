package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

import static stepdefinitions.TestSetups.driver;

public class signupFormValidation {
    //Click The Sign Up Button
    @When("I click the signup button")
    public void submitSignUpForm() {
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/form/div[5]/button"))
                .click();
    }
    //Fill in a valid Username
    @And("I enter a valid username {string}")
    public void enterValidUsername(String usr){
        driver.findElement(By.id(":r1:")).sendKeys(usr);
    }
    @And("I enter a valid email {string}")
    public void enterValidEmail(String mail) {
        driver.findElement(By.id(":r3:")).sendKeys(mail);
    }
    @And("I enter a pass {string}")
    public void enterPass(String pass){
        driver.findElement(By.id(":r5:")).sendKeys(pass);
    }
    @And("I enter a different pass {string}")
    public void enterDiffPass(String pass){
        driver.findElement(By.id(":r7:")).sendKeys(pass);
    }
    @And("I confirm pass {string}")
    public void confirmPass(String pass){
        driver.findElement(By.id(":r7:")).sendKeys(pass);
    }
    @Then("An  invalid password error message is displayed saying {string}")
    public void passwordsDontMatch(String err){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//Wait for the alert to be displayed and store it in a variable
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//Store the alert text in a variable
        String text = alert.getText();
        System.out.println("\nTHE ALERT TEXT IS: '"+ text+"'");
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","Passwords do not match",text);
//Press the OK button
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
    }

    @And("I see signup confirmation")
    public void successCreation(){
        System.out.println("\n\nUser successfully created!!!");
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//Wait for the alert to be displayed and store it in a variable
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//Store the alert text in a variable
        String text = alert.getText();
        System.out.println("\nTHE ALERT TEXT IS: '"+ text+"'");
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","Sign-up successful!",text);
//Press the OK button
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
    }
}
