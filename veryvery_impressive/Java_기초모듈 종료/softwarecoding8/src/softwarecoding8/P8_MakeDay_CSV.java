package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P8_MakeDay_CSV {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 7. ������ �ǽ� / 19951124�� ��� ���� ���� �����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// �о�� ������ ��� ����
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\8\\StockDailyPrice.csv");
		// ���۸��� ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// �Է��� ������ ��� ����
		File k20_f1 = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\8\\19951124.csv");
		// ���۶����� ��ü ����
		BufferedWriter k20_bw1 = new BufferedWriter (new FileWriter(k20_f1));
		// �о�� �����͸� �� �� �� �� ���� String ����
		String k20_readtxt;
		// �Է��� �����͸� �� �� �Է����� Ȯ���� Integer ����, ���� �翬�� 0
		int k20_cnt = 0;
		int k20_wcnt = 0;
		// ������ �о�� ���ǹ� ����
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// ���������� �޸� �������� �ɰ��� String Array�� �־���
			String[] k20_field = k20_readtxt.split(",");
			// 1995�� 11�� 24�Ͽ� �ش��ϴ� ��� ������ �������� ����
			// ���ǹ� �ο�
			// �̰� �� ������.
			if (k20_field[1].equals("19951124")) {
				// ������ �Է�. �Է� �� ���� �������� �佺
				k20_bw1.write(k20_readtxt); k20_bw1.newLine();
				k20_wcnt++;
			}
			// �� �� �о�� ������ ī��Ʈ ���
			k20_cnt++;
		}
		// �۾� ����� close
		k20_br.close();
		k20_bw1.close();
		// �۾� ����� �� �� �о����� Ȯ��
		System.out.printf("Program End[%d][%d]records\n", k20_cnt, k20_wcnt);
	}
}
