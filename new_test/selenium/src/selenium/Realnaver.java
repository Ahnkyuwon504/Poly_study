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
		String WEB_DRIVER_PATH = "C:\\Users\\�ȱԿ�\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;

		driver = new ChromeDriver();

		String url;
		url = "https://www.naver.com";

		try {

			driver.get(url); // url ����
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/ul[2]/li[2]/a")).click(); // ����
																													// Ŭ��
			Thread.sleep(2000);
			String address = driver.getCurrentUrl(); // ���� Ȩ������ �ּҸ� address�� ����

			Document doc = Jsoup.connect(address).get(); // ����� Ȩ�������� Jsoup�� ����ϱ� ���� Document�� �佺
			System.out.println("===============================================");
			Elements element = doc.select(".com_list"); // div class = "come_list" ��������
			Elements element2 = element.select(".mtype_list_wide a"); // div class = "mtype_list_wide" �� a�±׸� ��������
			String rawData = element2.toString();
			parser(rawData);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void parser(String rawData) {
		String data = rawData;

		String[] title_arr = data.split("\\n"); // ������ �����͸� ���� �������� split�Ͽ� �迭�� ����
		String title;

		for (int i = 0; i < title_arr.length; i++) {
			title = title_arr[i].toString(); // i��° ���� String���� ��ȯ
			title = title.substring(title.indexOf("<strong>") + 8); // ���������� <storng> </strong>�ȿ� �����Ƿ�
			title = title.substring(0, title.indexOf("</strong>")); // substring�Ͽ� title�� ����
			System.out.println(title);
		}

	}

}