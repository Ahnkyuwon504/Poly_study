package newprj0402;

public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #6. ����,�ݺ�,�迭 6�� / 2021.04.01. / 2125341020 �ȱԿ�
		// while��
		///////////////////////////////////////////////////
		
		for (int k20_i = 2; k20_i <= 9; k20_i++) { // for���� 2���� 9���� �ǽ�
			for (int k20_j = 1; k20_j <= 9; k20_j++) { // for���� 1���� 9���� �ǽ�
				System.out.println(k20_i + " * " + k20_j + " = " + k20_i*k20_j); // �������� �� ���� ���
			}
		}
		
		int k20_i = 2; // while���� ���� ���� ���� ����
		while (k20_i <= 9) { // while���� �ߵ�����
			int k20_j = 1; // while�� �ȿ��� �� while���� ���� ���� ���� ����
			while (k20_j <= 9) { // while���� �ߵ� ����
				System.out.println(k20_i + " * " + k20_j + " = " + k20_i*k20_j); // ������ ��� 
				k20_j++; // while�� �����Ű�� ���� ��ġ
			}
			k20_i++; // while�� �����Ű�� ���� ��ġ
		}

	}

}
