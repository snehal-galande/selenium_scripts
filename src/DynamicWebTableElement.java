import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTableElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();
        int col = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th")).size();
        System.out.println(col);
        int row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")).size();
        System.out.println(row);

//        String xpath = "//table[@class='tsc_table_s13']/tbody/tr[2]/th";
//        String text = driver.findElement(By.xpath(xpath)).getText();
//        if(text.contains("Clock Tower Hotel")){
//            System.out.println(text);
//            List<WebElement> element = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + 2 + "]/td"));
//            for (WebElement e:element) {
//                System.out.println(e.getText());
//            }
//        }

        for (int i = 1;i<=row;i++){
           String Xpath = "//table[@class='tsc_table_s13']/tbody/tr[" + i + "]/th";
           String text = driver.findElement(By.xpath(Xpath)).getText();

            if(text.contains("Clock Tower Hotel")){
                System.out.println(text);
                List<WebElement> element = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + i + "]/td"));
                for (WebElement e:element) {
                    System.out.println(e.getText());
                }
            }
        }
        driver.close();
    }
}
