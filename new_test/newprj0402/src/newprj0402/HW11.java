package newprj0402;

public class HW11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #11. ����,�ݺ�,�迭 11�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ������, ������ ��
		///////////////////////////////////////////////////
		/*
		int k20_ii; // ���� ����
		double k20_iD; // ���� ����
		
		k20_ii = 10/3; // ������ �ο�. int������ �����̹Ƿ� 3�� ����ɰ���.
		k20_iD = 10/3.0; // ������ �ο�. int�� double������ �����ε�, iD�� double�̹Ƿ� 3.333333�� ����� ����.
		
		if (k20_ii == k20_iD) { // if���� ����
			System.out.printf("equal\n"); // ���� ���ٸ� equal ���
		} else { // if�� �ƴ϶��
			System.out.printf("Not equal[%f][%f]\n", (double)k20_ii, k20_iD); // Not equal ���
		}															  // 3.0000000��
																	  // 3.3333333�� �ٸ���!
		
		if (k20_iD == 3.333333) { // if���� ����
			System.out.printf("equal\n"); // double�̶� 3.333333���� ǥ�õǴ� �ͻ��̴�. �ٸ���.
		} else { // if���� �ƴ϶��
			System.out.printf("Not equal[3.333333][%f]\n", k20_iD); // �ٸ��Ƿ� ������ ��µȴ�.
		}
		
		k20_iD = (int)k20_iD; // ���� int����ȯ
		if (k20_ii == k20_iD) { // int�� �ٲ����Ƿ�, ���� int�� �����ߴ��Ͱ� ��������
			System.out.printf("equal\n"); // ���
		} else { // �ٸ� �����̶��
			System.out.printf("Not equal[%d][%d]\n", k20_ii, k20_iD); // ������ ��µ��� �ʴ´�.
		}
		
		System.out.printf("int�� �μ�[%d][%f]\n", k20_ii, k20_iD); // int�� �μ��� ��. ����� �ٸ��� ����
		System.out.printf("double�� �μ�[%f][%f]\n", (double)k20_ii, k20_iD); // double�� �μ��� ��
		*/
		char k20_a; // ���� ����
		String k20_aa; // ���� ����
		boolean k20_bb; // ���� ����. boolean���� ����
		
		k20_a = 'c'; // ������ �ο�
		k20_aa = "abcd"; // ������ �ο�
		k20_bb = true; // ������ �ο�. boolean�� true or false�� �ο�.
		
		if (k20_a == 'b') System.out.printf("a�� b�̴�.\n"); // k20_a�� b�� �� ���
		if (k20_a == 'c') System.out.printf("a�� c�̴�.\n"); // k20_a�� c�� �� ���
		if (k20_a == 'd') System.out.printf("a�� d�̴�.\n"); // k20_a�� d�� �� ���
		
		if (k20_aa.equals("abcd")) System.out.printf("aa�� abcd�̴�.\n"); // String ���� ���
		else System.out.printf("aa�� abcd�� �ƴϴ�.\n"); // ���
		
		if (!!k20_bb) System.out.printf("bb�� ������ ������ ���̴�."); // boolean ���� ���
		else System.out.printf("bb�� ������ ������ �����̴�."); // ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
