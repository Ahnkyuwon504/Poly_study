package softwarecoding8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P11_Where_CloseOrFar_Parking {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 8��. File
	// 4. ������ �ǽ� / Ư�������� ���� ����� ����â/�� ������ ã�� �μ�
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		// ���������� ������ ��� �Է�����
		File k20_f = new File("C:\\Users\\�ȱԿ�\\Desktop\\java ȫ�ʵα�����\\8\\��������������.csv");
		// ���۸����� ����� ���̱� ������, ��ü ����
		BufferedReader k20_br = new BufferedReader (new FileReader(k20_f));
		// �о�� �����͸� ���� String ����
		String k20_readtxt;
		// ������� ����
		double k20_lat = 37.3860521;
		// ������� �浵
		double k20_lng = 127.1214038;
		// ����� ���� �Ÿ��� ������ double
		double closePARK = Double.MAX_VALUE;
		// �� ���� �Ÿ��� ������ double
		double farPARK = Double.MIN_NORMAL;
		// ����� ���� �Ÿ����� ������ String
		String closePARK_location = "";
		// �� ���� �Ÿ����� ������ String
		String farPARK_location = "";
		
		while ((k20_readtxt = k20_br.readLine()) != null) {
			// �����͸� �о�� �� �� �پ� �о�� ����.
			String[] k20_field = k20_readtxt.split(",");
			// ���� �Ʊ��� ����� �����浵�� Ȱ���Ͽ� �Ÿ��� ����� ����.
			try {
				// try catch�� ����� ������ �߻��ϴ��� continue �ϵ��� ó��
				// �����浵�� �Ÿ� ���
				double k20_dist = Math.sqrt( Math.pow( Double.parseDouble(k20_field[3]) - k20_lat, 2)
						+ Math.pow( Double.parseDouble(k20_field[2]) - k20_lng, 2));
				// ���� ���� �Ÿ��� ũ�ٸ�, �� �Ÿ��� ������ ����. ���� �ο�
				if (k20_dist > farPARK) {
					// farPARK �Ÿ� �ʱ�ȭ
					farPARK = k20_dist;
					// farPARK �Ÿ��� �ʱ�ȭ
					farPARK_location = "������� - " + k20_field[1] + " / �ּ� - " +  k20_field[6];
				} 
				// ���� ���� �Ÿ��� �۴ٸ�, ����� �Ÿ��� ������ ����. ���� �ο�
				if (k20_dist < closePARK) {
					// closePARK �Ÿ� �ʱ�ȭ
					closePARK = k20_dist;
					// closePARK �Ÿ��� �ʱ�ȭ
					closePARK_location = "������� - " + k20_field[1] + " / �ּ� - " +  k20_field[6];
				}
				// �����̰ų� String�̾ double����� �ȵǴ� ������ �߻��Ͽ����Ƿ�,
				// ���� �߻��� continue
			} catch (NumberFormatException e) {
				continue;
			}
			  catch (Exception e) {
			}
		}
		// ���������� �۾������ close�ϴ� ���� ���̱�
		k20_br.close();
		// ���� ����� ������ ���
		System.out.printf("���� ����� ������ : %s , ���������� �Ÿ� : %f\n",
						   closePARK_location, closePARK);
		// ���� �� ������ ���
		System.out.printf("����   ��   ������ : %s , ���������� �Ÿ� : %f\n",
						   farPARK_location, farPARK);

	}

}
