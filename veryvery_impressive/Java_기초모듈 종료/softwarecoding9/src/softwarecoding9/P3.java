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
	// ����Ʈ�����ڵ� 9�� : XML, JSON
	// 3. JSON �Ľ�
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// ���Ͽ��� JSON���� �о���� ���� JSONParser ��ü����
		JSONParser k20_parser = new JSONParser();
		// ���� ��� �Է��Ͽ� �װ��� ���� Object ����
		Object k20_obj = k20_parser.parse(new FileReader("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\9\\test.json"));
		// �� Object�� JSONArray�� �����.
		// �̷��� �ؾ� �츮�� �ֻܼ� ����� ������...
		JSONArray k20_array = (JSONArray)k20_obj;
		// ������ ǥ��
		System.out.println("**********************************");
		for (int k20_i = 0; k20_i < k20_array.size(); k20_i++) { // JSONArray�� size��ŭ for�� �ǽ�
			// JSONArray���� for���� index��ŭ get��.
			JSONObject k20_result = (JSONObject) k20_array.get(k20_i);
			// �̸��� �״�� JSONObject���� ������
			System.out.println("�̸� : " + k20_result.get("name"));
			// �й��� ���������� JSONObject���� ������
			System.out.println("�й� : " + k20_result.get("studentid"));
			// score�� JSONArray�� ������Ƿ� JSONArray�� �켱 �޾ƿ;���
			JSONArray k20_score = (JSONArray) k20_result.get("score");
			// JSONArray�� ������� score���� 0��°�� ����, 1��°�� ����, 2��°�� �������� get
			long k20_kor = (long)k20_score.get(0); // ����
			long k20_eng = (long)k20_score.get(1); // ����
			long k20_mat = (long)k20_score.get(2); // ����
			System.out.println("���� : " + k20_kor); // �������� ���
			System.out.println("���� : " + k20_eng); // �������� ���
			System.out.println("���� : " + k20_mat); // �������� ���
			System.out.println("���� : " + (k20_kor + k20_eng + k20_mat)); // ���� ���
			System.out.println("��� : " + ((k20_kor + k20_eng + k20_mat)/3.0)); // ��� ���
			System.out.println("**********************************");
		}
	}
}
