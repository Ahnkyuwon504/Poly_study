package newprj0401;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #5. ��Ģ����5�� / 2021.04.01. / 2125341020 �ȱԿ�
		// �Ҽ��� �ڸ��� �ݿø� ���� ó��
		
		int k20_MyVal;	// k20_MyVal ���� ����
		k20_MyVal = 14/5;	// k20_MyVal ������ ���� 14/5 ����. 2�� �ɰ���.
		
		System.out.printf("#5-1 : %d\n" , k20_MyVal);	// k20_MyVal ���
		
		double k20_MyValF;	// �̹��� k20_MyVal ������ double���·� �����Ͽ� �����Ͽ���.
		
		k20_MyValF = 14/5;	// k20_myValF�� ���� �����Ͽ���.
		System.out.printf("#5-2 : %f\n" , k20_MyValF);	// double������ 2.0 ���·� ��µ�
		k20_MyValF = 14.0/5;							// 14.0���� double���·� ������ �����Ͽ� �� �ο�
		System.out.printf("#5-3 : %f\n" , k20_MyValF);	// int������ ������ �ƴϹǷ� 2.8 ��µɰ���
		k20_MyValF = (14.0)/5+0.5;						// �������� ���� �ǰ� 0.5�� ������ 3.3000 �ɰ���
		System.out.printf("#5-4 : %f\n" , k20_MyValF);	// 3.300000�� ���
		k20_MyValF = (int)((14.0)/5+0.5);				// ���� ���� ����� ���������, int������ ����
		System.out.printf("#5-5 : %f\n" , k20_MyValF);	// ���� 3.3�� 3.000000���� �ٲ�� ��µ�.
	}
}
