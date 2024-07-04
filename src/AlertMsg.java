import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMsg {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
//        Alert alertmsg = driver.switchTo().alert();
//        System.out.println(alertmsg.getText());

//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
//        Alert alertmsg2 = driver.switchTo().alert();
//        System.out.println(alertmsg2.getText());
//        alertmsg2.dismiss();

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
        Alert alertmsg3 = driver.switchTo().alert();
        alertmsg3.sendKeys("Snehal");
        alertmsg3.accept();
    }
}
