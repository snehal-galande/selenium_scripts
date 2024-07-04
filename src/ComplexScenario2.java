import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class ComplexScenario2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        String firstWindow = driver.getWindowHandle();
        System.out.println(firstWindow);
        Actions actions = new Actions(driver);
        List<WebElement> element= driver.findElements(By.cssSelector("[data-qa=\"meqeqiwiwe\"]"));
        actions.moveToElement(element.get(1)).click().build().perform();
        Thread.sleep(10000);
        Set<String> secondWindow = driver.getWindowHandles();
        System.out.println("all window id is:" + secondWindow);
        for (String windows:secondWindow) {
            System.out.println(windows);
            if(!windows.equals(firstWindow)){
                driver.switchTo().window(windows);
                driver.switchTo().frame("heatmap-iframe");
                driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
                File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src,new File("D:/Screenshot.png"));
                Thread.sleep(10000);
                driver.close();
                driver.switchTo().window(firstWindow);
                driver.close();
                break;
            }

        }


        //switch to parent window
        //close parent window
    }
}
