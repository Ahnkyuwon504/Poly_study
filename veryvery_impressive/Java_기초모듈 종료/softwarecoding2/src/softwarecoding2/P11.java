package softwarecoding2;

public class P11 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 11. Casting Ex1
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10; // 변수 선언 및 초기화
		byte b = (byte)i; // 변수 선언 및 초기화
		// int -> byte 출력
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		i = 300; // 변수 값 지정
		b = (byte)i; // 변수 값 지정
		// int -> byte 출력... short의 최댓값이 256이라서 44가 나옴
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		b = 10; // 변수 값 지정
		i = (int)b; // 변수 값 지정
		// byte -> int 출력
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		b = -2; // 변수 값 지정
		i = (int)b; // 변수 값 지정
		// byte -> int 출력
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		// i에서 integer로..
		System.out.printf("i="+Integer.toBinaryString(i));
	}
}
