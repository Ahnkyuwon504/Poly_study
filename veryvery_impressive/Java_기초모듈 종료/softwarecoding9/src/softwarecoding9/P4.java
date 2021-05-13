package softwarecoding9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class P4 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 9강 : XML, JSON
	// 4. 날씨 데이터
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, ParserConfigurationException, SAXException {
		// DocumentBuilder 객체 생성
		//DocumentBuilder k20_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// 이 document 객체를 가지고 놀것임.
		//Document k20_doc = k20_docBuilder.parse(new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\9\\수업날씨실습.txt"));
		// root 태그를 가져왔지만, 지금은 쓸일 없음.
		DocumentBuilder k20_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// 실제 데이터사이트 접속하여 실시간 기상데이터 parsing
		Document k20_doc = k20_docBuilder.parse("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=61&gridy=123\r\n");
		// root 태그.현재 쓸일 없다...
		Element k20_root = k20_doc.getDocumentElement();
		// data 태그를 찾는다.
		// 이 tag_001이 우리가 원하는 데이터를 가지고 있는 하나의 학생이라고 
		// 보면 된다. 얘 갖고 놀거임...
		NodeList k20_tag_001 = k20_doc.getElementsByTagName("data");
		NodeList k20_tag_002 = k20_doc.getElementsByTagName("header");
		// data 태그가 여러 개 있는데 하나를 선택하여 
		// Attribute가 seq를 찾고, 그것의 값인 nodevalue를 찾는다.
		String k20_seq="";	 // 48시간 중 몇 번째인지 가르킴.
		String k20_hour="";  // 동네예보 3시간 단위
		String k20_day="";	 // 1번째 날 ( 0: 오늘, 1: 내일, 2: 모레)
		String k20_temp="";	 // 현재 시간 온도
		String k20_tmx="";	 // 최고 온도
		String k20_tmn="";	 // 최저 온도
		String k20_sky="";	 // 하늘 상태코드 (1: 맑음, 2: 구름조금, 3:구름많음, 4:흐림)
		String k20_pty="";	 // 강수 상태코드 (0:없음, 1:비, 2:비/눈, 3:눈/비, 4:눈)
		String k20_wfKor=""; // 날씨 한국어
		String k20_wfEn="";	 // 날씨 영어
		String k20_pop="";	 // 강수 확률%
		String k20_r12="";	 // 12시간 예상 강수량
		String k20_s12="";	 // 12시간 예상 적설량
		String k20_ws="";	 // 풍속(m/s)
		String k20_wd="";	 // 풍향 (0~7:북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k20_wdKor=""; // 풍향 한국어
		String k20_wdEn="";	 // 풍향 영어
		String k20_reh="";	 // 습도 %
		String k20_r06="";	 // 6시간 예상 강수량
		String k20_s06="";	 // 6시간 예상 적설량
		
		System.out.printf("날씨 요소는 차례대로\n48시간 중 순서/시간/날짜/현재 시간 온도/최고 온도/최저 온도"
				+ "/\n하늘 상태/강수 상태/날씨(한국어)/날씨(영어)/강수 확률"
				+ "/12시간 예상강수량/12시간 예상적설량/\n풍속/풍향/"
				+ "풍향(한국어)/풍향(영어)/습도/6시간 예상강수량/6시간 예상적설량\n입니다.\n");
		// 날씨 요소에 대한 설명을 해준다.
		
		
		Element k20_elmt2 = (Element)k20_tag_002.item(0);
		String k20_tm = k20_elmt2.getElementsByTagName("tm").item(0).getFirstChild().getNodeValue();
		String k20_ts = k20_elmt2.getElementsByTagName("ts").item(0).getFirstChild().getNodeValue();
		String k20_x = k20_elmt2.getElementsByTagName("x").item(0).getFirstChild().getNodeValue();
		String k20_y = k20_elmt2.getElementsByTagName("y").item(0).getFirstChild().getNodeValue();
		System.out.printf("발표시각 : %s\n시간 step : %s\nx좌표 : %s\ny좌표 : %s\n", k20_tm, k20_ts, k20_x, k20_y);
		
		System.out.printf("\nseq/hour/day/temp/tmx   /tmn   /sky/pty/wfKor     /"
				+ "wfEn         "
				+ "/pop/r12/s12/ws                  /wd/"
				+ "wdKor/wdEn /reh/r06/s06\n");
		// 날씨 요소 직접 출력. 이것을 기준으로 데이터 파악할것임.
		for (int k20_i = 0; k20_i < k20_tag_001.getLength(); k20_i++) {
			Element k20_elmt = (Element)k20_tag_001.item(k20_i);
			// 결국 data seq = "0", data seq = "1"을 보고 0, 1, 2, 3 값이 나온다.
			k20_seq = k20_tag_001.item(k20_i).getAttributes().getNamedItem("seq").getNodeValue(); // 순서
			// 현재 data 태그로 찾아진 tag_001 하위에서 hour을 찾아
			// 그것의 노드값을 보여준다.
			k20_hour = k20_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // 시간
			k20_day = k20_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); // 날짜
			k20_temp = k20_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); // 현재 시간 온도
			k20_tmx = k20_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); // 최고 온도
			k20_tmn = k20_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); // 최저 온도
			k20_sky = k20_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); // 하늘 상태
			k20_pty = k20_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); // 강수 상태
			k20_wfKor = k20_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); // 날씨(한국어)
			k20_wfEn = k20_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); // 날씨(영어)
			k20_pop = k20_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); // 강수 확률
			k20_r12 = k20_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); // 12시간 예상강수량
			k20_s12 = k20_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); // 12시간 예상적설량
			k20_ws = k20_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); // 풍속
			k20_wd = k20_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); // 풍향
			k20_wdKor = k20_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); // 풍향(한국어)
			k20_wdEn = k20_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); // 풍향(영어
			k20_reh = k20_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); // 습도
			k20_r06 = k20_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); // 6시간 예상강수량
			k20_s06 = k20_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); // 6시간 예상적설량
			
			// 줄맞추면서 프린트
			System.out.printf("%-3s/%-4s/%-3s/%-4s/%-6s/"
					+ "%-6s/%-3s/%-3s/%s/%-13s"
					+ "/%-3s/%-3s/%-3s/%-20s/%-2s/"
					+ "%s/%-5s/%-3s/%-3s/%-3s\n", 
					k20_seq, k20_hour, k20_day, k20_temp, k20_tmx, 
					k20_tmn, k20_sky, k20_pty, k20_cut(k20_wfKor, 10), k20_wfEn,
					k20_pop, k20_r12, k20_s12, k20_ws, k20_wd, 
					k20_cut(k20_wdKor, 5), k20_wdEn, k20_reh, k20_r06, k20_s06);
		}
		
		System.out.printf("\n\n====================================================\n");
		for (int k20_i = 0; k20_i < k20_tag_001.getLength(); k20_i++) {
			Element k20_elmt = (Element)k20_tag_001.item(k20_i);
			// 결국 data seq = "0", data seq = "1"을 보고 0, 1, 2, 3 값이 나온다.
			k20_seq = k20_tag_001.item(k20_i).getAttributes().getNamedItem("seq").getNodeValue(); // 순서
			// 현재 data 태그로 찾아진 tag_001 하위에서 hour을 찾아
			// 그것의 노드값을 보여준다.
			k20_hour = k20_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // 시간
			k20_day = k20_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); // 날짜
				if (k20_day.equals("0")) {
					k20_day = "오늘";
				} else if (k20_day.equals("1")) {
					k20_day = "내일";
				} else if (k20_day.equals("2")) {
					k20_day = "모레";
				}
			k20_temp = k20_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); // 현재 시간 온도
			k20_tmx = k20_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); // 최고 온도
			k20_tmn = k20_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); // 최저 온도
			k20_sky = k20_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); // 하늘 상태
			if (k20_sky.equals("1")) {
				k20_sky = "맑음";
			} else if (k20_sky.equals("2")) {
				k20_sky = "구름조금";
			} else if (k20_sky.equals("3")) {
				k20_sky = "구름많음";
			} else if (k20_sky.equals("4")) {
				k20_sky = "흐림";
			}
			k20_pty = k20_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); // 강수 상태
			if (k20_pty.equals("0")) {
				k20_pty = "없음";
			} else if (k20_pty.equals("1")) {
				k20_pty = "비";
			} else if (k20_pty.equals("2")) {
				k20_pty = "비/눈";
			} else if (k20_pty.equals("3")) {
				k20_pty = "눈/비";
			}  else if (k20_pty.equals("4")) {
				k20_pty = "눈";
			}
			k20_wfKor = k20_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); // 날씨(한국어)
			k20_wfEn = k20_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); // 날씨(영어)
			k20_pop = k20_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); // 강수 확률
			k20_r12 = k20_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); // 12시간 예상강수량
			k20_s12 = k20_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); // 12시간 예상적설량
			k20_ws = k20_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); // 풍속
			k20_wd = k20_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); // 풍향
			k20_wdKor = k20_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); // 풍향(한국어)
			k20_wdEn = k20_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); // 풍향(영어
			k20_reh = k20_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); // 습도
			k20_r06 = k20_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); // 6시간 예상강수량
			k20_s06 = k20_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); // 6시간 예상적설량
			
			/*
			 * String k20_seq="";	 // 48시간 중 몇 번째인지 가르킴.
			String k20_hour="";  // 동네예보 3시간 단위
			String k20_day="";	 // 1번째 날 ( 0: 오늘, 1: 내일, 2: 모레)
			String k20_temp="";	 // 현재 시간 온도
			String k20_tmx="";	 // 최고 온도
			String k20_tmn="";	 // 최저 온도
			String k20_sky="";	 // 하늘 상태코드 (1: 맑음, 2: 구름조금, 3:구름많음, 4:흐림)
			String k20_pty="";	 // 강수 상태코드 (0:없음, 1:비, 2:비/눈, 3:눈/비, 4:눈)
			String k20_wfKor=""; // 날씨 한국어
			String k20_wfEn="";	 // 날씨 영어
			String k20_pop="";	 // 강수 확률%
			String k20_r12="";	 // 12시간 예상 강수량
			String k20_s12="";	 // 12시간 예상 적설량
			String k20_ws="";	 // 풍속(m/s)
			String k20_wd="";	 // 풍향 (0~7:북, 북동, 동, 남동, 남, 남서, 서, 북서)
			String k20_wdKor=""; // 풍향 한국어
			String k20_wdEn="";	 // 풍향 영어
			String k20_reh="";	 // 습도 %
			String k20_r06="";	 // 6시간 예상 강수량
			String k20_s06="";	 // 6시간 예상 적설량
			 */
			
			System.out.printf("48시간 중 %s번째 / 총 16번\n", Integer.parseInt(k20_seq) + 1);
			System.out.printf("%s시\n", k20_hour);
			System.out.printf("날짜 : %s\n", k20_day);
			System.out.printf("현재 시간 온도 : %s\n", k20_temp);
			System.out.printf("최고 온도 : %s\n", k20_tmx);
			System.out.printf("최저 온도 : %s\n", k20_tmn);
			System.out.printf("하늘 상태 : %s\n", k20_sky);
			System.out.printf("강수 상태 : %s\n", k20_pty);
			System.out.printf("날씨(한국어) : %s\n", k20_wfKor);
			System.out.printf("날씨(영어) : %s\n", k20_wfEn);
			System.out.printf("강수 확률 : %s\n", k20_pop);
			System.out.printf("12시간 예상 강수량 : %s\n", k20_r12);
			System.out.printf("12시간 예상 적설량 : %s\n", k20_s12);
			System.out.printf("풍속 : %s\n", k20_ws);
			System.out.printf("풍향 : %s\n", k20_wd);
			System.out.printf("풍향(한국어) : %s\n", k20_wdKor);
			System.out.printf("풍향(영어) : %s\n", k20_wdEn);
			System.out.printf("습도 : %s\n", k20_reh);
			System.out.printf("6시간 예상 강수량 : %s\n", k20_r06);
			System.out.printf("6시간 예상 적설량 : %s\n", k20_s06);
			
			
			
			
			System.out.printf("====================================================\n");
			
		}
	}
	
	// 문자열 크기 정해주는 메소드. 한국어 들어가는 Stirng에 사용하였음.
	public static String k20_cut(String k20_str, int k20_len) {

		if (k20_str.getBytes().length <= k20_len) {
			int k20_blank = (k20_len) - k20_str.getBytes().length;
			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_str += " ";
			}
			return k20_str;
		} else {
			StringBuffer k20_sbStr = new StringBuffer(k20_len);
			int k20_cnt = 0;
			for (char k20_ch : k20_str.toCharArray()) {
				k20_cnt += String.valueOf(k20_ch).getBytes().length;
				if (k20_cnt > k20_len)
					break;
				k20_sbStr.append(k20_ch);
			}
			String k20_text = k20_sbStr.toString();
			int k20_blank = k20_len - k20_text.getBytes().length;

			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_text += " ";
			}
			return k20_text;
		}
	}
}
