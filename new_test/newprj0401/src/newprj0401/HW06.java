package newprj0401;

public class HW06 {
	
	public static int taxcal(int val, int rate) {
		///////////////////////////////////////////////////
		// #6. 사칙연산6번 / 2021.04.01. / 2125341020 안규원
		// 단순 세금 계산
		int k20_ret;	// k20_ret 변수 선언
		
		if (((double)val*(double)rate/100.0) == val*rate/100) {	// double로 계산할때와
																// int로 계산할 때가 다른 경우로 나눠줌.
			k20_ret = val*rate/100;								// 같으면 그대로 사용
		} else {
			k20_ret = val*rate/100 + 1; 						// 다르면 1을 더해줌. 
		}														// 손해 안 보기 위해서 1원 더 받는것임.
		return k20_ret;											// 경우에 따라 다른 k20_ret이 리턴됨.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_val, k20_rate, k20_tax;							// k20_val, k20_rate, k20_tax 정의
		
		k20_val = 271;	// k20_val의 값은 271
		k20_rate = 3;	// k20_rate의 값은 3
		k20_tax = taxcal(k20_val, k20_rate);	// k20_tax는 실제 세금으로, 위에서 만든 taxcal 메소드 거침.
		
		System.out.printf("*******************************\n");	// 세금계산의 맨 윗줄 출력
		System.out.printf("*    단순 세금 계산               *\n");	// 단순 세금계산
		System.out.printf("실제 세금계산: %f\n", k20_val*k20_rate/100.0);	// 소수점까지의 세금 출력
		System.out.printf("세전가격: %d 세금: %d 세포함가격: %d\n", k20_val, k20_tax, k20_val+k20_tax);
		System.out.printf("*******************************\n");	// 세전가격과 가공된 세금, 세포함가격 출력
	}
}
