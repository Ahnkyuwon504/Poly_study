package newprj0402;

public class HW08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #8. ����,�ݺ�,�迭 8�� / 2021.04.01. / 2125341020 �ȱԿ�
		// continue��
		///////////////////////////////////////////////////
		
		for (int k20_i = 0; k20_i <= 10; k20_i++) { // for���� 0���� 10���� �ǽ�
			if (k20_i%3 == 0) { // continue�Ǵ� ���� ����
				continue; // continue��, break�� �ٸ��� ���������� �ʰ�, �� while���� ������ �̵�
			}
			System.out.println(k20_i); // i ���. 3�ǹ���� �� ��µɰ���.
		}

	}

}
