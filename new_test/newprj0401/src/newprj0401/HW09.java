package newprj0401;

public class HW09 {
	///////////////////////////////////////////////////
	// #9. ��Ģ����9�� / 2021.04.01. / 2125341020 �ȱԿ�
	// �ܼ� ȯ�� ���
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
		
		System.out.printf("************************************************\n"); // ������ ���
		System.out.printf("*             ������ ���� ���                     *\n"); // ���� ���
		System.out.printf(" �� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", // ȯ���ݾ�, ���� ��ȭ, �ܵ�
				k20_MyWon, k20_usd, k20_remain);
		System.out.printf("************************************************\n"); // ������ ���

	}

}
