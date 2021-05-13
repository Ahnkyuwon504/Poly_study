package softwarecoding8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7_MakeSamSung_CSV {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 7. ������ �ǽ� / �Ｚ���� ���� �����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException  {
		// ���� �о�� ��� ����
		File k20_f = new File("E:\\Download\\�� ���� (2)\\day_data\\StockDailyPrice.csv");
		// ���۸��� ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// ���� �Է��� ��� ����
		File k20_f1 = new File("E:\\Download\\�� ���� (2)\\day_data\\A005930.csv");
		// ���۶����� ��ü ����
		BufferedWriter k20_bw1 = new BufferedWriter (new FileWriter(k20_f1));
		// �о�� �����͸� ���� String ����
		String k20_readtxt;
		// �����͸� �󸶳� �Է��ߴ��� ��Ÿ�� Integer �ʱ�ȭ. ���簪�� �翬�� 0
		int k20_cnt = 0;
		// �����͸� �о�� ���� ���ǹ�. ���� ������ ��!
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// �о�� �����͸� �޸��� �ɰ� ����.
			// �̰��� �տ��� �޸� ���� csv������ ����� �־����Ƿ� ������ ��
			String[] k20_field = k20_readtxt.split(",");
			// ���ǹ�. �Ｚ������ �ڵ尪�� �ش��� ���� �ǽõ�.
			if (k20_field[2].equals("A005930")) {
				// ������ ������ ������ bw1 ��ü�� �Ű��� ������ �Է�
				// newLine�� ���� �� ���� �ٷ� �̵��Ͽ� �Է��ϵ��� ��.
				k20_bw1.write(k20_readtxt); k20_bw1.newLine();
			}
			// �� �� �Է½ø��� cnt ���.
			// �� �� �Է��ߴ��� �� Integer�� ���� Ȯ�� ����
			k20_cnt++;
		}
		// �۾� ����� close�ϴ� ����
		k20_br.close();
		k20_bw1.close();
		// �۾� ����� �� ���� �о����� Ȯ���ϴ� �䵵
		System.out.printf("Program End[%d]records\n", k20_cnt);
	}
}
