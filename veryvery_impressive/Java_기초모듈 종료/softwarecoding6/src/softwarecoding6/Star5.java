package softwarecoding6;

public class Star5 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 클래스, 객체, 인스턴스 - 티비 리모콘 만들기
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star5_Cal cc = new Star5_Cal(); // 객체 선언 및 생성
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", cc.sum(1, 2)); // 두개덧셈 자동호출
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", cc.sum(1, 2, 3)); // 세개덧셈 자동호출
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", cc.sum(1, 2, 3, 4)); // 네개 자동호출
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", cc.sum(1.2, 2.3)); // 더블 호출
	}
}
