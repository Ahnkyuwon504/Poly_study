package selenium;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realnaver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Properties
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\안규원\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;

		driver = new ChromeDriver();

		String url;
		url = "https://www.naver.com";

		try {

			driver.get(url); // url 접속
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/ul[2]/li[2]/a")).click(); // 뉴스
																													// 클릭
			Thread.sleep(2000);
			String address = driver.getCurrentUrl(); // 뉴스 홈페이지 주소를 address에 저장

			Document doc = Jsoup.connect(address).get(); // 저장된 홈페이지를 Jsoup을 사용하기 위해 Document에 토스
			System.out.println("===============================================");
			Elements element = doc.select(".com_list"); // div class = "come_list" 가져오기
			Elements element2 = element.select(".mtype_list_wide a"); // div class = "mtype_list_wide" 의 a태그만 가져오기
			String rawData = element2.toString();
			parser(rawData);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void parser(String rawData) {
		String data = rawData;

		String[] title_arr = data.split("\\n"); // 가져온 데이터를 행을 기준으로 split하여 배열에 저장
		String title;

		for (int i = 0; i < title_arr.length; i++) {
			title = title_arr[i].toString(); // i번째 값을 String으로 변환
			title = title.substring(title.indexOf("<strong>") + 8); // 뉴스제목은 <storng> </strong>안에 있으므로
			title = title.substring(0, title.indexOf("</strong>")); // substring하여 title에 저장
			System.out.println(title);
		}

	}

}