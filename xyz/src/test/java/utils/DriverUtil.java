package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverUtil {

    public static WebDriver setupChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriverWait setupExplicitWait(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.ignoring(StaleElementReferenceException.class);
        return wait;
    }
}
