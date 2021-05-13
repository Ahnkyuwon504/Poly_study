package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      SeleniumTest2 selTest2 = new SeleniumTest2();
      selTest2.crawl();
   }
   
   private WebDriver driver;
   public String base_url;
   
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:\\Users\\¾È±Ô¿ø\\Desktop\\selenium\\chromedriver.exe";
   
   public SeleniumTest2() {
       super();
       System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
       driver = new ChromeDriver();
       base_url = "https:\\www.daum.net";
    }
    
   
   
   public void crawl() {
       
       try {
          driver.get(base_url);
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[1]/ul/li[9]/a")).click();
          Thread.sleep(2000);
          System.out.println(driver.getPageSource());

          
         
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
           //driver.close();
       } 
    }
    
}