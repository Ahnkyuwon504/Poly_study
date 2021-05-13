package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class P10_Where_CloseOrFar {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 4. ������ �ǽ� / ��������� ���� ����� ��, �� �� ã�� �μ�
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException, CsvValidationException, NumberFormatException {
		// ���������� ������ ��� �Է�����
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\8\\���������������ǥ�ص�����.txt");
		// ���۸����� ����� ���̱� ������, ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// �о�� �����͸� ���� String ����
		String k20_readtxt;
		// ������� ����
		double k20_lat = 37.3860521;
		// ������� �浵
		double k20_lng = 127.1214038;
		// ������� �����浵�� Ȱ���Ͽ� ��������������� ���� ��� ��
		// ��� ���� �Ÿ��� ���� ������� Ȯ�� ����.
		// ��Ȯ�� �Ÿ��� �ƴ�����, ���浵 ������ ��Ÿ��� ���� �������ν�
		// ������� ������ ���� �� ����.
		
		// ����� ���� �Ÿ��� ������ double
		double k20_closeWIFI = Double.MAX_VALUE;
		// �� ���� �Ÿ��� ������ double
		double k20_farWIFI = Double.MIN_NORMAL;
		
		// ����� ���� �Ÿ����� ������ String
		String k20_closeWIFI_location = "";
		// �� ���� �Ÿ����� ������ String
		String k20_farWIFI_location = "";
		
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// �����͸� �о�� �� �� �پ� �о�� ����.
			// ���������� \t���� �ɰ���.
			String[] k20_field = k20_readtxt.split("\t");
			// ���� �Ʊ��� ����� �����浵�� Ȱ���Ͽ� �Ÿ��� ����� ����.
			// k20_dist�� ��Ÿ��� ������ Ȱ���� �����浵 ������.
			try {
				// try catch�� ����� ������ �߻��ϴ��� continue �ϵ��� ó��
				// ���� ������ Ư���� ������ ������ ���� ����.
				// �����浵�� �Ÿ� ���
				double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[12]) - k20_lat, 2)
						+ Math.pow( Double.parseDouble(k20_field[13]) - k20_lng, 2));
				// ���� ���� �Ÿ��� ũ�ٸ�, �� �Ÿ��� ������ ����. ���� �ο�
				if (k20_dist > k20_farWIFI) {
					// farWIFI �Ÿ� �ʱ�ȭ
					k20_farWIFI = k20_dist;
					// farWIFI �Ÿ��� �ʱ�ȭ
					k20_farWIFI_location = k20_field[9];
				} 
				// ���� ���� �Ÿ��� �۴ٸ�, ����� �Ÿ��� ������ ����. ���� �ο�
				if (k20_dist < k20_closeWIFI) {
					// closeWIFI �Ÿ� �ʱ�ȭ
					k20_closeWIFI = k20_dist;
					// closeWIFI �Ÿ��� �ʱ�ȭ
					k20_closeWIFI_location = k20_field[8];
				}
				// �����̰ų� String�̾ double����� �ȵǴ� ������ �߻��Ͽ����Ƿ�,
				// ���� �߻��� continue
			} catch (NumberFormatException k20_e) {
				continue;
			}
			  catch (Exception k20_e) {
			}
		}
		// ���������� �۾������ close�ϴ� ���� ���̱�
		k20_br.close();
		// ���� ����� �� ���
		System.out.printf("���� ����� �� : %s , ���������� �Ÿ� : %f\n",
						   k20_closeWIFI_location, k20_closeWIFI);
		// ���� �� �� ���
		System.out.printf("����   ��   �� : %s , ���������� �Ÿ� : %f\n",
						   k20_farWIFI_location, k20_farWIFI);
	}
}

