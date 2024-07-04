import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrameConcept2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/mmoonn/full/PwvraE");
        driver.manage().window().maximize();
        driver.switchTo().frame("result");
        Actions actions = new Actions(driver);
        WebElement e = driver.findElement(By.xpath("//div[@class='box']"));
        actions.moveToElement(e).build().perform();
    }
}
