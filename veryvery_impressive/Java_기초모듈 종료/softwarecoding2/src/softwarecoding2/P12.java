package softwarecoding2;

public class P12 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 12. Casting Ex3
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f   = 9.1234567f; // ���� ���� �� �ʱ�ȭ. �ڿ� f
		double d  = 9.1234567; // ���� ���� �� �ʱ�ȭ
		double d2 = (double)f; // ���� ���� �� �ʱ�ȭ
		
		System.out.printf("f  =%20.18f\n", f); // f ���
		System.out.printf("d  =%20.18f\n", d); // d ���
		// d�� d2�� ���̴�, d�� ���ʿ� 9.1234567�� ������ ���̰�
		// d2�� float�� double�� ��ȯ�� ���̱� ������ ���ڸ��� ���� �ִ�..
		System.out.printf("d2 =%20.18f\n", d2);
	}
}
