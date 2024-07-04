import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        String firstWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle:windowHandles) {
            driver.switchTo().window(handle);
        }
        driver.switchTo().window(firstWindowHandle);
    }
}
