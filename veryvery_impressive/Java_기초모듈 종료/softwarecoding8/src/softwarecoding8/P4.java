package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class P4 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 4. �Ÿ����
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException, CsvValidationException, NumberFormatException {
		// ���������� ������ ��� �Է�����
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\8\\���������������ǥ�ص�����.txt");
		// ���۸����� ����� ���̱� ������, ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// �о�� �����͸� ���� String ����
		String k20_readtxt;
		// ����������, �����͸� �о�� ���� ���ǹ���.
		// ������ if������ �� �ѹ� �ǽõǱ� ������, ù ��° �ٿ� ���ؼ��� �ش��.
		if ((k20_readtxt = k20_br.readLine()) == null) {
			// ù ��° ���� ��������� �� �����̶�� �˷��ֵ��� ��.
			System.out.printf("�� �����Դϴ�.\n");
			// ���ǹ� ��������.
			return;
		}
		// ����������� �������� ù ��° �ٿ���
		// �����Ͱ� �������� �з��Ǿ����� �̸��� ������ ����.
		// ���� �� �����Ͱ� ������ �̻��ϱ� ������,
		// ������ �и��Ǵ� txt���Ϸ� �����Ͽ� ��������. ���� \t���� split��.
		String[] k20_field_name = k20_readtxt.split("\t");
		// ������� ����
		double k20_lat = 37.3860521;
		// ������� �浵
		double k20_lng = 127.1214038;
		// ������� �����浵�� Ȱ���Ͽ� ��������������� ���� ��� ��
		// ��� ���� �Ÿ��� ���� ������� Ȯ�� ����.
		// ��Ȯ�� �Ÿ��� �ƴ�����, ���浵 ������ ��Ÿ��� ���� �������ν�
		// ������� ������ ���� �� ����.
		int k20_LineCnt = 0; // �� Integer�� �̿��� �� ��° �׸����� ǥ���� ����
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// �����͸� �о�� �� �� �پ� �о�� ����.
			// ���������� \t���� �ɰ���. 3�� �ǽ��� �ٸ���!
			String[] k20_field = k20_readtxt.split("\t");
			// �� ��° �׸����� ǥ���ϴ� ��
			System.out.printf("**[%d��° �׸�]***************\n", k20_LineCnt);
			// ������ ���� �ּҿ� �� ���γ����� ǥ��
			System.out.printf(" %s : %s\n", k20_field_name[9], k20_field[9]);
			// �������� ������ ǥ��
			System.out.printf(" %s : %s\n", k20_field_name[12], k20_field[12]);
			// �������� �浵�� ǥ��
			System.out.printf(" %s : %s\n", k20_field_name[13], k20_field[13]);
			// ���� �Ʊ��� ����� �����浵�� Ȱ���Ͽ� �Ÿ��� ����� ����.
			// k20_dist�� ��Ÿ��� ������ Ȱ���� �����浵 ������.
			double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[12]) - k20_lat, 2)
					+ Math.pow( Double.parseDouble(k20_field[13]) - k20_lng, 2));
			// ������������ �Ÿ��� �� �����͸��� ǥ��
			System.out.printf(" ���������� �Ÿ� : %f\n", k20_dist);
			// �� ���� ����Ǿ����� �˷��ִ� �� ǥ��
			System.out.printf("*****************************\n");
			// �� �� �о�� ������ Cnt ���
			k20_LineCnt++;
		}
		// ���������� �۾������ close�ϴ� ���� ���̱�
		k20_br.close();
	}
}
