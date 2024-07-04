import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();
        int column = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th")).size();
        System.out.println(column);

        int row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th")).size();
        System.out.println(row);
        String text = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]/th")).getText();
        System.out.println(text);

    }
}
