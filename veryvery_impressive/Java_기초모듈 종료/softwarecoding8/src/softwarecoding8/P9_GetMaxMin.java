package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P9_GetMaxMin {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 7. ������ �ǽ� / �Ｚ���� 2015�� ������ �ִ밪, �ּҰ�
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// ������ �о�� ��� ����
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\8\\StockDailyPrice.csv");
		// ���۸��� ��ü ����
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		// ������ �о�ͼ� ���� String ����
		String k20_readtxt;
		// Maximum�� �� Integer
		// �ʱ�ȭ �ÿ��� Integer�� �ּڰ� �ο�. 0���� �̰� �����ϴ�.
		int k20_Max_2015_closing = Integer.MIN_VALUE;
		String k20_Max_2015_when = "";
		// Minimum�� �� Integer
		// �ʱ�ȭ �ÿ��� Integer�� �ִ� �ο�. 0���� �̰� �����ϴ�.
		int k20_Min_2015_closing = Integer.MAX_VALUE;
		String k20_Min_2015_when = "";
		// ������ �о�� ���ǹ�
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// ���������� �޸��� �ɰ���
			String[] k20_field = k20_readtxt.split(",");
			// ���� 2015�⿡ �ش��ϰ�, �Ｚ������ �ڵ�� ���ٸ�
			if (k20_field[1].contains("2015") && k20_field[2].equals("A005930")) {
				// Maximum���� �ʱ�ȭ���� ���ǹ�
				if (Integer.parseInt(k20_field[3]) > k20_Max_2015_closing) {
					// �ش� �ʵ尪�� Max�� �ʱ�ȭ
					k20_Max_2015_closing = Integer.parseInt(k20_field[3]);
					k20_Max_2015_when = k20_field[1];
				}
				// Minimum���� �ʱ�ȭ���� ���ǹ�
				if (Integer.parseInt(k20_field[3]) < k20_Min_2015_closing) {
					// �ش� �ʵ尪�� Min�� �ʱ�ȭ
					k20_Min_2015_closing = Integer.parseInt(k20_field[3]);
					k20_Min_2015_when = k20_field[1];
				}
			}
		}
		// �۾� ���� �� close
		k20_br.close();
		// Max�� Min�� Ȯ��
		System.out.printf("Max : %d  / when? %s\nMin : %d  / when? %s\n",
				k20_Max_2015_closing, k20_Max_2015_when, k20_Min_2015_closing, k20_Min_2015_when);
	}
}
