import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class KatalonProject {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='combo_facility']/option[2]"));
        driver.findElement(By.id("chk_hospotal_readmission")).click();
        driver.findElement(By.xpath("//input[@value='Medicaid']")).click();
        driver.findElement(By.id("txt_visit_date")).sendKeys("11/11/2023");
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("I want an appointment");
        driver.findElement(By.id("btn-book-appointment")).click();
        takeScreenshot(driver, "p:/Selenium Material/appointment.png");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Go to Homepage')]")).click();
    }


    //method
    public static void takeScreenshot(WebDriver driver, String fileName){
        try {
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File(fileName));
        } catch (IOException e) {
            System.out.println("exception occurs due to " + e.getMessage());
        }
    }
}
