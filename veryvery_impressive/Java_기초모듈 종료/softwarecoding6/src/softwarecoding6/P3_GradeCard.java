package softwarecoding6;

public class P3_GradeCard {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 3. Method Overloading
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////		
	public static void printAverage(int k20_a, int k20_b, int k20_c) { // 세 과목 메소드
		double k20_avg = (k20_a+k20_b+k20_c) / 3; // 평균값
		System.out.printf("3월 성적표\n"); // 헤드 출력
		System.out.printf("=================================================\n"); // 줄 출력
		System.out.printf("이름    국어  영어  수학  총점  평균\n"); // 과목 출력
		System.out.printf("=================================================\n"); // 줄 출력
		System.out.printf("폴리융 %4d  %4d  %4d  %4d   %-4.1f\n\n\n", // 세개의 과목 출력
				k20_a, k20_b, k20_c, k20_a+k20_b+k20_c, k20_avg);
	}

	public static void printAverage(int k20_a, int k20_b, int k20_c, int k20_d) { // 네 과목 메소드, 오버로딩
		double k20_avg = (k20_a+k20_b+k20_c+k20_d) / 4; // 평균값 
		System.out.printf("4월 성적표\n"); // 헤드 출력
		System.out.printf("=================================================\n"); // 줄 출력
		System.out.printf("이름    국어  영어  수학  과학  총점  평균\n"); // 과목 출력
		System.out.printf("=================================================\n"); // 줄 출력
		System.out.printf("폴리융 %4d  %4d  %4d  %4d  %4d   %-4.1f\n\n\n", // 네개의 과목 출력
				k20_a, k20_b, k20_c, k20_d, k20_a+k20_b+k20_c+k20_d, k20_avg);
	}

	public static void printAverage(int k20_a, int k20_b, int k20_c, int k20_d, int k20_e) { // 다섯 과목 메소드, 오버로딩
		double k20_avg = (k20_a+k20_b+k20_c+k20_d+k20_e) / 5; // 평균값
		System.out.printf("5월 성적표\n"); // 헤드 출력
		System.out.printf("=================================================\n");// 줄 출력
		System.out.printf("이름    국어  영어  수학  과학  사회  총점  평균\n"); // 과목 출력
		System.out.printf("=================================================\n");// 줄 출력
		System.out.printf("폴리융 %4d  %4d  %4d  %4d  %4d  %4d   %-4.1f\n", // 다섯개의 과목 출력
				k20_a, k20_b, k20_c, k20_d, k20_e, k20_a+k20_b+k20_c+k20_d+k20_e, k20_avg);
	}

	public static void main(String[] args) { // 메인 메소드
		// TODO Auto-generated method stub
		printAverage(100, 100, 100); // 세과목
		printAverage(100, 100, 100, 100); // 네과목
		printAverage(100, 100, 100, 100, 100); // 다섯과목

	}

}
