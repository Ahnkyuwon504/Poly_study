package softwarecoding6;

public class Star3 {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 클래스, 객체, 인스턴스
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	

	int k20_limit_up_floor = 10; // 최상층
	int k20_limit_down_floor = 0; // 최하층
	int k20_floor = 1; // 현재 층
	String k20_help; // 안내문
	
	void up() { // 올라가는 메소드
		if (k20_floor == k20_limit_up_floor) { // 최상층에서는
			k20_help = "마지막 층입니다."; // 안내문
		}  else { // 최상층 아니면
			k20_floor++; // 올려주고
			k20_help = String.format("%d층입니다.", k20_floor); // 안내문
		}
	}
	
	void down() {
		if (k20_floor == k20_limit_down_floor) { // 최하층에서는
			k20_help = "처음층입니다."; // 안내문
		}  else { // 최하층 아니면
			k20_floor--; // 내려줌
			k20_help = String.format("%d층입니다.", k20_floor); // 안내문
		}
	}

}
