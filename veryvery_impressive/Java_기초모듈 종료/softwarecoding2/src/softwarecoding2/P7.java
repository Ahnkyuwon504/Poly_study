package softwarecoding2;

public class P7 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 7. Printf Ex1
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1; // ���� ���� �� �ʱ�ȭ
		short s = 2; // ���� ���� �� �ʱ�ȭ
		char c = 'A'; // ���� ���� �� �ʱ�ȭ
		
		int finger = 10; // ���� ���� �� �ʱ�ȭ
		long big = 1000000000L; // ���� ���� �� �ʱ�ȭ
		// long�� �ڿ� L�� �޾ƾ� ��. �� �޸� ����
		long hex = 0xFFFFFFFFFFFFL; // ���� ���� �� �ʱ�ȭ
		// long�� �ڿ� L�� �޾ƾ� ��. �� �޸� ����
		
		int octNum = 010; // ���� ���� �� �ʱ�ȭ
		// 8���� 10, 10�����δ� 8*1 + 1*0 = 8
		int hexNum = 0x10; // ���� ���� �� �ʱ�ȭ
		// 16���� 10, 10�����δ� 16*1 + 1*0 = 16
		int binNum = 0b10; // ���� ���� �� �ʱ�ȭ
		// 2���� 10, 2�����δ� 2*1 + 1*0 = 2
		
		System.out.printf("b=%d%n", b); // b ���
		System.out.printf("s=%d%n", s); // s ���
		System.out.printf("c=%c,  %d %n", c, (int)c);
		// c�� char�δ� A���� integer���� 65
		System.out.printf("finger=[%5d]%n", finger);
		// ���� ���� ���
		System.out.printf("finger=[%-5d]%n", finger);
		// ���� ���� ���
		System.out.printf("finger=[%05d]%n", finger);
		// ���� ���� ���. ��ĭ�� 0���� ä���.
		System.out.printf("big=%d%n", big); // big ���
		System.out.printf("hex=%#x%n", hex); // hex ���
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		// 8������ 10���� ��� ���� ���
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		// 16������ 10���� ��� ���� ���
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		// 2������ 10���� ��� ���� ���
	}
}
