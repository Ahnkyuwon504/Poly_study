package softwarecoding6;

public class Star7_Elevator extends Star6_Elevator {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 클래스, 객체, 인스턴스 - 티비 리모콘 만들기
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	void Repair() {
		help = String.format("수리중입니다."); // 상속받았으므로..추가하고싶은것만 추가해
	}
	
	void up() {
		if (floor == limit_up_floor) { // 최대층
			help = "마지막 층입니다."; // 안내문 출력
		} else { // 최대층 아니면
			floor = floor + 2; // 1층 오르고
			help = String.format("[%d]층입니다.", floor); // 안내문 출력
		}
		
		this.down(); // 2층 오르고 한 층 내리는 결과
	}
	
	void down() { // 오버라이딩... 같은 메소드명, 내용은 달라
		super.down(); // 일단 부모꺼로 한번 내리고..
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.help);
		// 자식꺼가 돌고있다는거 표시용 메세지..
	}

}
