package newprj0402;

public class HW10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #10. ����,�ݺ�,�迭 10�� / 2021.04.01. / 2125341020 �ȱԿ�
		// for���� �� ���� while���� ���.
		///////////////////////////////////////////////////
		
		int k20_iA, k20_iB; // ���� ����
		k20_iA = 0; // ������ �ο�
		while(true) { // while�� ���ѹݺ��ȴ�.
			k20_iB = 0; // ������ �ο�
			while(true) { // while�� ���ѹݺ��ȴ�.
				System.out.printf("*"); // *�� ����Ѵ�. �ٳѱ� ����.
				if(k20_iA == k20_iB) { // ����س���, ��� ���� ������ break
					break; // break�Ұ��̴�.
				}
				k20_iB++; // iB�� Ű�����ν� break ���� ������ų����.
			}
			System.out.printf("\n"); // �� �ѱ� ó��
			k20_iA++; // iA�� Ű�����ν� break ���� ������ų����.
			if (k20_iA == 30) { // 30��° �ٱ����� ����Ұ���.
				break; // break
			}
		}

	}

}
