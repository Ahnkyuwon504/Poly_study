package newprj0402;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #2. ����,�ݺ�,�迭 2�� / 2021.04.01. / 2125341020 �ȱԿ�
		// switch/case��
		///////////////////////////////////////////////////

		String k20_jumin; // ���� ����

		k20_jumin = "123456-4234567"; // k20_jumin�� �ֹι�ȣ ���� �ο�

		switch (k20_jumin.charAt(7)) { // switch�� ����, k20_jumin���� ����� String�� 7th index ����
		case '1': // 1�� ���
			System.out.printf("20������ �¾ ���� ���\n"); // ���
			break; // ��� �� ����
		case '2': // 2�� ���
			System.out.printf("20������ �¾ ���� ���\n"); // ���
			break; // ��� �� ����
		case '3': // 3�� ���
			System.out.printf("20������ �¾ ���� ���\n"); // ���
			break; // ��� �� ����
		case '4': // 4�� ���
			System.out.printf("20������ �¾ ���� ���\n"); // ���
			break; // ��� �� ����
		default: // ���� 1,2,3,4 ��� �ƴ� ��
			System.out.printf("���\n"); // ���
			break; // ��� �� ����
		}
	}
}
