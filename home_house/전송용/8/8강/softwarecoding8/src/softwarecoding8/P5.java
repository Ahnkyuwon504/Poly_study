package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P5 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 5. ���� �Ⱦ�� �����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// ���������� ���� ��� ����
		File k20_f = new File("E:\\Download\\�� ���� (2)\\day_data\\THTSKS010H00.dat");
		// ���۸����� ����� ����.
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// �о�� �����͸� ������ String ����
		String k20_readtxt;
		// �� �� �� �� �о�� ������ LineCnt ��µ�
		int k20_LineCnt = 0;
		// k20_n�� �о�� �������� String size ����.
		// �о�� �����Ͱ� ���ٸ�, �� ���� -1�� �Ǿ� break���� ������.
		int k20_n = -1;
		// �о�� �����͸� ���� StringBuffer ���� �� ����
		StringBuffer k20_s = new StringBuffer();
		while(true) { // break���� �����ñ��� ���� �ݺ�
			// ���� ũ�Ⱑ 1000 size�� char Array
			char[] k20_ch = new char[1000];
			// �о�� �����Ͱ� ������ break��
			k20_n = k20_br.read(k20_ch);
			// �о�� �����Ͱ� ������ k20_n�� -1�� �Ǿ� break��
			if(k20_n == -1) break;
			// �о�� k20_ch�� char Array�̱� ������ 
			// �� ���� char�� �����ϸ鼭 for�� �ǽ�
			for (char k20_c : k20_ch) { // for���� k20_ch�� �ִ� char ������ŭ �ǽ�
				// �ٳѱ��� ������ �ȴٸ�,
				// �� �� �����Ͱ� �����ٸ�
				if (k20_c == '\n') {
					// *** ǥ��
					System.out.printf("[%s]***\n", k20_s.toString());
					// �� ���� �������Ƿ� delete
					k20_s.delete(0, k20_s.length());
					// ������ �������� ��� append����. ���� ������ ���� �� 
					// �ϼ��� k20_s�� ��µɰ���
				} else {
					k20_s.append(k20_c);
				}
			}
			// �� �� �� ������ Cnt ���
			k20_LineCnt++;
		}
		System.out.printf("[%s]***\n", k20_s.toString());
		// ���������� ����� close!!
		k20_br.close();
	}
}
