package prjwithJunsung;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Star_Score {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("�����");
		name.add("ȫ��â ȸ�� ����");
		name.add("����");
		Get_Starscore_FromName get_starscore_fromname = new Get_Starscore_FromName();
		System.out.println(get_starscore_fromname.Get_Starscore_FromName(name));
		
		
	}
	
}
		/*
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\�ȱԿ�\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;
		driver = new ChromeDriver();

		String url;
		String string_Star_Score = "";
		double star_Score;
		url = "https://www.naver.com";
		//for(int i = 0;p i< name.size(); i++){
		String name_Of_Food = "�����"; //name.get(number)

		try {
			driver.get(url);
          	Thread.sleep(3000);
          
          	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).sendKeys(name_Of_Food);
          	Thread.sleep(2000);
          
          	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button")).click();
          	// System.out.println(driver.getPageSource());
			 
		  	Thread.sleep(2000);
		  	String address = driver.getCurrentUrl();

		  	Document doc = Jsoup.connect(address).get();
		  	System.out.println("===============================================");
		  	
		  	
			Elements element = doc.select("div.star_area");  
			Iterator<Element> ie1 = element.select("span").iterator();
			
			while (ie1.hasNext()) {
				string_Star_Score += ie1.next().text();
			}
			star_Score = Double.parseDouble(string_Star_Score.substring(0, 3));
			
			System.out.println(star_Score);
			*/
			


		  	//String rawData = doc.toString();
		  	//System.out.println(rawData);
		  	
		  	/*
		  	 * doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//select�� �̿��Ͽ� ���ϴ� �±׸� �����Ѵ�. select�� ���ϴ� ���� �������� ���� �߿��� ����̴�.
		Elements element = doc.select("div.sect-movie-chart");    
		//document.querySelector("#contents > div.wrap-movie-chart > div.sect-movie-chart")
		

		System.out.println("============================================================");

		//Iterator�� ����Ͽ� �ϳ��� �� ��������
		Iterator<Element> ie1 = element.select("strong.rank").iterator();
		Iterator<Element> ie2 = element.select("strong.title").iterator();
		Iterator<Element> ie3 = element.select("strong.percent").iterator();
		Iterator<Element> ie4 = element.select("span").iterator();
		
		        
		while (ie1.hasNext()) {
			System.out.println(ie1.next().text() + "\t" + ie2.next().text() + "\t" + ie3.next().text() + "\t" + ie4.next().text());
		}
		  	 * 
		  	 */
/*
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*
	public static int get_Star_Score (String rawData) {
		
		
	}
	*/




