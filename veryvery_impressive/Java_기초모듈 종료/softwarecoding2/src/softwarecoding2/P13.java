package softwarecoding2;

public class P13 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 13. Class VarEx2
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int   i = 91234567; // ���� ���� �� �ʱ�ȭ
		float f = (float)i; // ���� ���� �� �ʱ�ȭ
		// int�� float���� ����ȯ..
		int   i2 = (int)f; // ���� ���� �� �ʱ�ȭ
		
		double d = (double)i; // int���� double��
		int    i3 = (int)d; // �װ� �޾� �ٽ� int��
		
		float f2 = 1.666f; // �Է��� ������ ������Ŵ�..�ڿ� f��
		int   i4 = (int)f2; // �װ� int��. �翬�� 1

		System.out.printf("i=%d\n", i); // ���
		System.out.printf("f=%f i2=%d\n", f, i2); // ���
		System.out.printf("d-%f i3=%d\n", d, i3); // ���
		System.out.printf("(int)%f=%d\n", f2, i4); //���
	}
}
