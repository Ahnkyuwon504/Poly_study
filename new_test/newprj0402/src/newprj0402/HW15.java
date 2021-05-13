package newprj0402;

public class HW15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #15. 선택,반복,배열 15번 / 2021.04.01. / 2125341020 안규원
		// switch, case가 적합하지 않은 사례
		///////////////////////////////////////////////////
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // for문을 이용해 마찬가지로 1월부터 12월까지 실시
			System.out.printf(" %d월 => ", k20_i); // 월 출력
			LOOP: for (int k20_j = 1; k20_j < 32; k20_j++) { // LOOP를 사용! 1일부터 최대 31일까지 실시
				
				System.out.printf("%d.", k20_j); // 일 출력
				
				switch (k20_i) { // 월에 따른 switch문 생성
				case 4:case 6:case 9:case 11: // 4월, 6월, 9월, 11월은 30일까지이므로
					if(k20_j == 30) break LOOP; // j가 30일 때 LOOP 중지
					break; // break
				case 2: // 2월은 28일까지이므로
					if(k20_j == 28) break LOOP; // j가 28일 때 LOOP 중지
					break; // break
				}
			}
			System.out.printf("\n"); // 월마다 줄바꿈
									 // 이 같이 억지로 switch 문을 사용할 필요는 없음.
									 // for문이 훨씬 적합하다고 생각되면 for문을 사용할 것!
		}

	}

}
