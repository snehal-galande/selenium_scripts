import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-shop-a")).click();
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Collectibles & art')]"));
        if(element.getText().equals("Collectibles & art"))
            System.out.println("String is match");
        else
            System.out.println("String does not match");
    }
}
