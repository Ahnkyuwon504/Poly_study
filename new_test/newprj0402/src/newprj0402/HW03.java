package newprj0402;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #3. ����,�ݺ�,�迭 3�� / 2021.04.01. / 2125341020 �ȱԿ�
		// for���� while��
		///////////////////////////////////////////////////
		
		System.out.println(1); // 1 ���
		System.out.println(2); // 2 ���
		System.out.println(3); // 3 ���
		System.out.println(4); // 4 ���
		System.out.println(5); // 5 ���
		
		for (int k20_index = 1; k20_index < 5; k20_index++) { // for���� i�� 1���� 5����, 5�� �ǽõɰ���
			System.out.println(k20_index); // �� for������ i ���
		}
		
		int k20_i = 0; // ���� i ����
		do {
			k20_i++; // �켱 i�� 1 �ø���
			System.out.println(k20_i); // 1 �ö� i�� ����Ѵ�
		} while(k20_i <= 5); // i�� 5�����϶����� ��� ����. �� i�� 5�� �ǵ� �ǽõǹǷ�, 6�� ��µɰ��̴�
		
		k20_i = 1; // i �� �ο�
		while (k20_i <= 5) { // i �� 5 �����϶����� ��� �ǽõ�
			System.out.println(k20_i); // i ���
			k20_i++; // ��� �� i�� 1 ������. �� i�� 5�϶� ��µǰ�, 6�� �ǹǷ� 6�� ��µ��� ���� ���̴�.
		}

	}

}
