package newprj0401;

public class HW08 {
	///////////////////////////////////////////////////
	// #8. 사칙연산8번 / 2021.04.01. / 2125341020 안규원
	// 소비자가 세금 계산
	///////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k20_item = {"맛동산", "웨하스", "롯데샌드", "오땅", "사브레"}; // k20_item array생성
		int[] k20_price = {1000, 2000, 3000, 2500, 1450}; // k20_price에 과자가격 넣어줌.
		int[] k20_amount = {10, 2, 1, 3, 5}; // k20_amount에 과자 수량 넣어줌.
		double k20_tax_rate; // double 변수인 k20_tax_rate 선언
		int k20_total_sum; // int 변수인 k20_total_sum 선언
		
		k20_tax_rate = 0.1; // 세율 0.1 부여
		k20_total_sum = 0; // sum은 0으로 초기화하는 습관
		
		System.out.printf("*************************************\n"); // 영수증 상단 출력
		System.out.printf("             너가 지른 과자들                          \n"); // 영수증 주제
		System.out.printf(" 항 목     단 가        수 량       합 계            \n"); // 영수증 항목
		for (int i = 0; i < k20_item.length; i++) { // for문은 과자의 종류만큼 반복
			int k20_sum = k20_price[i] * k20_amount[i]; // 과자의 가격과 수량만큼 곱하면 그 과자 산 가격 나옴
			k20_total_sum = k20_total_sum + k20_sum; // 토탈 가격을 for문마다 최신화
			System.out.printf("%5s %7d       %2d    %9d\n", k20_item[i], k20_price[i], k20_amount[i], k20_sum);
		} // 과자의 종류, 과자의 단가, 과자 구입수량, 합계 표시
		System.out.printf("*************************************\n"); // 영수증 중단 출력
		System.out.printf("  지불금액 :     %20d\n", k20_total_sum); // 지불금액에 총 토탈가격 출력
		
		int k20_total_net_price = (int)(k20_total_sum/(1+k20_tax_rate)); // 과세금액인 netprice정의
		System.out.printf("  과세금액 :     %20d\n", k20_total_net_price); // 과세금액과 netprice 출력
		int k20_tax = k20_total_sum - k20_total_net_price; // 세금 정의, 세금은 지불금액 - 과세금액
		System.out.printf("  세  금 :      %20d\n", k20_tax); // 세금 출력
		

	}

}
