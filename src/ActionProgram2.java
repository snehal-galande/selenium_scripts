import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionProgram2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String str = driver.findElement(By.xpath("//span[contains(text(),'From')]")).getText();
        if(str.equalsIgnoreCase("from")){
            System.out.println(str + "String is match");
        }else {
            System.out.println("String is not match");
        }
        WebElement fromCity = driver.findElement(By.id("fromCity"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("New Delhi").build().perform();
//        actions.moveToElement(fromCity).click().perform();
//        actions.sendKeys(fromCity, "MUMBAI").build().perform();
        List<WebElement> cityList = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

        for (WebElement e:cityList) {
            if(e.getText().contains("New Delhi"))
            {
                System.out.println(e.getText());
                e.click();
                break;
            }
        }

        // Click on the "Departure Date" input field
//        WebElement departureDateInput = driver.findElement(By.id("departure"));
//        departureDateInput.click();
//
//        // Replace "DD" and "MM" with the actual day and month you want to select
//        String dayToSelect = "06";
//        String monthToSelect = "NOV";
//
//        // Locate and click the desired day in the date picker
//        By dayLocator = By.xpath("//div[@class='DayPicker-Day' and @aria-label='" + dayToSelect + " " + monthToSelect + "']");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(dayLocator));
//        dayElement.click();


        WebElement departureDateInput = driver.findElement(By.id("departure"));

        // Replace "DD" and "MM" with the actual day and month you want to select
        String dayToSelect = "10";
        String monthToSelect = "NOV";

        // Set the value of the input field directly using JavaScript
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].setAttribute('value', arguments[1])", departureDateInput, dayToSelect + " " + monthToSelect);


//        driver.close();
    }

}
