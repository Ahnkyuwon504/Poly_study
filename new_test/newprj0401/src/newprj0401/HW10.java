package newprj0401;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW10 {
	///////////////////////////////////////////////////
	// #10. ��Ģ����10�� / 2021.04.01. / 2125341020 �ȱԿ�
	// ������ ���� ȯ�� ���(1)
	///////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_MyWon, k20_usd, k20_remain; // int������ ����
		double k20_MoneyEx, k20_commission; // double������ ����
		
		k20_MyWon = 1000000; // 100������ ������ ����.
		k20_MoneyEx = 1238.21; // ���� ȯ���� 1238.21
		k20_commission = 0.003; // ȯ��������� 0.3�ۼ�Ʈ
		
		k20_usd = (int) (k20_MyWon/k20_MoneyEx); // �� 100������ ȯ���� ����, �� ���� ���� �޷�
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx); // �޷��� �ް� 1�޷��� �ȵǴ� ���� ��ȭ��.
		
		double k20_ComPerOne = k20_MoneyEx * k20_commission; // 1�޷��� ������
		double k20_totalcom = k20_usd * k20_ComPerOne; // ���� ���� �޷��� �����Ḧ ����, �� ������ ������
		
		System.out.printf("************************************************************\n"); // ������ ���
		System.out.printf("*             ������ ���                                     *\n"); // ���� ���
		System.out.printf(" �� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", // ������, ��ȭ, ������ ������
				k20_totalcom, k20_usd, k20_ComPerOne);
		System.out.printf("************************************************************\n"); // ������ ���
		
		
		
		
		
		
		
		///////////////////////////////////////////////////
		// #11. ��Ģ����11�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ������ ���� ȯ�� ���(2)
		///////////////////////////////////////////////////
		
		int k20_i_totalcom; // int������ ����, �ø�ó���� ��������.
		
		if (k20_totalcom != (double) ((int)k20_totalcom)) { // �����Ǿ��� ����
			k20_i_totalcom = (int) k20_totalcom + 1; // 1�� �����ְ�
		} else { // �������� �ʰ� ���� ����
			k20_i_totalcom = (int) k20_totalcom; // �״�� �������ش�.
		}
		
		System.out.printf("************************************************************\n"); // ������ ���
		System.out.printf("*             ������ ����ȯ��                                  *\n"); // ���� ���
		System.out.printf(" �� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", // �� ������
				k20_i_totalcom, k20_usd, k20_ComPerOne);                    // ��ȭ�׼��� �޷���������
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx - k20_i_totalcom); // �ܵ� ����
		System.out.printf(" �� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������û��:%d�� �ܵ�: %d��\n", // ������, ��ȭ, ������ ������
				k20_MyWon, k20_usd, k20_i_totalcom, k20_remain); // ���ǵ� �ܵ��� ���
		System.out.printf("************************************************************\n"); 
		
		///////////////////////////////////////////////////
		// #12. ��Ģ����12�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ������ ���� ȯ�� ���(3)
		///////////////////////////////////////////////////
		
		k20_usd = (int) (k20_MyWon / (k20_MoneyEx + k20_ComPerOne)); // ȯ���޷�
		k20_totalcom = k20_usd * k20_ComPerOne; // �� ������
		
		if (k20_totalcom != (double)((int)k20_totalcom)) { // �� �����Ḧ �ø�ó���ϱ� ���� if��
			k20_i_totalcom = (int) k20_totalcom +1; // double�� int�� �ٸ���, �� ����ó���� +1
		} else {
			k20_i_totalcom = (int) k20_totalcom; // �����ϸ� �״��!
		}
		
		System.out.printf("************************************************************\n"); // ������ ���
		System.out.printf("*            (��Ȯ��)������ ����ȯ��                             *\n"); // ���� ���
		System.out.printf(" �� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", // �� ������
				k20_i_totalcom, k20_usd, k20_ComPerOne);                    // ��ȭ�׼��� �޷���������
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx - k20_i_totalcom); // �ܵ� ������
		System.out.printf(" �� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������û��:%d�� �ܵ�: %d��\n", // ������, ��ȭ, ������ ������
				k20_MyWon, k20_usd, k20_i_totalcom, k20_remain); // �����ǵ� �ܵ��� ���
		System.out.printf("************************************************************\n"); 
		
		
		///////////////////////////////////////////////////
		// #14. ��Ģ����14�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ���� ��¥, �ð� ���
		//////////////////////////////////////////////////
		
		Calendar calt = Calendar.getInstance(); // Calendar ���̺귯���� import�Ͽ� ��¥ ǥ���Ұ���.
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); // ��¥ ǥ���ϴ� ����!
		DecimalFormat df = new DecimalFormat ( "###,###,###,###,###" ); // DecimalFormat�� �̿��Ͽ� �޸���������. �� �࿡���� import�Ͽ���.
		
		System.out.printf("************************************************************\n"); // ������ ���
		System.out.printf("*            �޸����, ��¥ ����                                *\n"); // ���� ���
		System.out.printf(" �� ������: %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n", // �� ������
				df.format(k20_i_totalcom), df.format(k20_usd), k20_ComPerOne); // ��ȭ�׼��� �޷���������
		
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx - k20_i_totalcom); // �ܵ� ����
		System.out.printf(" �� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷�, ������û��:%s�� �ܵ�: %s��\n", // ������, ��ȭ, ������ ������, �ܵ� ���
				df.format(k20_MyWon), df.format(k20_usd), 
				df.format(k20_i_totalcom), df.format(k20_remain)); 
		System.out.printf(" ��������ð�: %s\n", sdt.format(calt.getTime())); // ������ ������ �࿡ ��³�¥�� ������ ����.
		System.out.printf("************************************************************\n"); // ������ ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
