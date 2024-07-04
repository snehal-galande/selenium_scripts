import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) {
        setUpBrowser();
        boolean isPresent = checkButtonIsPresent(driver);
        if(isPresent) {
            registerButtonIsDisable(driver);
            registerForm(driver);
            registerButtonIsDisable(driver);
        }
        driver.quit();
    }

    public static void setUpBrowser(){
//        System.setProperty("webdriver.chrome.driver","D:\\Selenium Material\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
    }

    public static boolean checkButtonIsPresent(WebDriver driver){
        String registerButton = "register";
        try {
            driver.findElement(By.linkText(registerButton));
            System.out.println("Element with text '" + registerButton + "' is present on the webpage.");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Element with text '" + registerButton + "' is not present on the webpage.");
            return false;
        }
    }

    public static void registerForm(WebDriver driver){
        driver.findElement(By.linkText("register")).click();
        driver.findElement(By.id("personalaccount-radio")).click();
        driver.findElement(By.name("firstname")).sendKeys("Snehal");
        driver.findElement(By.name("lastname")).sendKeys("rokade");
        driver.findElement(By.name("Email")).sendKeys("snehalgalande11@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Chikku@153");
        driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
    }

   public static void registerButtonIsDisable(WebDriver driver){
       try {
           driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT"));
           System.out.println("Register button is enabled on webpage");
       }catch (NoSuchElementException ex){
           System.out.println("Register button is disabled on webpage");
       }
   }
}