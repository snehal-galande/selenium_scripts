import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class VwoScenario {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);
        Actions actions = new Actions(driver);
        List<WebElement> el =driver.findElements(By.cssSelector("[data-qa=\"meqeqiwiwe\"]"));
        actions.moveToElement(el.get(1)).click().build().perform();
        Thread.sleep(1000);
        Set<String> numOfWindows = driver.getWindowHandles();
        System.out.println("Id of second window" + numOfWindows);
        for (String windows:numOfWindows) {
            System.out.println(windows);
            if(!windows.equals(parentWindowId)){
                driver.switchTo().window(windows);
                driver.switchTo().frame("heatmap-iframe");
                driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
                driver.close();
                break;
            }
        }
        driver.switchTo().window(parentWindowId);
        driver.close();
    }
}
