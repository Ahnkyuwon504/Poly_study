package softwarecoding6;

public class Star7 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 2. Ŭ����, ��ü, �ν��Ͻ� - Ƽ�� ������ �����
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star7_Elevator elev3; // ����� ��� ���� ���������� ��ü ����
		
		elev3 = new Star7_Elevator(); // ��ü ����
		for (int i = 0; i < 10; i++) { // 10��
			elev3.up(); // �ø���
			System.out.printf("MSG elev3[%s]\n", elev3.help); // �ȳ���
		}
		
		for (int i = 0; i < 10; i++) { // 10��
			elev3.down(); // ������
			System.out.printf("MSG elev3[%s]\n", elev3.help); // �ȳ���
		}
		elev3.Repair(); // ����... �޼��� �ٲ�
		System.out.printf("MSG elev3[%s]\n", elev3.help); // �����ȳ���

	}

}
