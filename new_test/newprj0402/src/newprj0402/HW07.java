package newprj0402;

public class HW07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #7. ����,�ݺ�,�迭 7�� / 2021.04.01. / 2125341020 �ȱԿ�
		// break��
		///////////////////////////////////////////////////
		
		int k20_sum, k20_ii; // ���� ����
		
		k20_sum = 0; // ������ �ο�
		k20_ii = 0; // ������ �ο�
		
		while (true) { // while���� ���ѹݺ��ȴٴ� ����. ���� break�� ���;��Ѵ�.
			if (k20_sum > 100) { // break �ߵ�����
				break; // sum�� 100���� Ŀ���� while�� Ż��
			}
			k20_ii++; // k20_ii�� while�� ������ �� 1 �����ش�.
			k20_sum += k20_ii; // k20_sum�� �� ������ ii�� �����ذ���.
			System.out.println("k20_ii = " + k20_ii); // ii ���
			System.out.println("sum = " + k20_sum); // sum ���
		}
		

	}

}
