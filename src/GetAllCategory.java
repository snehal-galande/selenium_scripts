import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GetAllCategory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-shop-a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[@class='gh-sbc-parent']/a[@id='gh-shop-see-all']")).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
        String text = driver.findElement(By.xpath("//div[contains(@class,'all-categories-left-nav-container')]/h1")).getText();
        System.out.println(text);
        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'all-categories-left-nav-container')]/ul/li/a"));
        for (WebElement e:elements) {
            e.click();
        }
        driver.quit();
    }
}
