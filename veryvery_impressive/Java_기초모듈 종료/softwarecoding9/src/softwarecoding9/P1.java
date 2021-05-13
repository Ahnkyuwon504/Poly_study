package softwarecoding9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class P1 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 9강 : XML, JSON
	// 1. XML 파싱 기본
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// DocumentBuilder 객체 생성
		DocumentBuilder k20_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// Document k20_doc 객체 생성. 파일의 경로는 트와이스 멤버들의 점수가 기록된 txt 파일
		// 이 document 객체를 가지고 놀것임.
		Document k20_doc = k20_docBuilder.parse(new File("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\9\\score.txt"));
		// root 태그를 가져왔지만, 지금은 쓸일 없음.
		Element k20_root = k20_doc.getDocumentElement();
		NodeList k20_tag_name = k20_doc.getElementsByTagName("name"); // 태그 중 name 이름을 가진 놈의 List가 되었음.
		NodeList k20_tag_studentid = k20_doc.getElementsByTagName("studentid"); // 태그 중 studentid 를 가진 놈의 List
		NodeList k20_tag_kor = k20_doc.getElementsByTagName("kor"); // 태그 중 kor 를 가진 놈의 List
		NodeList k20_tag_eng = k20_doc.getElementsByTagName("eng"); // 태그 중 eng 를 가진 놈의 List
		NodeList k20_tag_mat = k20_doc.getElementsByTagName("mat"); // 태그 중 mat 를 가진 놈의 List
		// 첫 시작 줄임.
		System.out.printf("********************************************\n");
		// for문은 i가 0부터 name 이름 가진 놈들의 List의 length만큼 실시됨.
		// 사실 name이 아니라 studentid, kor, eng, mat 뭐든 상관 없음. 동일한 크기를 가지고있다.
		for (int k20_i = 0; k20_i < k20_tag_name.getLength(); k20_i++) {
			// 이름 출력, List에서 index 번째의 원소의 getFirstChild, getNodeValue...이건 지금은 그냥 외우자.
			System.out.printf("이름 : %s\n", k20_tag_name.item(k20_i).getFirstChild().getNodeValue());
			// 이름 출력, List에서 index 번째의 원소의 getFirstChild, getNodeValue...이건 지금은 그냥 외우자.
			System.out.printf("학번 : %s\n", k20_tag_studentid.item(k20_i).getFirstChild().getNodeValue());
			// 학번 출력, List에서 index 번째의 원소의 getFirstChild, getNodeValue...이건 지금은 그냥 외우자.
			System.out.printf("국어 : %s\n", k20_tag_kor.item(k20_i).getFirstChild().getNodeValue());
			// 국어성적 출력, List에서 index 번째의 원소의 getFirstChild, getNodeValue...이건 지금은 그냥 외우자.
			System.out.printf("영어 : %s\n", k20_tag_eng.item(k20_i).getFirstChild().getNodeValue());
			// 영어성적 출력, List에서 index 번째의 원소의 getFirstChild, getNodeValue...이건 지금은 그냥 외우자.
			System.out.printf("수학 : %s\n", k20_tag_mat.item(k20_i).getFirstChild().getNodeValue());
			// 수학성적 출력, List에서 index 번째의 원소의 getFirstChild, getNodeValue...이건 지금은 그냥 외우자.
			System.out.printf("********************************************\n"); // 각 학생별로 구분시켜줄 줄
		}
	}
}
