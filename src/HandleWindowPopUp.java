import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class HandleWindowPopUp {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        beforeSetup();
        driver.findElement(By.xpath(Constants.POPUP_FUNCTION_XPATH)).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> i = windows.iterator();
        String parentWindowId = i.next();
        String childWindowId = i.next();
        driver.switchTo().window(childWindowId);
        driver.manage().window().maximize();
        takeScreenShot(Constants.BASE_FILE_XPATH + childWindowId + Constants.PNG_FORMAT);
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(parentWindowId);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
        WebElement element = driver.findElement(By.xpath(Constants.TARGET_XPATH));
        if (element.isDisplayed()) {
            System.out.println("element is present");
            takeScreenShot(Constants.BASE_FILE_XPATH + parentWindowId + Constants.JPG_FORMAT);
        } else {
            System.out.println("elemnt is not present on webpage");
        }
        Thread.sleep(5000);
        driver.close();
    }

    public static void beforeSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Material\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Constants.APPLICATION_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public static void takeScreenShot( String fileName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(fileName));
    }
}
