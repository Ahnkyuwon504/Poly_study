package newprj0402;

public class HW17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #17. 선택,반복,배열 17번 / 2021.04.01. / 2125341020 안규원
		// 숫자 읽기
		///////////////////////////////////////////////////
		
		String [] k20_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; // 한글로 숫자를 나타낼 수 
		                                                                          // 있게 array 변수 선언 및 값 저장
		for (int k20_i = 0; k20_i < 101; k20_i++) { // 0부터 100까지 for문 실시
			if (k20_i >= 0 && k20_i < 10) { // 0부터 9까지, 즉 일의 자리일 때
				System.out.printf("일의 자리 : %s\n", k20_units[k20_i]); // 일의 자리 :array에서 불러온 한글 발음
			} else if (k20_i >= 10 && k20_i < 100) { // 10부터 99까지, 즉 두 자릿수일 때
				int k20_i10, k20_i0; // 새로운 변수 선언
				k20_i10 = k20_i/10; // i의 10의 자리수에 있는 숫자를 나타낼 것임.
				k20_i0 = k20_i%10; // i의 1의 자리수에 있는 숫자를 나타낼 것임.
				if (k20_i0 == 0) { // 일의 자릿수가 0, 즉 10 20 30...나타낸다
					System.out.printf("십의 자리 : %s십\n", k20_units[k20_i10]); // 십의 자리 앞에만 붙이고 끝
				} else { // 일의 자릿수가 0이 아닐 때, 즉 11,12,14,27 등등..
					System.out.printf("십의 자리 : %s십%s\n", k20_units[k20_i10], k20_units[k20_i0]); // 십의 자리 앞뒤 붙임
				}
			} else { // 0부터 99 모두 끝. 남은 100은
				System.out.printf("==> %d\n", k20_i); // 화살표 100으로 처리! 종료.
			}
			
		}

	}

}
