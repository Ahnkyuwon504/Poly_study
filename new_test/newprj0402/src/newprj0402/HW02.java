package newprj0402;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #2. 선택,반복,배열 2번 / 2021.04.01. / 2125341020 안규원
		// switch/case문
		///////////////////////////////////////////////////

		String k20_jumin; // 변수 정의

		k20_jumin = "123456-4234567"; // k20_jumin에 주민번호 숫자 부여

		switch (k20_jumin.charAt(7)) { // switch문 전개, k20_jumin으로 선언된 String의 7th index 숫자
		case '1': // 1인 경우
			System.out.printf("20세기전 태어난 남자 사람\n"); // 출력
			break; // 출력 후 종료
		case '2': // 2인 경우
			System.out.printf("20세기전 태어난 여자 사람\n"); // 출력
			break; // 출력 후 종료
		case '3': // 3인 경우
			System.out.printf("20세기후 태어난 남자 사람\n"); // 출력
			break; // 출력 후 종료
		case '4': // 4인 경우
			System.out.printf("20세기후 태어난 여자 사람\n"); // 출력
			break; // 출력 후 종료
		default: // 위의 1,2,3,4 모두 아닐 때
			System.out.printf("사람\n"); // 출력
			break; // 출력 후 종료
		}
	}
}
