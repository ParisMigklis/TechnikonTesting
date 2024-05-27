package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepdefinitions.TestSetups.driver;

public class HighRiskSteps {
    @And("We signup as new user")
    public void signUp() {
        driver.findElement(By.id(":r1:")).sendKeys("Kendrick");
        driver.findElement(By.id(":r3:")).sendKeys("paobc@euroleague.com");
        driver.findElement(By.id(":r5:")).sendKeys("pao");
        driver.findElement(By.id(":r7:")).sendKeys("pao");
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/form/div[5]/button"))
                .click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        Assert.assertEquals("\nFAILED!!\n", "Sign-up successful!", text);
        alert.accept();

    }

    @And("We login with our new credentials")
    public void login() throws InterruptedException {
        driver.findElement(By.id(":r9:")).sendKeys("paobc@euroleague.com");
        driver.findElement(By.id(":rb:")).sendKeys("pao");
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/form/div[3]/button"));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        Assert.assertEquals("\nFAILED!!\n", "You have successfully logged in!", text);
        alert.accept();

        Thread.sleep(10000);

    }
    @And("We click the create Repair button")
    public void createRepair(){
        driver.findElement(By.xpath("//*[@id=\"scytalis-app\"]/main/div/div/div/button[1]")).click();
    }
}
