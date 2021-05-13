package softwarecoding9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class P3 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 9강 : XML, JSON
	// 3. JSON 파싱
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// 파일에서 JSON으로 읽어오기 위해 JSONParser 객체생성
		JSONParser k20_parser = new JSONParser();
		// 파일 경로 입력하여 그것을 담은 Object 생성
		Object k20_obj = k20_parser.parse(new FileReader("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\9\\test.json"));
		// 그 Object를 JSONArray로 담았음.
		// 이렇게 해야 우리가 콘솔상 출력이 편하지...
		JSONArray k20_array = (JSONArray)k20_obj;
		// 시작줄 표시
		System.out.println("**********************************");
		for (int k20_i = 0; k20_i < k20_array.size(); k20_i++) { // JSONArray의 size만큼 for문 실시
			// JSONArray에서 for문의 index만큼 get함.
			JSONObject k20_result = (JSONObject) k20_array.get(k20_i);
			// 이름은 그대로 JSONObject에서 가져옴
			System.out.println("이름 : " + k20_result.get("name"));
			// 학번도 마찬가지로 JSONObject에서 가져옴
			System.out.println("학번 : " + k20_result.get("studentid"));
			// score은 JSONArray로 담겼으므로 JSONArray로 우선 받아와야함
			JSONArray k20_score = (JSONArray) k20_result.get("score");
			// JSONArray로 만들어진 score에서 0번째는 국어, 1번째는 영어, 2번째는 수학으로 get
			long k20_kor = (long)k20_score.get(0); // 국어
			long k20_eng = (long)k20_score.get(1); // 영어
			long k20_mat = (long)k20_score.get(2); // 수학
			System.out.println("국어 : " + k20_kor); // 국어점수 출력
			System.out.println("영어 : " + k20_eng); // 영어점수 출력
			System.out.println("수학 : " + k20_mat); // 수학점수 출력
			System.out.println("총점 : " + (k20_kor + k20_eng + k20_mat)); // 총점 출력
			System.out.println("평균 : " + ((k20_kor + k20_eng + k20_mat)/3.0)); // 평균 출력
			System.out.println("**********************************");
		}
	}
}
