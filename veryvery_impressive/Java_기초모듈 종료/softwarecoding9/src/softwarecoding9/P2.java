package softwarecoding9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class P2 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 9�� : XML, JSON
	// 2. JSON �����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
	// ���θ޼ҵ�� ������ �޼ҵ�.
	// �� �л����� ���� ���� ������Ʈ�� �ִµ�, �� �л����� ������ �߰��ϴ� �ͺ���
	// �� �л��� �̸�, �й�, ������ ��ü�����ÿ� �ƿ� �־������ �޼ҵ带 ���� ����.
		// �׸��Ͽ� ���� JSONObject ��ü. ���⿡ ������Ʈ �ְ� return�Ұ���.
		JSONObject k20_dataObject = new JSONObject();
		// name�� �±� name ��� �״��
		k20_dataObject.put("name", name);
		// studentid�� �±� studentid ��� �״��
		k20_dataObject.put("studentid", studentid);
		// score�� ���ѹ� �� ���� �������� �������� ������ JSONArray ����
		JSONArray k20_score = new JSONArray();
		// JSONArray�� ����, ����, ���� ���� �߰�
		k20_score.add(kor); k20_score.add(eng); k20_score.add(mat);
		// �ϼ��� score�� ��ü�� �߰�
		k20_dataObject.put("score", k20_score);
		// ��ü�� �Ϸ�Ǿ����Ƿ� return
		return k20_dataObject;
	}

	public static void main(String[] args) {
		// ��� ���� ���� JSONObject
		JSONObject k20_jsonObject = new JSONObject();
		// �켱 �������� �л��̹Ƿ� �л��� ���� JSONArray ����
		JSONArray k20_datasArray = new JSONArray();
		// JSONArray�� ���� ������ JSONObject ����. �Ѹ��� �л� ������ ��.
		JSONObject k20_dataObject = new JSONObject();
		// �� ���� object�� �̸� ���� �߰�
		k20_dataObject.put("name", "����");
		// �� ���� object�� �й� �߰�
		k20_dataObject.put("studentid", "209901");
		// �� ���� object�� ���� score JSONArray ����
		JSONArray k20_score = new JSONArray();
		// score JSONArray�� ������ ���� �߰�
		k20_score.add(90); k20_score.add(100); k20_score.add(95);
		// score JSONArray�� �ϼ��Ǿ����Ƿ� ������ �߰�
		k20_dataObject.put("score", k20_score);
		// �׷��� ������� ������ Array�� �߰�
		k20_datasArray.add(k20_dataObject);
		// ���ôٽ��� �ſ� ������...� �л��� �߰��ϴ��� �׿� �����ϴ� ������ �ʿ���.
		// ����, � �л��� �߰��ϴ��� ���� �����̹Ƿ� �� ������ �������� �޼ҵ带 ������ ���� ����...
		k20_datasArray.add(oneRec("����", 209902, 100, 85, 75)); // �޼ҵ� �̿��Ͽ� �����л� JSONObject �߰�
		k20_datasArray.add(oneRec("���", 209903, 90, 75, 85)); // �޼ҵ� �̿��Ͽ� ����л� JSONObject �߰�
		k20_datasArray.add(oneRec("�糪", 209904, 90, 85, 75)); // �޼ҵ� �̿��Ͽ� �糪�л� JSONObject �߰�
		k20_datasArray.add(oneRec("��ȿ", 209905, 80, 75, 85)); // �޼ҵ� �̿��Ͽ� ��ȿ�л� JSONObject �߰�
		k20_datasArray.add(oneRec("�̳�", 209906, 90, 85, 55)); // �޼ҵ� �̿��Ͽ� �̳��л� JSONObject �߰�
		k20_datasArray.add(oneRec("�ٿ�", 209907, 70, 75, 65)); // �޼ҵ� �̿��Ͽ� �ٿ��л� JSONObject �߰�
		k20_datasArray.add(oneRec("ä��", 209908, 100, 75, 95)); // �޼ҵ� �̿��Ͽ� ä���л� JSONObject �߰�
		k20_datasArray.add(oneRec("����", 209909, 80, 65, 95)); // �޼ҵ� �̿��Ͽ� �����л� JSONObject �߰�
		
		try {
			// �ϼ��� JSONArray�� �Է��ؾ��ϹǷ�, FileWriter ��ü ����
			FileWriter k20_file = new FileWriter("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\9\\test.json");
			// ���Ͽ� �Է�
			k20_file.write(k20_datasArray.toJSONString());
			k20_file.flush(); // �� ����
			k20_file.close(); // ��Ʈ�� �� ������. �޸� ���� �ϵ��ũ �󿡼� �Է� �� close�ϴ°� ��������!!
		} catch (IOException k20_e) {
			// ���� �߻��� �⵵�� ó��
			k20_e.printStackTrace();
		}
		// �� �糪 ����...
		System.out.println("JSON ����� : " + k20_datasArray);
	}
}
