package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSetups {
    public static WebDriver driver;
    public static String baseUrl="http://localhost:5173";

    @Before
    public void setup(){
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        driver.manage().window().maximize(); //maximize the window for better view
        System.out.println("\n\nThe test has Started");
    }

    @After
    public void tearDown(){
        //driver.quit();
    }
}
