import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionProgram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement fromInput= driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromInput).click().perform();
        actions.sendKeys(fromInput,"DEL").build().perform();

        WebElement toInput = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));
        actions.moveToElement(toInput).click().perform();
        actions.sendKeys(toInput, "MUM").build().perform();

    }
}
