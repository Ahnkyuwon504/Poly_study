package newprj0402;

public class HW16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #16. 선택,반복,배열 16번 / 2021.04.01. / 2125341020 안규원
		// Array이용 비교
		///////////////////////////////////////////////////
		
		int [] k20_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // array에 각 말일 저장
		
		for (int k20_i = 1; k20_i < 13; k20_i++) { // for문은 1월부터 12월까지 실시
			System.out.printf(" %d월 => ", k20_i); // 월 출력
			for (int k20_j = 1; k20_j < 32; k20_j++) { // 최대 일수가 31이므로 for문은 최대 31번 실시
				System.out.printf("%d", k20_j); // 일 출력
											// 앞에서와 다르다. 앞에서는 점을 바로 찍었으나 여기선 숫자만.
				if (k20_iLMD[k20_i-1] == k20_j) break;  // 그 이유. 말일에는 숫자를 입력하고 break를 해버린다.
														// i-1을 해주는 이유는, array에서 0부터 세기 때문
				System.out.printf("."); 	// 말일이 아니면 숫자입력후 점을 찍어준다.
			}
			System.out.printf("\n");		// 월별 줄바꿈
		}

	}

}
