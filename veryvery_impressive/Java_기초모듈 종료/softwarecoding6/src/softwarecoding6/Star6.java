package softwarecoding6;

public class Star6 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 2. ������
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	static Star6_Elevator elev1; // ��ü ����
	static Star6_Elevator elev2; // ��ü ����
	static Star6_Elevator elev3; // ��ü ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elev1 = new Star6_Elevator(); // ��ü ����
		elev2 = new Star6_Elevator(20, 1, 8); // ������ ��ü ����
		elev3 = new Star6_Elevator(50, -3, 5); // ������ ��ü ����
		
		for (int i = 0; i < 20; i++) { // 20�� �ǽ�
			elev1.up(); elev1.msg("1������ �� �� ������"); // �� ���� ������.
			//elev2.up(); elev1.msg("1������ �� �� ������");
			//elev3.up(); elev1.msg("1������ �� �� ������");
		}
		
		for (int i = 0; i < 20; i++) { // 20�� �ǽ�
			elev1.up(2); elev1.msg("1������ 2�� ������"); // 2���� ������.
			//elev2.up(2); elev1.msg("1������ 2�� ������");
			//elev3.up(2); elev1.msg("1������ 2�� ������");
		}
		
		for (int i = 0; i < 20; i++) { // 20�� �ǽ�
			elev1.down(3); elev1.msg("1������ 3�� ������"); // 3���� ������...
			//elev2.down(3); elev1.msg("1������ 3�� ������");
			//elev3.down(3); elev1.msg("1������ 3�� ������");
		}

	}

}
