package softwarecoding6;

import java.util.Iterator;

public class Star4 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 2. Ŭ����, ��ü, �ν��Ͻ�(2)
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	private static int k20_inVal; // static ���� ����
	public static void up() { // �׳� �޼ҵ� ����
		k20_inVal++; // inVal �÷���...
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k20_inVal); // �׳� �޼ҵ����� ǥ��
	}

	public static void main(String[] args) { // ���� �޼ҵ�
		// TODO Auto-generated method stub
		k20_inVal = 0; // �ڱ� ���� ����
		Star3 k20_elev; // Ŭ���� �޾� ��ü����
		
		k20_elev = new Star3(); // �ν��Ͻ� �����Ͽ� ��ü�� ����
		
		up(); // �׳� �ҽ��� �޼ҵ�...
		for (int k20_i = 0; k20_i < 10; k20_i++) { // ���� �ø��Ŵ�
			k20_elev.up(); // �ö󰣴�
			System.out.printf("MSG[%s]\n", k20_elev.k20_help); // ��ü�� String...
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // ���� �����Ŵ�
			k20_elev.down(); // ��������
			System.out.printf("MSG[%s]\n", k20_elev.k20_help); // ��ü�� String..���
		}
	}

}
