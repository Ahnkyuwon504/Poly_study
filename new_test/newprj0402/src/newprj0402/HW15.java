package newprj0402;

public class HW15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #15. ����,�ݺ�,�迭 15�� / 2021.04.01. / 2125341020 �ȱԿ�
		// switch, case�� �������� ���� ���
		///////////////////////////////////////////////////
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // for���� �̿��� ���������� 1������ 12������ �ǽ�
			System.out.printf(" %d�� => ", k20_i); // �� ���
			LOOP: for (int k20_j = 1; k20_j < 32; k20_j++) { // LOOP�� ���! 1�Ϻ��� �ִ� 31�ϱ��� �ǽ�
				
				System.out.printf("%d.", k20_j); // �� ���
				
				switch (k20_i) { // ���� ���� switch�� ����
				case 4:case 6:case 9:case 11: // 4��, 6��, 9��, 11���� 30�ϱ����̹Ƿ�
					if(k20_j == 30) break LOOP; // j�� 30�� �� LOOP ����
					break; // break
				case 2: // 2���� 28�ϱ����̹Ƿ�
					if(k20_j == 28) break LOOP; // j�� 28�� �� LOOP ����
					break; // break
				}
			}
			System.out.printf("\n"); // ������ �ٹٲ�
									 // �� ���� ������ switch ���� ����� �ʿ�� ����.
									 // for���� �ξ� �����ϴٰ� �����Ǹ� for���� ����� ��!
		}

	}

}
