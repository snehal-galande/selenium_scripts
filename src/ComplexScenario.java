import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class ComplexScenario {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        Actions actions = new Actions(driver);
        List<WebElement> e = driver.findElements(By.cssSelector("[data-qa=\"meqeqiwiwe\"]"));
        actions.moveToElement(e.get(1)).click().build().perform();
        Thread.sleep(10000);
        Set<String> numOfWindows = driver.getWindowHandles();
        System.out.println("Id of second window is" + numOfWindows);
        for (String windows:numOfWindows) {
            System.out.println(windows);
            if(!windows.equals(parentWindow)){
                driver.switchTo().window(windows);
                driver.switchTo().frame("heatmap-iframe");
                driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
                driver.close();
                break;
            }
        }
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
