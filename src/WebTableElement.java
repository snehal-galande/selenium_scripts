import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();
        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println(rows);
        int cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
        System.out.println(cols);
//        List<WebElement> element2= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
//        System.out.println(element2.size());
//        for (WebElement e:element2) {
//            System.out.println(e.getText());
//        }


//table[@id='customers']/tbody/tr[7]/td[2]

        String fitst = "//table[@id='customers']/tbody/tr[";
        String middale = "]/td[";
        String last = "]";

//        String text = driver.findElement(By.xpath(fitst + 2 + middale + 3 + last)).getText();
//        System.out.println(text);

        for (int i = 2; i<=rows; i++){
            for (int j = 1; j <= cols; j ++) {
                String dynamicXpath = fitst + i + middale + j + last;
                String text = driver.findElement(By.xpath(dynamicXpath)).getText();
                //System.out.println(text);--------------print all element in table
                if(text.equals("Amazon")){
                    System.out.println(text);
                    String newXpath = dynamicXpath + "/following-sibling::td[2]";
//                    String name = driver.findElement(By.xpath(newXpath)).getText();
                    String webElement = driver.findElement(By.xpath(newXpath)).getText();
                    System.out.println(webElement);
                }

            }
        }
        driver.quit();
    }
}
