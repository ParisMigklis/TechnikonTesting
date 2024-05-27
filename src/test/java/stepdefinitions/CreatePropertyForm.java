package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepdefinitions.TestSetups.baseUrl;
import static stepdefinitions.TestSetups.driver;

public class CreatePropertyForm {
    @And("We click the create property button")
    public void clickCreateProperty() throws InterruptedException {

//        Thread.sleep(1200);
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/button[1]")).click();
    }

    @Then("We are at the create Property form")
    public void validateTheForm(){
            String headerText = driver.findElement(By.tagName("h4")).getText();
            Assert.assertEquals("\nABORT IT'S A TRAP!!\n", "Property Actions", headerText);
    }
    @And("We fill the property E9 {string}")
    public void fillE9(String e9){
        driver.findElement(By.id(":r5:")).sendKeys(e9);
    }
    @And("We fill the property Address {string}")
    public void fillAddress(String addy){
        driver.findElement(By.id(":r7:")).sendKeys(addy);
    }
    @And("We fill the property Year {string}")
    public void fillYear(String year){
        driver.findElement(By.id(":r9:")).sendKeys(year);
    }
    @And("We fill Type as a {string}")
    public void fillType(String type){
     WebElement clickDropdown = driver.findElement(By.xpath("//form/div[4]"));
        clickDropdown.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> clickDropdown.isDisplayed());
        WebElement typeOfProperty = driver.findElement(By.xpath("//*[@id=\":rd:\"]/li[2]"));
        typeOfProperty.click();
    }
    @And("We fill the URL as {string}")
    public void fillURL(String xurl){
        driver.findElement(By.id(":rf:")).sendKeys(xurl);
    }
    @And("We fill the property Latitude {string}")
    public void fillLatitude(String year){
        driver.findElement(By.id(":rh:")).sendKeys(year);
    }
    @And("We fill the property Longitude {string}")
    public void fillLongitude(String year){
        driver.findElement(By.id(":rj:")).sendKeys(year);
    }
    @When("We click the submit button to create a property")
    public void clickSubmit(){
        driver.findElement(By.xpath("//*[@id=\"scytalis-app\"]/main/div/div/div/form/div[8]/button")).click();
    }
    @And("We get a confirmation that the property was created")
    public void propertyConfirmation(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//Wait for the alert to be displayed and store it in a variable
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//Store the alert text in a variable
        String text = alert.getText();
        System.out.println("\nTHE ALERT TEXT IS: '"+ text+"'");
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","Property created!",text);
//Press the OK button
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
    }
    @Then("We get a confirmation that the repair was created")
    public void repairConfirmation(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//Wait for the alert to be displayed and store it in a variable
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//Store the alert text in a variable
        String text = alert.getText();
        System.out.println("\nTHE ALERT TEXT IS: '"+ text+"'");
        Assert.assertEquals("\nABORT IT'S A TRAP!!\n","Repair created!",text);
//Press the OK button
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
    }
    @Then("We are shown the property status")
    public void propertyStatus() throws InterruptedException {
        Thread.sleep(3000);
    }
    @And("We fill the repair date")
    public void repairDate() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\":rl:\"]")).sendKeys("2/7/2025");
    }
    @And("We fill the repair description")
    public void smallDesc(){
        driver.findElement(By.xpath("//*[@id=\":rn:\"]")).sendKeys("PAO OLE");
    }
    @When("We click the submit button to create a repair")
    public void clickSubmitRepair(){
        driver.findElement(By.xpath("//*[@id=\"scytalis-app\"]/main/div/div/form/button[1]")).click();
    }

    @And("We fill the repair type")
    public void typeOfRepair() {
          driver.findElement(By.xpath("//*[@id=\":rp:\"]")).click();
          driver.findElement(By.xpath("//*[@id=\":rr:\"]/li[1]")).click();
    }
    @And("We fill the repair status")
    public void StatusOfRepair() {
        driver.findElement(By.xpath("//*[@id=\":rt:\"]")).click();
        driver.findElement(By.xpath("//*[@id=\":rv:\"]/li[1]")).click();
    }

    @And("We fill the repair cost")
    public void repairCost(){
        driver.findElement(By.xpath("//*[@id=\":r11:\"]")).sendKeys("150");
    }
    @And("We fill the repair Description Text")
    public void descriptionText(){
        driver.findElement(By.xpath("//*[@id=\":r13:\"]")).sendKeys("O Panathinaikos einai prwtathliths Eurwphs gia 7h fora!!*******!!");
    }
    @And("We fill the repair property ID")
    public void repairPropertyId(){
        driver.findElement(By.xpath("//*[@id=\":r15:\"]")).sendKeys("11345678910");
    }
}
