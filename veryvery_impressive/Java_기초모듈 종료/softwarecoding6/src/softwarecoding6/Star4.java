package softwarecoding6;

import java.util.Iterator;

public class Star4 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 클래스, 객체, 인스턴스(2)
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	private static int k20_inVal; // static 변수 선언
	public static void up() { // 그냥 메소드 생성
		k20_inVal++; // inVal 올려줌...
		System.out.printf("난 그냥 메소드[%d]\n", k20_inVal); // 그냥 메소드임을 표시
	}

	public static void main(String[] args) { // 메인 메소드
		// TODO Auto-generated method stub
		k20_inVal = 0; // 자기 내부 변수
		Star3 k20_elev; // 클래스 받아 객체선언
		
		k20_elev = new Star3(); // 인스턴스 생성하여 객체에 연결
		
		up(); // 그냥 소스내 메소드...
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 열번 올릴거다
			k20_elev.up(); // 올라간다
			System.out.printf("MSG[%s]\n", k20_elev.k20_help); // 객체의 String...
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 열번 내릴거다
			k20_elev.down(); // 내려간다
			System.out.printf("MSG[%s]\n", k20_elev.k20_help); // 객체의 String..출력
		}
	}

}
