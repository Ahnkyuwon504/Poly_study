package newprj0401;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #2. ��Ģ����2�� / 2021.04.01. / 2125341020 �ȱԿ�
		// �����ϱ�, �ձ��ϱ�
		
		int k20_sum; // k20_sum�̶�� int�� ������ �����Ͽ���.
		
		k20_sum = 0; // k20_sum�̶�� int�� ������ 0�� ���� ����
		
		for (int i = 1; i < 101; i++) {	// for���� i�� 1���� 100���� 100�� �ǽõ�.
			k20_sum = k20_sum + i;	// �� for������, k20_sum ������ ���� i�� ��µ�.
		}
		System.out.printf("#2 : %d\n", k20_sum); // k20_sum������ ȭ�鿡 ���
		System.out.printf("#2-2 : %d\n", k20_sum/100);	// k20_sum������ 100���� ���� ���� ȭ�鿡 ���
		
		int[] k20_v = {1, 2, 3, 4, 5}; // k20_v��� integer array�� �����Ͽ���. 1���� 5���� ���� �����.
		int k20_vSum; // k20_vSum�̶�� integer ������ �����Ͽ���.
		
		k20_vSum = 0; // k20_vSum�̶�� ������ 0�� ���� ����
		
		for (int i = 0; i < 5; i++) {	// for���� i�� 0���� 4���� 5�� �ǽõ�. array�� ù ��° ������
										// 0�̹Ƿ� 0���� �����ϴ°���.
			k20_vSum = k20_vSum + k20_v[i]; // �� for������, k20_vSum ������ ���� i��°�� �ش��ϴ�
		}									// k20_v array�� ����ŭ ������. 1���� 5���� ����������.
		
		System.out.printf("#2-3 : %d\n", k20_vSum); // k20_vSum������ ȭ�鿡 ���
	}
}
