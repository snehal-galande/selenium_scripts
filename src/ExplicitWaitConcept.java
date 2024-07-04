import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitConcept {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("hello moto");
//        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b']")).click();
        clickOn(driver,driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b']")), Duration.ofSeconds(5));
        System.out.println("Element successfully click");
//        driver.close();
    }

    public static void clickOn(WebDriver driver, WebElement locator, Duration timeout){
        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).
                until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }
}
