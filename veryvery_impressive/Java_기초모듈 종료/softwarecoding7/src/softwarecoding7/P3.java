///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 3. �����ڵ� �ʵ� ����/ó��
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

public class P3 {

	public static void main(String[] args) throws IOException {
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\7\\�뱸������ �ϱ�_����ü�_20200501.csv");
		// ���۸��� ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// ���� �����͸� ���� String
		ArrayList<String> data_ArrayList = new ArrayList<String>();
		// ������ ũ�Ⱑ ���� �𸣴ϱ�...ArrayList��...
		String k20_readtxt;
		// �����͸� �󸶳� �Է��ߴ��� ��Ÿ�� Integer �ʱ�ȭ. ���簪�� �翬�� 0
		int k20_cnt = 0;
		// �����͸� �о�� ���� ���ǹ�. ���� ������ ��!
		while ((k20_readtxt = k20_br.readLine()) != null) {
			data_ArrayList.add(k20_readtxt); // List�� add�Ѵ�...
			k20_cnt++; // ����� ���� ������..����ȭ ����...
		}
		// �۾� ����� close�ϴ� ����
		k20_br.close();
		
		String [] OneRec = new String[data_ArrayList.size()]; // �ٽ� Array�� ��ƾ� ��..
		// ArrayList size��ŭ�� ũ�� ���� Array��...
		
		for (int i = 0; i < data_ArrayList.size(); i++) {
			OneRec[i] = data_ArrayList.get(i); // ����ش�..
		}
		// OneRec�� �ڷᰡ ��� ����...
		String [] field_name = OneRec[0].split(","); // �ɰ���..�ʵ��
		for (int i = 1; i < OneRec.length; i++) { // 1���� �ؾ� �ʵ�� �ȳ�����..
			String [] field = OneRec[i].split(","); // �ɰ���..�ʵ�
			System.out.printf("*********************************************\n");
			for (int j = 0; j < field_name.length; j++) { // ��� ���� �� �����ϱ�..0����
				System.out.printf(" %s : %s\n", field_name[j], field[j]); // ����ؾ� �Ѵ�..
			}
			System.out.printf("*********************************************\n");
		}
		

	}

}
