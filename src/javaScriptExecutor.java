import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",button);

        driver.get("https://thetestingacademy.com/");
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebElement ele = driver.findElement(By.xpath("//a[@class='dorik-btn symbol--ji5d8985 dorik-button-c6lxcdd6  ']"));
        js.executeScript("arguments[0].scrollIntoView(true)",ele);
    }
}
