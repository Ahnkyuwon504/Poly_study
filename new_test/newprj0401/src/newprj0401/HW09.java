package newprj0401;

public class HW09 {
	///////////////////////////////////////////////////
	// #9. 사칙연산9번 / 2021.04.01. / 2125341020 안규원
	// 단순 환전 계산
	///////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_MyWon, k20_usd, k20_remain; // int변수들 정의
		double k20_MoneyEx, k20_commission; // double변수들 정의
		
		k20_MyWon = 1000000; // 100만원을 투입할 것임.
		k20_MoneyEx = 1238.21; // 현재 환율은 1238.21
		k20_commission = 0.003; // 환전수수료는 0.3퍼센트
		
		k20_usd = (int) (k20_MyWon/k20_MoneyEx); // 내 100만원을 환율로 나눈, 즉 내가 받을 달러
		k20_remain = (int) (k20_MyWon - k20_usd*k20_MoneyEx); // 달러를 받고 1달러가 안되는 돈은 한화로.
		
		System.out.printf("************************************************\n"); // 영수증 출력
		System.out.printf("*             수수료 없이 계산                     *\n"); // 글자 출력
		System.out.printf(" 총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", // 환전금액, 받을 미화, 잔돈
				k20_MyWon, k20_usd, k20_remain);
		System.out.printf("************************************************\n"); // 영수증 출력

	}

}
