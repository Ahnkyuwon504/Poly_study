package softwarecoding2;

public class P9 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 9. Overflow Ex
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin = -32768; // ���� ���� �� �ʱ�ȭ
		short sMax = 32767; // ���� ���� �� �ʱ�ȭ
		char cMin = 0; // ���� ���� �� �ʱ�ȭ
		char cMax = 65535; // ���� ���� �� �ʱ�ȭ
		
		System.out.println("sMin  = " + sMin); // Min ���
		System.out.println("sMin-1= " + (short)(sMin-1));
		// Min���� 1 ���� short�� �ּڰ����� ������ �ִ����� ����..
		System.out.println("sMax  = " + sMax); // Max ���
		System.out.println("sMax+1= " + (short)(sMax+1));
		// Max���� 1 ���ϸ� short�� �ִ񰪿��� ������ �ּڰ����� ����..
		System.out.println("cMin  = " + (int)cMin); // Min ���
		System.out.println("cMin-1= " + (int)--cMin); 
		// ��������. �ּڰ����� 1 ������ �ִ����� ����..
		System.out.println("cMax  = " + (int)cMax); // Max ���
		System.out.println("cMax+1= " + (int)++cMax);
		// ��������. �ִ񰪿��� 1 �������� �ּڰ����� ����..
	}
}
