import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        try{
            driver.findElement(By.xpath("//div[@class='ename']"));
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------------------------------------");
         try{
             driver.switchTo().frame(10);
         }catch (NoSuchFrameException ex){
             //System.out.println(ex.getMessage());
             ex.printStackTrace();
         }



//        int a = 10;
//        int b = 0;
////        int c = a / b;
////        System.out.println(c);
//        try {
//            int c = a / b;
//            System.out.println(c);
//        }catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Hello");
//
    }
}
