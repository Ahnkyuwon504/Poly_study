package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      SeleniumTest selTest = new SeleniumTest();
      selTest.crawl();
   }
   
   private WebDriver driver;
   public String base_url;
   
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:\\Users\\안규원\\Desktop\\selenium\\chromedriver.exe";
   
   public SeleniumTest() {
       super();
       System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
       driver = new ChromeDriver();
       base_url = "https:\\www.naver.com";
    }
    
   
   
   public void crawl() {
       
       try {
          driver.get(base_url);
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).sendKeys("폴리텍");
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("/html/body")).click();
          System.out.println(driver.getPageSource());
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
           //driver.close();
       } 
    }
    
}
