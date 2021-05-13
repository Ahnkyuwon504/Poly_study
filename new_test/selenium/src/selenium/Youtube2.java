package selenium;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Youtube2 {
	
	public static void main(String[] args) throws IOException {
		// Properties
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\안규원\\Desktop\\selenium\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		driver = new ChromeDriver();
		String url;
		String channelName;
		channelName = "비치비치다비치";
		FileOutputStream output = new FileOutputStream("C:\\Users\\안규원\\Desktop\\비치비치다비치.txt");

		for (int i = 1; i < 3; i++) {
			url = "https://www.youtube.com/results?search_query=";
			url += channelName;

			try {
				driver.get(url);
				Thread.sleep(2000);

				driver.findElement(By.xpath(
						"/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-channel-renderer/div/div[2]/a/div[1]/ytd-channel-name/div/div/yt-formatted-string"))
						.click();
				Thread.sleep(5000);

				driver.findElement(By.xpath(
						"/html/body/ytd-app/div/ytd-page-manager/ytd-browse/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/tp-yt-paper-tab[2]/div"))
						.click();
				Thread.sleep(5000);

				String first = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-grid-renderer/div[1]/ytd-grid-video-renderer[";
				String second = Integer.toString(i);
				String third = "]/div[1]/div[1]/div[1]";
				String temp = first + second + third;

				driver.findElement(By.xpath(temp)).click();
				Thread.sleep(2000);

				String address = driver.getCurrentUrl();
				Document doc = Jsoup.connect(address).get();

				System.out.println("===============================================");

				String rawData = doc.toString();
				String wRite = likeParser(rawData) + " / " + dislikeParser(rawData)
                + " / " + joheParser(rawData) + " / "
                + dayParser(rawData) + "\n";
				output.write(wRite.getBytes());
				// subParser(rawData);
				// tagParser(rawData);
				Thread.sleep(2000);
			} catch (Exception e) {
			}

		}

		/*
		 * 
		 * try { url = "https://www.youtube.com/results?search_query="; channelName =
		 * "탱구TV"; url += channelName;
		 * 
		 * driver.get(url); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-channel-renderer/div/div[2]/a/div[1]/ytd-channel-name/div/div/yt-formatted-string"
		 * )).click(); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/ytd-app/div/ytd-page-manager/ytd-browse/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/tp-yt-paper-tab[2]/div"
		 * )).click(); Thread.sleep(5000);
		 * 
		 * String first =
		 * "/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-grid-renderer/div[1]/ytd-grid-video-renderer[";
		 * String second = "]/div[1]/div[1]/div[1]"; String temp = first + "3" + second;
		 * System.out.println(temp);
		 * 
		 * driver.findElement(By.xpath(temp)).click(); Thread.sleep(2000);
		 * 
		 * String address = driver.getCurrentUrl(); Document doc =
		 * Jsoup.connect(address).get();
		 * 
		 * System.out.println("===============================================");
		 * 
		 * String rawData = doc.toString(); likeParser(rawData); dislikeParser(rawData);
		 * joheParser(rawData); //subParser(rawData); // tagParser(rawData);
		 * dayParser(rawData); Thread.sleep(2000); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		/*
		 * try { url = "https://www.youtube.com/results?search_query="; channelName =
		 * "탱구TV"; url += channelName;
		 * 
		 * driver.get(url); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-channel-renderer/div/div[2]/a/div[1]/ytd-channel-name/div/div/yt-formatted-string"
		 * )).click(); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/ytd-app/div/ytd-page-manager/ytd-browse/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/tp-yt-paper-tab[2]/div"
		 * )).click(); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-grid-renderer/div[1]/ytd-grid-video-renderer[2]/div[1]/div[1]/div[1]"
		 * )).click(); Thread.sleep(2000);
		 * 
		 * String address = driver.getCurrentUrl(); Document doc =
		 * Jsoup.connect(address).get();
		 * 
		 * System.out.println("===============================================");
		 * 
		 * String rawData = doc.toString(); likeParser(rawData); dislikeParser(rawData);
		 * joheParser(rawData); //subParser(rawData); // tagParser(rawData);
		 * dayParser(rawData); Thread.sleep(2000); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 */

	}

	public static String likeParser(String rawData) {
		String data = rawData;
		String title;

		title = data.substring(data.indexOf("accessibilityData\":{\"label\":\"좋아요 ") + 33);// ,
																							// data.indexOf("\"}},\"simpleText\""));
		title = title.substring(0, title.indexOf("개"));
		System.out.println(title);
		return title;
	}

	public static String dislikeParser(String rawData) {
		String data = rawData;
		String title;

		title = data.substring(
				data.indexOf("DISLIKE\"},\"defaultText\":{\"accessibility\":{\"accessibilityData\":{\"label\":\"")
						+ 76);
		title = title.substring(0, title.indexOf("개"));
		System.out.println(title);
		return title;
	}

	public static String joheParser(String rawData) {
		String data = rawData;
		String title;

		title = data.substring(
				data.indexOf("viewCount\":{\"videoViewCountRenderer\":{\"viewCount\":{\"simpleText\":\"조회수") + 69);

		title = title.substring(0, title.indexOf("회\"},\"shortViewCount\":{"));
		System.out.println(title);
		return title;
	}

	public static void subParser(String rawData) {
		String data = rawData;
		String title;
		title = data.substring(data.indexOf(":{\"accessibilityData\":{\"label\":\"구독자") + 36);
		title = title.substring(0, title.indexOf("\"}},\"simple"));
		System.out.println(title);
	}

	public static void tagParser(String rawData) {
		String data = rawData;
		String title;
		String title1;
		String title2;
		String title3;
		String title4;
		String title5;

		title1 = data.substring(data.indexOf("\"superTitleLink\":{\"runs\":[{\"text\":\"") + 35);
		title = title1.substring(0, title1.indexOf("\",\""));
		System.out.println(title);

		title = data.substring(data.indexOf("{\"text\":\" \"},{\"text\":\"") + 22);
		title = title.substring(0, title.indexOf("\",\""));
		System.out.println(title);

		title = data.substring(data.indexOf("{\"text\":\" \"},{\"text\":\"") + 22);
		title = title.substring(0, title.indexOf("\",\""));
		System.out.println(title);

	}

	public static String dayParser(String rawData) {
		String data = rawData;
		String title;

		title = data.substring(data.indexOf("\"dateText\":{\"simpleText\":\"") + 26);
		title = title.substring(0, title.indexOf("\"}}},"));
		System.out.println(title);
		return title;
	}

}
