package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P3 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 3. ���� ���Ͽ� ����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// ���������� �о�� ������ ��� �Է�
		File k20_f = new File("E:\\Download\\�� ���� (2)\\���������������.csv");
		// ���۸����� �о�� ����.
		BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
		// �о�� String�� ���� k20_readtxt ����
		String k20_readtxt;
		// ù ��° ������ �о�ͼ� k20_readtxt�� ���� ����.
		// ���۸����� ������, readLine�� �о�� ������ ������ ���� �ٷ� �Ѿ.
		// ���� �̹� if���� ����Ǹ�, ���� readLine �޼ҵ�� �� ��° ���� �о��.
		if ((k20_readtxt = k20_br.readLine()) == null) {
			// Ȥ�� ù ��° ���� ������ ���� ���� ����� if��
			System.out.printf("�� �����Դϴ�.\n");
			// �� �����̶�� �˷��� ����.
			return; // �׷��� if�� ����
		}
		// ����������������� ù ��° ���� �������� field���� ��Ÿ���� ����.
		// ���� �װ��� �޸��� split�� ��, k20_field_name String Array��
		// �־��� ����.
		String[] k20_field_name = k20_readtxt.split(",");
		// LineCnt�� Integer ����. �츮�� 100��° �ٱ����� ����� ���̶�..
		// �Ŀ� �� Integer�� �ø���, break�� �������� ����� ����.
		int k20_LineCnt = 0;
		// �����͸� �о�� ���� ���ǹ��� ���� �����ϴ�.
		// ���� �о�� ���� ��� ������ �׸� �д� ����!
		while((k20_readtxt = k20_br.readLine()) != null) {
			// ����������, �� �� �� �� ���� ������ �޸��� �ɰ��� String Array��
			// ���� �־��ش�.
			String[] k20_field = k20_readtxt.split(",");
			// �� �ٸ��� ���еǵ��� ���� �� ���
			System.out.printf("**[%d��° �׸�]***************\n", k20_LineCnt);
			// �� ��° �׸����� ǥ������ ����.
			for (int k20_j = 0; k20_j < k20_field_name.length; k20_j++) {
				// �Ʊ� ������ field_name�� ���� ��Դ´�.
				System.out.printf(" %s : %s\n", k20_field_name[k20_j], k20_field[k20_j]);
			}
			// �� ���� ����� ������� �� �� �ֵ��� �� ���
			System.out.printf("*******************************\n");
			// �츮�� 100��° ������ �ñ��ϹǷ�..break
			if (k20_LineCnt == 100) break;
			// �� �� �о�� ������ LineCnt�� �÷���.
			k20_LineCnt++;
		}
		// ��� ����� ����Ǹ�, �ݵ�� close ���� ��!
		k20_br.close();
	}
}
