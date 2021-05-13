package softwarecoding2;

public class P13 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 2강. 변수
	// 13. Class VarEx2
	// 21. 04. 27. (화)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int   i = 91234567; // 변수 선언 및 초기화
		float f = (float)i; // 변수 선언 및 초기화
		// int를 float으로 형변환..
		int   i2 = (int)f; // 변수 선언 및 초기화
		
		double d = (double)i; // int에서 double로
		int    i3 = (int)d; // 그걸 받아 다시 int로
		
		float f2 = 1.666f; // 입력한 수보다 길어질거다..뒤에 f도
		int   i4 = (int)f2; // 그걸 int로. 당연히 1

		System.out.printf("i=%d\n", i); // 출력
		System.out.printf("f=%f i2=%d\n", f, i2); // 출력
		System.out.printf("d-%f i3=%d\n", d, i3); // 출력
		System.out.printf("(int)%f=%d\n", f2, i4); //출력
	}
}
