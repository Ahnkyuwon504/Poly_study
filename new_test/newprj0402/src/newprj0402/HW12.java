package newprj0402;

public class HW12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #12. 선택,반복,배열 12번 / 2021.04.01. / 2125341020 안규원
		// 범위를 주어 비교
		///////////////////////////////////////////////////
		
		int k20_iVal; // 변수 정의
		for (int k20_i = 0; k20_i < 300; k20_i++) { // for문은 0부터 299까지, 300번 실시
			k20_iVal = 5 * k20_i; // 변수값 부여. for문의 i에 따라 바뀜
			if (k20_iVal >= 0 && k20_iVal < 10) { // 첫 번째 조건. 일의자리일때
				System.out.printf("일 %d\n", k20_iVal); // 일 + 출력
			} else if (k20_iVal >= 10 && k20_iVal < 100) { // 두 번째 조건. 십의 자리일때
				System.out.printf("십 %d\n", k20_iVal); // 십 + 출력
			} else if (k20_iVal >= 100 && k20_iVal < 1000) { // 세 번째 조건. 백의 자리일 때
				System.out.printf("백 %d\n", k20_iVal); // 백 + 출력
			} else { // 네 번째 조건. 천의 자리일 때
				System.out.printf("천 %d\n", k20_iVal); // 천 + 출력
			}
		} 
		
	

	}

}
