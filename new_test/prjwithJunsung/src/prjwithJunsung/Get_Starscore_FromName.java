package prjwithJunsung;

import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Starscore_FromName {
	public static ArrayList<Double> Get_Starscore_FromName(ArrayList<String> name_Array) {
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\안규원\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;
		driver = new ChromeDriver();
		ArrayList<Double> num1 = new ArrayList<Double>();

		for (int index_Array = 0; index_Array < name_Array.size(); index_Array++) {

			String url;
			String string_Star_Score = "";
			double star_Score;
			url = "https://www.naver.com";
			String name_Of_Food = name_Array.get(index_Array); // name.get(number)

			try {
				driver.get(url);
				Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
						.sendKeys(name_Of_Food);
				Thread.sleep(2000);

				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button")).click();
				// System.out.println(driver.getPageSource());

				Thread.sleep(2000);
				String address = driver.getCurrentUrl();

				Document doc = Jsoup.connect(address).get();

				Elements element = doc.select("div.star_area");
				Iterator<Element> ie1 = element.select("span").iterator();

				while (ie1.hasNext()) {
					string_Star_Score += ie1.next().text();
				}
				star_Score = Double.parseDouble(string_Star_Score.substring(0, 3));
				num1.add(star_Score);
			} catch (StringIndexOutOfBoundsException e) {
				num1.add(0.0);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return num1;

	}

	public static Double GetStar_OneMore (String name) {
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\안규원\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;
		driver = new ChromeDriver();
		Double Star = 0.0;

		String url = "https://map.naver.com/v5/?c=14119896.9323789,4184068.5763737,15,0,0,0,dh";
		String string_Star_Score = ""; // String which save star score
		double star_Score;
		String name_Of_Food = "광주 서구 " + name; // name.get(number)

		try {
			driver.get(url);
			Thread.sleep(3000);

			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
					.sendKeys(name_Of_Food);
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button")).click();
			// System.out.println(driver.getPageSource());

			Thread.sleep(2000);
			String address = driver.getCurrentUrl();

			Document doc = Jsoup.connect(address).get();

			Elements element = doc.select("div.star_area");
			Iterator<Element> ie1 = element.select("span").iterator();

			while (ie1.hasNext()) {
				string_Star_Score += ie1.next().text();
			}
			star_Score = Double.parseDouble(string_Star_Score.substring(0, 3));
			Star = star_Score;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Star;

	}
}
