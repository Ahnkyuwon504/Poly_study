package softwarecoding6;

public class Star2 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 변수와 메서드(2)
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////
	static int k20_iStatic; // static 변수 선언
	
	public static void add(int k20_i) { // 메소드
		k20_iStatic++; // static변수의 값을 올림.
		k20_i++; // 메소드의 parameter의 값을 올림.
		System.out.printf("add메소드에서->iStatic=[%d]\n", k20_iStatic);
		// 출력
		System.out.printf("add메소드에서->i=[%d]\n", k20_i);
		// 출력
	}
	
	public static int add2(int k20_i) { // 메소드
		k20_iStatic++; // static변수의 값을 올림.
		k20_i++; // 메소드의 parameter 값을 올림.
		System.out.printf("add메소드에서->iStatic=[%d]\n", k20_iStatic);
		// 출력
		System.out.printf("add메소드에서->i=[%d]\n", k20_i);
		// 출력
		return k20_i; // int return메소드이므로 리턴값 있어야함...
	}

	public static void main(String[] args) { // 메인 메소드
		// TODO Auto-generated method stub
		int k20_iMain; // 변수 선언
		
		k20_iMain = 1; // 변수값 초기화
		k20_iStatic = 1; // 변수값 초기화
		
		System.out.printf("**********************************\n"); // 줄 출력
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", k20_iStatic);
		// 당연히 1
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n", k20_iMain);
		// 당연히 1
		System.out.printf("**********************************\n"); // 줄 출력
		
		add(k20_iMain); // 첫번째 메소드 호출... static만 커질거임..
		
		System.out.printf("**********************************\n"); // 줄 출력
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n", k20_iStatic);
		// 당연히 2..  static이니까
		System.out.printf("메소드호출후 메인에서->iMain=[%d]\n", k20_iMain);
		// 메소드에서만 커진거지..그값을 리턴받은것도 아니고..당연히 그대로 1
		System.out.printf("**********************************\n"); // 줄 출력
		
		k20_iMain=add2(k20_iMain); // 두번째 메소드 호출...얘는 좀 다름..
		// 변수값이 바뀌어서 저장됨..
		
		System.out.printf("**********************************\n"); // 줄 출력
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n", k20_iStatic);
		// 당연히 3...
		System.out.printf("메소드호출후 메인에서->iMain=[%d]\n", k20_iMain); // 줄 출력
		// 바뀐 변수값을 return받았으므로.. 2가 되었음
		System.out.printf("**********************************\n"); // 줄 출력
		

	}

}
