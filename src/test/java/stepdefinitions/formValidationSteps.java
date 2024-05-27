package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

import static stepdefinitions.TestSetups.baseUrl;
import static stepdefinitions.TestSetups.driver;

public class formValidationSteps {
    @When("I click the login button")
    public void submitEmptyLoginForm() {
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/form/div[3]/button"))
                .click();
    }

    @Then("An error message is displayed saying {string}")
    public void checkErrorMessage(String errorText) throws InterruptedException {

        System.out.println("\n\n\n\nMANUAL CONFIRMATION");
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

    @And("I see the login confirmation")
    public void newUserMsg() {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//Wait for the alert to be displayed and store it in a variable
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//Store the alert text in a variable
        String text = alert.getText();
        System.out.println("\nTHE ALERT TEXT IS: '"+ text+"'");
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","You have successfully logged in!",text);
//Press the OK button
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        alert.accept();
    }
}
