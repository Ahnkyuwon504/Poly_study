package softwarecoding2;

public class P8 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 8. Printf Ex2
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com"; // 변수 선언 및 초기화
		
		float f1 = .10f; // 변수 선언 및 초기화
		float f2 = 1e1f; // 변수 선언 및 초기화 1뒤에 0 1개 , 즉 10
		float f3 = 3.14e3f; // 변수 선언 및 초기화 3.14 뒤에 0 3개, 즉 3140
		double d = 1.23456789; // 변수 선언 및 초기화
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		// f방식, e방식, g방식 출력
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		// f방식, e방식, g방식 출력
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		// f방식, e방식, g방식 출력
		System.out.printf("d=%f%n", d);
		// double 출력
		System.out.printf("d=%14.10f%n", d);
		// double을 우측부터 출력. 10자리로 잘라서
		System.out.printf("[12345678901234567890]%n");
		// 문자열 그대로 출력
		System.out.printf("[%s]%n", url);
		// String 출력
		System.out.printf("[%20s]%n", url);
		// String 출력. 오른쪽 정렬
		System.out.printf("[%-20s]%n", url);
		// String 출력. 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);
		// String 출력. 8글자로 잘라서 출력
	}
}
