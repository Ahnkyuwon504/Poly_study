package newprj0401;

public class HW08 {
	///////////////////////////////////////////////////
	// #8. ��Ģ����8�� / 2021.04.01. / 2125341020 �ȱԿ�
	// �Һ��ڰ� ���� ���
	///////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k20_item = {"������", "���Ͻ�", "�Ե�����", "����", "��극"}; // k20_item array����
		int[] k20_price = {1000, 2000, 3000, 2500, 1450}; // k20_price�� ���ڰ��� �־���.
		int[] k20_amount = {10, 2, 1, 3, 5}; // k20_amount�� ���� ���� �־���.
		double k20_tax_rate; // double ������ k20_tax_rate ����
		int k20_total_sum; // int ������ k20_total_sum ����
		
		k20_tax_rate = 0.1; // ���� 0.1 �ο�
		k20_total_sum = 0; // sum�� 0���� �ʱ�ȭ�ϴ� ����
		
		System.out.printf("*************************************\n"); // ������ ��� ���
		System.out.printf("             �ʰ� ���� ���ڵ�                          \n"); // ������ ����
		System.out.printf(" �� ��     �� ��        �� ��       �� ��            \n"); // ������ �׸�
		for (int i = 0; i < k20_item.length; i++) { // for���� ������ ������ŭ �ݺ�
			int k20_sum = k20_price[i] * k20_amount[i]; // ������ ���ݰ� ������ŭ ���ϸ� �� ���� �� ���� ����
			k20_total_sum = k20_total_sum + k20_sum; // ��Ż ������ for������ �ֽ�ȭ
			System.out.printf("%5s %7d       %2d    %9d\n", k20_item[i], k20_price[i], k20_amount[i], k20_sum);
		} // ������ ����, ������ �ܰ�, ���� ���Լ���, �հ� ǥ��
		System.out.printf("*************************************\n"); // ������ �ߴ� ���
		System.out.printf("  ���ұݾ� :     %20d\n", k20_total_sum); // ���ұݾ׿� �� ��Ż���� ���
		
		int k20_total_net_price = (int)(k20_total_sum/(1+k20_tax_rate)); // �����ݾ��� netprice����
		System.out.printf("  �����ݾ� :     %20d\n", k20_total_net_price); // �����ݾװ� netprice ���
		int k20_tax = k20_total_sum - k20_total_net_price; // ���� ����, ������ ���ұݾ� - �����ݾ�
		System.out.printf("  ��  �� :      %20d\n", k20_tax); // ���� ���
		

	}

}
