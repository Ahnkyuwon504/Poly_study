package softwarecoding2;

public class P11 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 11. Casting Ex1
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10; // ���� ���� �� �ʱ�ȭ
		byte b = (byte)i; // ���� ���� �� �ʱ�ȭ
		// int -> byte ���
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		i = 300; // ���� �� ����
		b = (byte)i; // ���� �� ����
		// int -> byte ���... short�� �ִ��� 256�̶� 44�� ����
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		b = 10; // ���� �� ����
		i = (int)b; // ���� �� ����
		// byte -> int ���
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		b = -2; // ���� �� ����
		i = (int)b; // ���� �� ����
		// byte -> int ���
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		// i���� integer��..
		System.out.printf("i="+Integer.toBinaryString(i));
	}
}
