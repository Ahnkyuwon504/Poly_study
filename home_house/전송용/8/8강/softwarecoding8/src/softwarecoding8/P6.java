package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P6 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 6. �� ���� �������� ��������
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
 	public static void main(String[] args) throws IOException {
 		// ���������� ������ ��� ����, �����͸� �о�� ������.
		File k20_f = new File("E:\\Download\\�� ���� (2)\\day_data\\THTSKS010H00.dat");
		// ���۸����� ����� ����.
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// ���������� ������ ��� ����, ���� �Է��� ������. 
		File k20_f1 = new File("E:\\Download\\�� ���� (2)\\day_data\\StockDailyPrice.csv");
		// ���۶����͸� ����� ����.
		BufferedWriter k20_bw1 = new BufferedWriter (new FileWriter(k20_f1));
		// �о�� �� ����� k20_readtxt String ����
		String k20_readtxt;
		// �� ���� Integer ����
		// k20_cnt�� �о�� ������ ������ ����
		// k20_wcnt�� ���� �Է��� ������ ������ ����
		int k20_cnt = 0; int k20_wcnt = 0;
		// ���������� ������ �о�� ���� ���ǹ�
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// �� �� ���� ������ ������ ����� StringBuffer ����
			StringBuffer k20_s = new StringBuffer();
			// �����ڸ� %_%�� ��� split�Ͽ� k20_field String Array�� �����.
			String[] k20_field = k20_readtxt.split("%_%");
			// 1���� : �����ڸ� �Ű��� split�� �� String���� ũ�Ⱑ 2���� ũ��.
			// 2���� : �� �ʵ忡�� ^�� ������ �յ� ������ ������ �� ù���ڰ� A�� ���� ���
			// �� ��, trim()�޼ҵ�� ���ڿ��� �յ� ������ ���������� ������ �Ѵ�.
			if (k20_field.length > 2 && k20_field[2].replace("^", "").
					trim().substring(0,1).equals("A")) {
				// k20_s�� �߰����ش�. 
				// �� �߰��ϳĸ�, 0��° �ʵ忡�� ^�� ������ �յ� ������ ������ �����.
				k20_s.append(k20_field[0].replace("^", "").trim());
				// ���� 1��°���� ������ �ʵ����
				for (int j = 1; j < k20_field.length; j++) {
				// ��ǥ + �� �ʵ忡�� ^�� ���� ����� �߰����ش�.
				// �� ���� �翬�� trim�Ͽ� �յ� ���� �����־���.
					k20_s.append("," + k20_field[j].replace("^", "").trim());
				}
				// ���� k20_s�� �ϼ��Ǿ���! �̰��� bw1 ��ü�� ���� write�Ѵ�.
				k20_bw1.write(k20_s.toString());k20_bw1.newLine();
				// write �Ҷ����� write count ���
				k20_wcnt++;
			}
			// �о�� ������ count ���
			// count�� write count�� �ٸ���. �翬�� ������ �ɾ 
			// �� ������ write���־��� �����̴�...
			k20_cnt++;
		}
		// �۾� ���� �� �о�� ���ϰ� �Է��� ���� ��� close�Ѵ�.
		k20_br.close();
		k20_bw1.close();
		// �۾� ���� �� �о�� ������ �� ����, �Է��� ������ �� ���� ���
		System.out.printf("Program End[%d][%d]records\n", k20_cnt, k20_wcnt);
	}
}
