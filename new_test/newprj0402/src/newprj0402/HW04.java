package newprj0402;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #4. ����,�ݺ�,�迭 4�� / 2021.04.01. / 2125341020 �ȱԿ�
		// for��
		///////////////////////////////////////////////////
		
		int k20_sum; // ���� ����
		
		k20_sum = 0; // sum�� 0�� �ο�
		for (int k20_index = 0; k20_index < 10; k20_index++) { // for���� i�� 0���� 9���� 9�� �ǽõɰ���
			k20_sum = k20_sum + k20_index; // �� for������, sum�� i�� ������. 0���� 9���� �����ִ� ���̹Ƿ� 45 ��µɰ���.
		}
		System.out.printf("sum : %d\n", k20_sum); // sum ���
		
		for (int k20_index = 1; k20_index < 10; k20_index++) { // for���� i�� 1���� 9���� 9�� �ǽ�
			System.out.printf("*********************************\n", k20_index); // ǥ ���κ� ���
			System.out.printf("           ������ %d��\n", k20_index); // �� ������ �˷���
			System.out.printf("*********************************\n", k20_index); // ǥ �Ʒ��κ� ���
			for (int k20_j = 1; k20_j < 10; k20_j++) { // ���� �������� ��µǴ� for��
				System.out.printf("         %d * %d = %d\n", k20_index, k20_j, k20_index*k20_j); // ������ ���
			}
			
		}

	}

}
