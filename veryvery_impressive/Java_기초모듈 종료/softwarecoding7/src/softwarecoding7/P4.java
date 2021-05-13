///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 4. �����ڵ� �ʵ� ����/ó�� 2
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class P4 {
	public static void main(String[] args) throws IOException {
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\7\\�λ걤����_�ϱ�_�糭 ����� ����ü� ��Ȳ_20210219.csv");
		// ���۸��� ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// ���� �����͸� ���� String
		ArrayList<String> k20_data_ArrayList = new ArrayList<String>();
		// ������ ũ�Ⱑ ���� �𸣴ϱ�...ArrayList��...
		String k20_readtxt;
		// �����͸� �о�� ���� ���ǹ�. ���� ������ ��!
		while ((k20_readtxt = k20_br.readLine()) != null) {
			k20_data_ArrayList.add(k20_readtxt); // List�� add�Ѵ�...
		}
		// �۾� ����� close�ϴ� ����
		k20_br.close();
		
		String [] k20_OneRec = new String[k20_data_ArrayList.size()]; // �ٽ� Array�� ��ƾ� ��..
		// ArrayList size��ŭ�� ũ�� ���� Array��...
		
		for (int k20_i = 0; k20_i < k20_data_ArrayList.size(); k20_i++) {
			k20_OneRec[k20_i] = k20_data_ArrayList.get(k20_i); // ����ش�..
		}
		// OneRec�� �ڷᰡ ��� ����...
		k20_OneRec[0] = k20_OneRec[0].replace("\"", "");
		String [] k20_field_name = k20_OneRec[0].split(","); // �ɰ���..�ʵ��
		for (int k20_i = 1; k20_i < k20_OneRec.length; k20_i++) { // 1���� �ؾ� �ʵ�� �ȳ�����..
			k20_OneRec[k20_i] = k20_OneRec[k20_i].replace("\"", "");
			String [] k20_field = k20_OneRec[k20_i].split(","); // �ɰ���..�ʵ�
			
			k20_field[0] = P4_GetHanguel.get_Hanguel(Integer.parseInt(k20_field[0])); // �ѱ۷κ�ȯ
			k20_field[3] = P4_GetHanguel.get_Hanguel(Integer.parseInt(k20_field[3])); // �ѱ۷κ�ȯ
			k20_field[6] = P4_GetHanguel.get_Hanguel_FromPhone(k20_field[6]); // ��ȭ��ȣ..��ȯ
			
			System.out.printf("*****************************************************\n");
			for (int k20_j = 0; k20_j < k20_field_name.length; k20_j++) { // ��� ���� �� �����ϱ�..0����
				System.out.printf(" %s : %s\n", k20_field_name[k20_j], k20_field[k20_j]); // ����ؾ� �Ѵ�..
			}
			System.out.printf("*****************************************************\n");
		}
	}
}
