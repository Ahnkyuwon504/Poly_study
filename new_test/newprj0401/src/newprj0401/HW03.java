package newprj0401;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #3. ��Ģ����3�� / 2021.04.01. / 2125341020 �ȱԿ�
		// ������ ����� �ٳѱ�
		
		int k20_ii; // k20_ii �̶�� ������ ��������.
		
		k20_ii = 1000/3;	// k20_ii ������ 1000/3�� ���� ��������. integer�̱� ������ 333�� ����ɰ���.
		System.out.printf("#3-1 : %d\n" , k20_ii);	// k20_ii ������ �� ȭ�鿡 ���
		
		k20_ii = 1000%3;	// k20_ii ������ 1000%3�� ���� ��������. 1000�� 3���� ���� �������̹Ƿ� 1�� �����.
		System.out.printf("#3-2 : %d\n" , k20_ii);	// k20_ii ������ �� ���
		
		for (int i = 0; i < 20; i++) {	// for���� i�� 0���� 19���� 20�� �ǽõɰ���.
			System.out.printf("#3-3 : %2d  " , i);	// �� for������ i�� ȭ�鿡 ��µ�.
			
			if (((i+1)%5) == 0) {	// �̶� (i+1)�� 5�� ���� �������� 0�϶����� � Ư���� ������ �ǽõ�.
									// i+1 �� ������, for���� i�� 0���� �����ϱ� ������.
				System.out.printf("\n");	// (i+1)�� 5�� ���� �������� 0�϶����� �ٹٲ��� �ǽõ�.
			}
		}
	}
}