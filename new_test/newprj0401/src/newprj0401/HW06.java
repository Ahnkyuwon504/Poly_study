package newprj0401;

public class HW06 {
	
	public static int taxcal(int val, int rate) {
		///////////////////////////////////////////////////
		// #6. ��Ģ����6�� / 2021.04.01. / 2125341020 �ȱԿ�
		// �ܼ� ���� ���
		int k20_ret;	// k20_ret ���� ����
		
		if (((double)val*(double)rate/100.0) == val*rate/100) {	// double�� ����Ҷ���
																// int�� ����� ���� �ٸ� ���� ������.
			k20_ret = val*rate/100;								// ������ �״�� ���
		} else {
			k20_ret = val*rate/100 + 1; 						// �ٸ��� 1�� ������. 
		}														// ���� �� ���� ���ؼ� 1�� �� �޴°���.
		return k20_ret;											// ��쿡 ���� �ٸ� k20_ret�� ���ϵ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_val, k20_rate, k20_tax;							// k20_val, k20_rate, k20_tax ����
		
		k20_val = 271;	// k20_val�� ���� 271
		k20_rate = 3;	// k20_rate�� ���� 3
		k20_tax = taxcal(k20_val, k20_rate);	// k20_tax�� ���� ��������, ������ ���� taxcal �޼ҵ� ��ħ.
		
		System.out.printf("*******************************\n");	// ���ݰ���� �� ���� ���
		System.out.printf("*    �ܼ� ���� ���               *\n");	// �ܼ� ���ݰ��
		System.out.printf("���� ���ݰ��: %f\n", k20_val*k20_rate/100.0);	// �Ҽ��������� ���� ���
		System.out.printf("��������: %d ����: %d �����԰���: %d\n", k20_val, k20_tax, k20_val+k20_tax);
		System.out.printf("*******************************\n");	// �������ݰ� ������ ����, �����԰��� ���
	}
}
