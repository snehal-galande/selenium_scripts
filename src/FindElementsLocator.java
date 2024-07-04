import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class FindElementsLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        List<String> stringList = Arrays.asList("Collectibles & art",
                "Electronics",
                "Fashion",
                "Home & garden",
                "Auto Parts & Accessories",
                "Musical instruments & gear",
                "Sporting goods",
                "Toys & hobbies",
                "Other categories",
                "See all categories");
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.findElement(By.id("gh-shop-a")).click();
        List<WebElement> list = driver.findElements(By.xpath("//h3[@class='gh-sbc-parent']/a"));
        for (WebElement ele : list) {
            if (stringList.contains(ele.getText())) {
                System.out.println(ele.getText() + " present in list");
            }else{
                System.out.println(ele.getText() + " not present in list");
            }
        }
        driver.quit();
    }
}
