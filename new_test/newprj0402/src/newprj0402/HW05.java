package newprj0402;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #5. ����,�ݺ�,�迭 5�� / 2021.04.01. / 2125341020 �ȱԿ�
		// while��
		///////////////////////////////////////////////////
		
		int k20_i; // ���� ����
		k20_i = 10; // ������ �ο�
		
		while(k20_i >= 0) { // while���� i�� 0 �̻��϶� ���� �ݺ�
			System.out.println(k20_i--); // i�� ����ϰ�, 1�� ����
		} // ���� i�� 10�϶� ��µǰ�, 0�϶����� ��� ��µɰ���
		for (int k20_j = 10; k20_j >= 0; k20_j--) { // for���� 10���� 0���� �ǽõɰ���
			System.out.println(k20_j); // 10���� 0���� j ���
		}
		
		
		k20_i = 0; // ������ �ο�
		while (k20_i >= 0) { // while���� i�� 0 �̻��� �� ���� �ݺ�
			k20_i = 10; // i�� 10�� �ο�
			System.out.println(k20_i--); // i�� ����ϰ�, 1�� ����. �׷��� ��� while������ ���Ӱ� 10�� �ο��ϹǷ�
		}							 // �� while���� ������ �ݺ��ȴ�.
		
		
		k20_i = 10;	// ������ �ο�
		while (k20_i < 10) { // while���� i�� 10 �̸��� �� ���� �ݺ�
			System.out.println(k20_i--); // i ����ϰ� 1 ����. ��� i�پ������, ������ 10�̸��̹Ƿ� ���ʿ� ��������� ����.
		}

	}

}