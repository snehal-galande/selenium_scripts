import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class ClickOnCheckbox {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for (WebElement e:checkBox) {                 //to click on non selected checkbox from list of checkbox
//            if(!e.isSelected()){
//                e.click();
//            }
//        }

        WebElement checkBox1 = checkBox.get(0);
        checkBox1.click();                       //to click on first checkbox
    }
}
