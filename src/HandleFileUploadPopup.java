import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {
    public static WebDriver driver;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\Driver\\chromedriver.exe");
        driver  = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        handleGooglePage();
        driver.close();
    }

    public static void handleGooglePage(){
        driver.manage().window().maximize();
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\HellRider\\OneDrive\\Desktop\\Snehal.docx");
        System.out.println("File uploaded successfully");

    }
}

