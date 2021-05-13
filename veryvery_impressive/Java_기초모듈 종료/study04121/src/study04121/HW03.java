package study04121;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #3. 리포팅연습(영수증 출력 등) 3번 / 2125341020안규원
		// 달력 인쇄
		////////////////////////////////////////////////////////////////////////
		int k20_iWeekday = 5; // 원하는 연도 1월 1일의 요일값, 일요일 0부터 토요일 6까지임
		int[] k20_iEnd = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 원하는 연도의 각 월의 말일을 배열로 저장
		// 후에 이 배열의 원소를 호출하여, 날짜 출력하는 for문의 마무리 용도로 사용
		for (int k20_iMon = 0; k20_iMon < 12; k20_iMon++) { // for문 시작. 0부터 11까지 실시
			System.out.printf("\n\n            %d월\n", k20_iMon + 1);
			// 각 월별로 n월 출력. +1하는 이유는, index가 0부터 시작해서이다
			// 실제 월과 값을 같게 하시 위해서임
			System.out.printf("============================\n");
			// 월별 n 월과 하단 실제 달력 사이 구분 줄 출력
			System.out.printf(" 일  월  화  수  목  금  토\n");
			// 한글 요일 출력
			for (int k20_i = 1; k20_i <= k20_iEnd[k20_iMon]; k20_i++) {
			// 1일부터 말일까지 for문 실시
				if (k20_i == 1) { // 만약 1일인 경우, 공백을 출력해야함
					for (int k20_j = 0; k20_j < k20_iWeekday; k20_j++) { // 공백의 개수를 for문으로 표현
						System.out.printf("    "); // iWeekday는 줄바꿈 기능도 있지만, 1일을
					} // 실제 맞는 위치에 이동시키는 기능도 있는 것임! 
				}
				System.out.printf("%3d ", k20_i); // 각 일별로 동일한 2칸의 간격을 부여하고, 우측부터 채움
				k20_iWeekday++; // Weekday는 각 일 출력시마다 1 증가
				if (((k20_iWeekday % 7) == 0)) { // 줄바꿈 기능 구현을 위해 if문 
					System.out.printf("\n"); // 7이 될 때마다 줄바꿈(매주)
					k20_iWeekday = 0; // 줄 바꾼 후, 0으로 다시 초기화
				}
			}
		}
	}
}
