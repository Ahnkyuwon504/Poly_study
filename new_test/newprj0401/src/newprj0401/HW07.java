package newprj0401;

public class HW07 {
	///////////////////////////////////////////////////
	// #7. ��Ģ����7�� / 2021.04.01. / 2125341020 �ȱԿ�
	// �Һ��ڰ� ���� ���
	///////////////////////////////////////////////////
	
	public static int netprice(int price, double rate) { // int�� �Һ��ڰ���, double�� ����
		return (int)(price/(1+rate));	// �Һ��ڰ����� 1+������ �������ν� ���������� return�Ѵ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_price, k20_netprice;	// int�� k20_price, k20_netprice ����
		double k20_tax_rate, k20_tax;	// double�� ������ ����
		
		k20_price = 1234;	// �Һ����ڰ��� k20_price�� 1234��
		k20_tax_rate = 0.1;	// ������ k20_tax_rate�� 0.1�̰�, �����δ� 10%��� ���Ұ��̴�.
		
		k20_netprice = netprice(k20_price, k20_tax_rate);	// �Һ��ڰ��� ������ �Ʊ�� netprice ����
		k20_tax = k20_price - k20_netprice;	// ������ ����ϴ� k20_tax ����
		
		System.out.printf("**************************************************\n"); // ������ ������
		System.out.printf("     �Һ��ڰ�, ��������, ���� ���    *\n"); // �Һ��ڰ�, ��������, ����
		System.out.printf("  �Һ��ڰ���: %d, ��������: %d, ����: %f\n", k20_price, k20_netprice, k20_tax);
		// �Һ��ڰ��ݰ� ���������� int�̹Ƿ� %d ���������, ������ double�� ������ �Ǿ����Ƿ� %f�� ����ؾ���.
		System.out.printf("**************************************************\n"); // ������ �ϴ����
		
		

	}

}
