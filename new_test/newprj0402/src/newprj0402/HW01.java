package newprj0402;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #1. ����,�ݺ�,�迭 1�� / 2021.04.01. / 2125341020 �ȱԿ�
		// if��
		///////////////////////////////////////////////////
		
		int k20_score, k20_num, k20_score1; // ���� ����
		
		k20_score = 70; // score�� 70��
		k20_num = 0; // num�� 0
		k20_score1 = 95; // score1�� 95�� �ο�
		
		if (k20_score > 60) { // score�� 60�� �ʰ��� ���
			System.out.println("�հ��Դϴ�."); // �հ��Դϴ� ���
		}
		if (k20_score < 90) { // score�� 90�� �̸��� ���
			System.out.println("���հ��Դϴ�."); // ���հ��Դϴ� ���
		}
		if (k20_score > 60) { // score�� 60�� �ʰ��� ���
			System.out.println("�հ��Դϴ�."); // �հ��Դϴ� ���
		} else { // �׷��� ���� ���, �� 60�� ������ ���
			System.out.println("���հ��Դϴ�."); // ���հ��Դϴ� ���
		}
		
		if (k20_num > 0) { // num�� 0 �ʰ��� ���
			System.out.println("����Դϴ�."); // ����Դϴ� ���
		} else if (k20_num < 0) { // 0 �̸��� ���
			System.out.println("�����Դϴ�."); // �����Դϴ� ���
		} else { // 0�ʰ��� �ƴϰ� 0�̸��� �ƴ�, �� 0�� �� 
			System.out.println("0 �Դϴ�."); // 0�Դϴ� ���
		}
		
		if (k20_score1 >= 90) { // score1�� 90�� �̻��� ���
			System.out.println("A���"); // A��� ���
		} else if (k20_score1 >= 80 && k20_score1 < 90) { // 80�� �̻�, 90�� �̸��� ���
			System.out.println("B���"); // B��� ���
		} else if (k20_score1 >= 70 && k20_score1 < 80) { // 70�� �̻�, 80�� �̸��� ���
			System.out.println("C���"); // C��� ���
		} else { // �� ��, �� 70�� �̸��� ���
			System.out.println("F���"); // F��� ���
		}
	}

}
