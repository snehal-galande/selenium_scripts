import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigation {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com/");
        //driver.navigate().to("https://www.amazon.com/ref=nav_logo");
        //driver.navigate().to("https://www.google.com/");
        driver.navigate().to(new URL("https://www.google.com/"));
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
