package softwarecoding6;

public class Star7 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 클래스, 객체, 인스턴스 - 티비 리모콘 만들기
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star7_Elevator elev3; // 리페어 기능 생긴 엘레베이터 객체 선언
		
		elev3 = new Star7_Elevator(); // 객체 생성
		for (int i = 0; i < 10; i++) { // 10번
			elev3.up(); // 올린다
			System.out.printf("MSG elev3[%s]\n", elev3.help); // 안내문
		}
		
		for (int i = 0; i < 10; i++) { // 10번
			elev3.down(); // 내린다
			System.out.printf("MSG elev3[%s]\n", elev3.help); // 안내문
		}
		elev3.Repair(); // 수리... 메세지 바뀜
		System.out.printf("MSG elev3[%s]\n", elev3.help); // 수리안내문

	}

}
