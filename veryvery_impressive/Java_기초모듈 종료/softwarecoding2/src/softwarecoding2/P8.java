package softwarecoding2;

public class P8 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 8. Printf Ex2
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com"; // ���� ���� �� �ʱ�ȭ
		
		float f1 = .10f; // ���� ���� �� �ʱ�ȭ
		float f2 = 1e1f; // ���� ���� �� �ʱ�ȭ 1�ڿ� 0 1�� , �� 10
		float f3 = 3.14e3f; // ���� ���� �� �ʱ�ȭ 3.14 �ڿ� 0 3��, �� 3140
		double d = 1.23456789; // ���� ���� �� �ʱ�ȭ
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		// f���, e���, g��� ���
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		// f���, e���, g��� ���
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		// f���, e���, g��� ���
		System.out.printf("d=%f%n", d);
		// double ���
		System.out.printf("d=%14.10f%n", d);
		// double�� �������� ���. 10�ڸ��� �߶�
		System.out.printf("[12345678901234567890]%n");
		// ���ڿ� �״�� ���
		System.out.printf("[%s]%n", url);
		// String ���
		System.out.printf("[%20s]%n", url);
		// String ���. ������ ����
		System.out.printf("[%-20s]%n", url);
		// String ���. ���� ����
		System.out.printf("[%.8s]%n", url);
		// String ���. 8���ڷ� �߶� ���
	}
}
