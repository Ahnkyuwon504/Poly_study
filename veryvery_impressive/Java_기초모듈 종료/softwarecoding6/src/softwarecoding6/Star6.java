package softwarecoding6;

public class Star6 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 생성자
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	static Star6_Elevator elev1; // 객체 선언
	static Star6_Elevator elev2; // 객체 선언
	static Star6_Elevator elev3; // 객체 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elev1 = new Star6_Elevator(); // 객체 생성
		elev2 = new Star6_Elevator(20, 1, 8); // 맞춤형 객체 생성
		elev3 = new Star6_Elevator(50, -3, 5); // 맞춤형 객체 생성
		
		for (int i = 0; i < 20; i++) { // 20번 실시
			elev1.up(); elev1.msg("1번엘레 한 층 오르기"); // 한 층씩 오른다.
			//elev2.up(); elev1.msg("1번엘레 한 층 오르기");
			//elev3.up(); elev1.msg("1번엘레 한 층 오르기");
		}
		
		for (int i = 0; i < 20; i++) { // 20번 실시
			elev1.up(2); elev1.msg("1번엘레 2층 오르기"); // 2층씩 오른다.
			//elev2.up(2); elev1.msg("1번엘레 2층 오르기");
			//elev3.up(2); elev1.msg("1번엘레 2층 오르기");
		}
		
		for (int i = 0; i < 20; i++) { // 20번 실시
			elev1.down(3); elev1.msg("1번엘레 3층 내리기"); // 3층씩 내린다...
			//elev2.down(3); elev1.msg("1번엘레 3층 내리기");
			//elev3.down(3); elev1.msg("1번엘레 3층 내리기");
		}

	}

}
