package newprj0401;

public class HW07 {
	///////////////////////////////////////////////////
	// #7. 사칙연산7번 / 2021.04.01. / 2125341020 안규원
	// 소비자가 세금 계산
	///////////////////////////////////////////////////
	
	public static int netprice(int price, double rate) { // int인 소비자가격, double인 세율
		return (int)(price/(1+rate));	// 소비자가격을 1+세율로 나눔으로써 세전가격을 return한다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_price, k20_netprice;	// int인 k20_price, k20_netprice 선언
		double k20_tax_rate, k20_tax;	// double인 변수들 선언
		
		k20_price = 1234;	// 소비자자격인 k20_price는 1234원
		k20_tax_rate = 0.1;	// 세율인 k20_tax_rate는 0.1이고, 실제로는 10%라고 말할것이다.
		
		k20_netprice = netprice(k20_price, k20_tax_rate);	// 소비자가와 세율을 아까만든 netprice 투입
		k20_tax = k20_price - k20_netprice;	// 세금을 계산하는 k20_tax 변수
		
		System.out.printf("**************************************************\n"); // 영수증 상단출력
		System.out.printf("     소비자가, 세전가격, 세금 계산    *\n"); // 소비자가, 세전가격, 세금
		System.out.printf("  소비자가격: %d, 세전가격: %d, 세금: %f\n", k20_price, k20_netprice, k20_tax);
		// 소비자가격과 세전가격은 int이므로 %d 상관없으나, 세금은 double로 선언이 되었으므로 %f로 출력해야함.
		System.out.printf("**************************************************\n"); // 영수증 하단출력
		
		

	}

}
