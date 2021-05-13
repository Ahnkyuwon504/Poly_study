package softwarecoding8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 1. �����ϰ� �а� ����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try { // try, catch ������ ���� �߻��ϸ� ���
			File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\Mytest.txt");
			// File ��ü����, ��δ� ���� ã�Ƽ� �ٿ��ֱ�
			FileWriter k20_fw = new FileWriter(k20_f);
			// FileWriter ��ü����
			FileReader k20_fr = new FileReader(k20_f);
			// FileReader ��ü����
			k20_fw.write("�ȳ� ����\n"); // �ȳ� �����̶�� String�� ���Ͽ� write
			k20_fw.write("hello ���\n"); // hello ��ζ�� String�� ���Ͽ� write
			k20_fw.close(); // �Է� �� �ݵ�� close�ؾ� ��!
			
			int k20_n = -1; // -1�� �ʱ�ȭ. ���� -1�̵Ǹ� �о���� �ݺ��� break
			char [] k20_ch; // �о�� data�� ���� char Array �׸�
			
			while(true) {  // �ݺ����� break������ �����ɶ����� �ݺ��ȴ�.
				k20_ch = new char[100]; // char Array �׸��� ũ�⸦ 100���� ����
				k20_n = k20_fr.read(k20_ch); // �� �׸��� �о�� data�� ��´�
				
				if (k20_n == -1) break; // �ѹ� ���� ��, �о�� �� ������ -1�� �Ǿ�
				// break�ȴ�. �� ������ ������ ���α׷��� ������ �ʴ´�.
				for (int k20_i = 0; k20_i < k20_n; k20_i++) {
				// for (char c : ch) {
				// ������ data�� ���� k20_n�� ũ�⸸ŭ for�� �ǽ�
					System.out.printf("%c", k20_ch[k20_i]);
				} // for���� �����鼭 char�� ����Ѵ�.
			}
			// ��� ���� �� �ݵ�� close �ؾ���! write�� ��������.
			k20_fr.close();
			// ���� ����� ����Ǿ����� while�� ����� ����. �� ������ �˷��ִ�
			// END���� ���
			System.out.printf("\n FILE READ END!");
		} catch (Exception k20_e) { // ���� ���� �߻���
			System.out.printf("�� ����[%s]\n", k20_e); // ���� ������ ����Ͽ�
			// ����� �� �ֵ��� �Ѵ�.
		}
	}
}
