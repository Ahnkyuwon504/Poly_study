package selenium;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class LottoNum {
	private String source_id;

	public LottoNum() {
		try {
			GetNumber();
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}

	public void GetNumber() throws Exception {
		Document doc = Jsoup.connect("https://dhlottery.co.kr/common.do?method=main").get();
		Elements contents = doc.select("p.num");
		System.out.println(contents);

		for (int i = 1; i <= 6; i++) {
			source_id = "#drwtNo" + i;
			contents = doc.select(source_id);
			System.out.println("[" + i + "] : " + contents.attr("class"));
		}

		contents = doc.select("#bnusNo");
		System.out.println("[B] : " + contents.attr("text"));
	}
}