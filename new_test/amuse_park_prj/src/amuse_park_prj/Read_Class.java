package amuse_park_prj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_Class {
	public static List<List<String>> get_Array_savedData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\�ȱԿ�\\Desktop\\amusement_Ticket_Status.csv"));
		List<List<String>> AllLines_Data = new ArrayList<List<String>>();
		// �����Ͱ� ��� double List
		
		String line = ""; // ������ �� �پ� ����Ǵ� String
		while ((line = reader.readLine()) != null) { // ������ ���� ������ �ݺ�
			List<String> OneLines_Data = new ArrayList<String>(); // �����͸� ,�� ��� ����Ǵ� List<>
			OneLines_Data = Arrays.asList(line.split(","));
			// 1. �� ���� line�� ,�������� ����
			// 2. �������� ������ String[]�� �ǰ�, �̸� List�� ���� 
			// 3. �� �� �ϼ�
			AllLines_Data.add(OneLines_Data);
			// �� ���� List<List<>>�� �߰���.
		}
		//System.out.println(AllLines_Data.get(0).get(0));
		//System.out.println(AllLines_Data.get(0).get(0));
		//System.out.println(AllLines_Data.get(0).get(0));
		//System.out.println(AllLines_Data.get(0).get(0));
		reader.close();
		return AllLines_Data;
	}
}