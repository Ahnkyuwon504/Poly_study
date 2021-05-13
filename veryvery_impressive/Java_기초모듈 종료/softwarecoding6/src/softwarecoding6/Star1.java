package softwarecoding6;

public class Star1 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 1. 변수와 메서드(1)
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	public static void iamMethod() { // 메서드 생성
		System.out.printf("메소드라 불러줘요~~\n"); // 텍스트 출력
	}

	public static void main(String[] args) { // 메인 메서드
		// TODO Auto-generated method stub
		Star1.iamMethod(); // 객체생성 없이 메서드 호출
		// static이라 가능...
		iamMethod(); // 클래스명 생략하고 호출
	}
}
