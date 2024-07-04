import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.desktop.SystemEventListener;

public class AlertPopUpHandle {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());


        String str = alert.getText();
        if(str.equals("Please enter a valid user name")){
            System.out.println("Correct string");
        }
        else {
            System.out.println("Incorrect string");
        }

        alert.accept();

    }
}
