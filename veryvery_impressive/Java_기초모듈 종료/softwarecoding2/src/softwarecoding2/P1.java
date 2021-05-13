package softwarecoding2;

public class P1 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 1. 변수 예제 1
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int k20_year = 0; // k20_year 변수 선언, 초기화
		int k20_age = 14; // k20_age 변수 선언, 초기화
		// 결과 1에 k20_year 콘솔 출력
		System.out.println("결과1 : " + k20_year);
		// 결과 2에 k20_age 콘솔 출력
		System.out.println("결과2 : " + k20_age);
		
		k20_year = k20_age + 2000; // k20_year 변수에 2000을 더함
		k20_age = k20_age + 1; // k20_age 변수에 1을 더함
		// 결과 3 출력, 바뀐 변수값
		System.out.println("결과3 : " + k20_year);
		// 결과 4 출력, 바뀐 변수값
		System.out.println("결과4 : " + k20_age);
	}
}
