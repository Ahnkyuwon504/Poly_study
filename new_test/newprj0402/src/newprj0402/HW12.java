package newprj0402;

public class HW12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #12. ����,�ݺ�,�迭 12�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ������ �־� ��
		///////////////////////////////////////////////////
		
		int k20_iVal; // ���� ����
		for (int k20_i = 0; k20_i < 300; k20_i++) { // for���� 0���� 299����, 300�� �ǽ�
			k20_iVal = 5 * k20_i; // ������ �ο�. for���� i�� ���� �ٲ�
			if (k20_iVal >= 0 && k20_iVal < 10) { // ù ��° ����. �����ڸ��϶�
				System.out.printf("�� %d\n", k20_iVal); // �� + ���
			} else if (k20_iVal >= 10 && k20_iVal < 100) { // �� ��° ����. ���� �ڸ��϶�
				System.out.printf("�� %d\n", k20_iVal); // �� + ���
			} else if (k20_iVal >= 100 && k20_iVal < 1000) { // �� ��° ����. ���� �ڸ��� ��
				System.out.printf("�� %d\n", k20_iVal); // �� + ���
			} else { // �� ��° ����. õ�� �ڸ��� ��
				System.out.printf("õ %d\n", k20_iVal); // õ + ���
			}
		} 
		
	

	}

}
