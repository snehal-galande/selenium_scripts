import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement searchButton = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        try{
            driver.navigate().refresh();
            searchButton.sendKeys("The testing academy"+ Keys.RETURN);
        }catch (StaleElementReferenceException ex1){
            System.out.println("Stale element found");
            WebElement searchButton2 = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
            searchButton2.sendKeys("The testing academy"+ Keys.RETURN);
        }
    }
}
