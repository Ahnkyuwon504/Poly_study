package softwarecoding9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class P2 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 9강 : XML, JSON
	// 2. JSON 만들기
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
	// 메인메소드와 별개의 메소드.
	// 각 학생마다 여러 개의 엘리먼트가 있는데, 각 학생마다 일일히 추가하는 것보다
	// 한 학생의 이름, 학번, 성적을 객체생성시에 아예 넣어버리는 메소드를 만든 것임.
		// 그리하여 만든 JSONObject 객체. 여기에 엘리먼트 넣고 return할것임.
		JSONObject k20_dataObject = new JSONObject();
		// name은 태그 name 들고 그대로
		k20_dataObject.put("name", name);
		// studentid는 태그 studentid 들고 그대로
		k20_dataObject.put("studentid", studentid);
		// score은 또한번 세 개의 과목으로 갈라지기 때문에 JSONArray 생성
		JSONArray k20_score = new JSONArray();
		// JSONArray에 국어, 영어, 수학 성적 추가
		k20_score.add(kor); k20_score.add(eng); k20_score.add(mat);
		// 완성된 score을 객체에 추가
		k20_dataObject.put("score", k20_score);
		// 객체가 완료되었으므로 return
		return k20_dataObject;
	}

	public static void main(String[] args) {
		// 모든 것을 담을 JSONObject
		JSONObject k20_jsonObject = new JSONObject();
		// 우선 여러명의 학생이므로 학생을 담을 JSONArray 생성
		JSONArray k20_datasArray = new JSONArray();
		// JSONArray에 넣을 각각의 JSONObject 생성. 한명의 학생 역할을 함.
		JSONObject k20_dataObject = new JSONObject();
		// 한 명의 object에 이름 나연 추가
		k20_dataObject.put("name", "나연");
		// 한 명의 object에 학번 추가
		k20_dataObject.put("studentid", "209901");
		// 한 명의 object에 넣을 score JSONArray 생성
		JSONArray k20_score = new JSONArray();
		// score JSONArray에 세과목 점수 추가
		k20_score.add(90); k20_score.add(100); k20_score.add(95);
		// score JSONArray가 완성되었으므로 나연에 추가
		k20_dataObject.put("score", k20_score);
		// 그렇게 만들어진 나연을 Array에 추가
		k20_datasArray.add(k20_dataObject);
		// 보시다시피 매우 불편함...어떤 학생을 추가하더라도 그에 수반하는 과정이 필요함.
		// 따라서, 어떤 학생을 추가하더라도 같은 과정이므로 그 과정을 수행해줄 메소드를 위에서 만든 것임...
		k20_datasArray.add(oneRec("정연", 209902, 100, 85, 75)); // 메소드 이용하여 정연학생 JSONObject 추가
		k20_datasArray.add(oneRec("모모", 209903, 90, 75, 85)); // 메소드 이용하여 모모학생 JSONObject 추가
		k20_datasArray.add(oneRec("사나", 209904, 90, 85, 75)); // 메소드 이용하여 사나학생 JSONObject 추가
		k20_datasArray.add(oneRec("지효", 209905, 80, 75, 85)); // 메소드 이용하여 지효학생 JSONObject 추가
		k20_datasArray.add(oneRec("미나", 209906, 90, 85, 55)); // 메소드 이용하여 미나학생 JSONObject 추가
		k20_datasArray.add(oneRec("다연", 209907, 70, 75, 65)); // 메소드 이용하여 다연학생 JSONObject 추가
		k20_datasArray.add(oneRec("채영", 209908, 100, 75, 95)); // 메소드 이용하여 채영학생 JSONObject 추가
		k20_datasArray.add(oneRec("쯔위", 209909, 80, 65, 95)); // 메소드 이용하여 쯔위학생 JSONObject 추가
		
		try {
			// 완성된 JSONArray를 입력해야하므로, FileWriter 객체 생성
			FileWriter k20_file = new FileWriter("C:\\Users\\안규원\\Desktop\\java 홍필두교수님\\9\\test.json");
			// 파일에 입력
			k20_file.write(k20_datasArray.toJSONString());
			k20_file.flush(); // 이 둘은
			k20_file.close(); // 세트로 꼭 해주자. 메모리 말고 하드디스크 상에서 입력 후 close하는게 습관으로!!
		} catch (IOException k20_e) {
			// 오류 발생시 잡도록 처리
			k20_e.printStackTrace();
		}
		// 잘 됬나 보자...
		System.out.println("JSON 만든거 : " + k20_datasArray);
	}
}
