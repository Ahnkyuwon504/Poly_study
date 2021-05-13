package selenium;

import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		// Properties
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\안규원\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;

		driver = new ChromeDriver();
		
		

		String url;
		url = "https://www.youtube.com";

		try {

			driver.get(url); 
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-item-renderer[1]/div"))
					.click(); 
			
			/*
			 * driver.get(base_url);
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).sendKeys("폴리텍");
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("/html/body")).click();
          System.out.println(driver.getPageSource());
			 */
			// 클릭
			Thread.sleep(2000);
			String address = driver.getCurrentUrl();

			Document doc = Jsoup.connect(address).get();
			System.out.println("===============================================");

			String rawData = doc.toString();
			likeParser(rawData);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void likeParser(String rawData) {
		String data = rawData;
		String title;

		title = data.substring(
				data.indexOf("\"},\"toggledText\":{\"accessibility\":{\"accessibilityData\":{\"label\":\"") + 65);// ,
																													// data.indexOf("\"}},\"simpleText\""));
		title = title.substring(0, title.indexOf("}}") - 1);
		System.out.println(title);

	}

}