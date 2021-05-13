package softwarecoding2;

public class P12 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 12. Casting Ex3
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f   = 9.1234567f; // 변수 선언 및 초기화. 뒤에 f
		double d  = 9.1234567; // 변수 선언 및 초기화
		double d2 = (double)f; // 변수 선언 및 초기화
		
		System.out.printf("f  =%20.18f\n", f); // f 출력
		System.out.printf("d  =%20.18f\n", d); // d 출력
		// d와 d2의 차이는, d는 애초에 9.1234567로 지정한 것이고
		// d2는 float를 double로 변환한 것이기 때문에 뒷자리가 남아 있다..
		System.out.printf("d2 =%20.18f\n", d2);
	}
}
