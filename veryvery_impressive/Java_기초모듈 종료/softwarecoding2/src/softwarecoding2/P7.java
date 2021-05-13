package softwarecoding2;

public class P7 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 7. Printf Ex1
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1; // 변수 선언 및 초기화
		short s = 2; // 변수 선언 및 초기화
		char c = 'A'; // 변수 선언 및 초기화
		
		int finger = 10; // 변수 선언 및 초기화
		long big = 1000000000L; // 변수 선언 및 초기화
		// long은 뒤에 L을 달아야 함. 안 달면 오류
		long hex = 0xFFFFFFFFFFFFL; // 변수 선언 및 초기화
		// long은 뒤에 L을 달아야 함. 안 달면 오류
		
		int octNum = 010; // 변수 선언 및 초기화
		// 8진수 10, 10진수로는 8*1 + 1*0 = 8
		int hexNum = 0x10; // 변수 선언 및 초기화
		// 16진수 10, 10진수로는 16*1 + 1*0 = 16
		int binNum = 0b10; // 변수 선언 및 초기화
		// 2진수 10, 2진수로는 2*1 + 1*0 = 2
		
		System.out.printf("b=%d%n", b); // b 출력
		System.out.printf("s=%d%n", s); // s 출력
		System.out.printf("c=%c,  %d %n", c, (int)c);
		// c는 char로는 A지만 integer값은 65
		System.out.printf("finger=[%5d]%n", finger);
		// 우측 정렬 출력
		System.out.printf("finger=[%-5d]%n", finger);
		// 좌측 정렬 출력
		System.out.printf("finger=[%05d]%n", finger);
		// 우측 정렬 출력. 빈칸은 0으로 채운다.
		System.out.printf("big=%d%n", big); // big 출력
		System.out.printf("hex=%#x%n", hex); // hex 출력
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		// 8진수와 10진수 모드 각각 출력
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		// 16진수와 10진수 모드 각각 출력
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		// 2진수와 10진수 모드 각각 출력
	}
}
