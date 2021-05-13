package softwarecoding6;

public class Star6_Elevator {
	int limit_up_floor;  // 변수생성
	int limit_down_floor; // 변수생성
	int floor; // 변수생성
	String help; // 변수생성
	
	Star6_Elevator() {
		limit_up_floor = 10; // 생성자... 기본세팅
		limit_down_floor = 1; // 기본세팅
		floor = 1; // 기본세팅
		help = "엘레베이터 기본 중공완료."; // 기본세팅
	}
	
	Star6_Elevator(int up_floor, int d_floor, int in_floor) {
		limit_up_floor = up_floor; // 맞춤세팅
		limit_down_floor = d_floor; // 맞춤세팅
		floor = in_floor; // 맞춤세팅
		help = "엘레베이터 맞춤 중공완료."; // 맞춤세팅
	}
	
	void up() {
		if (floor == limit_up_floor) { // 최대층
			help = "마지막 층입니다."; // 안내문 출력
		} else { // 최대층 아니면
			floor++; // 1층 오르고
			help = String.format("[%d]층입니다.", floor); // 안내문 출력
		}
	}
	
	void down() {
		if (floor == limit_down_floor) { // 최소층
			help = "처음 층입니다."; // 안내문 출력
		} else { // 최소층 아니면
			floor--; // 안내문 출력
			help = String.format("[%d]층입니다.", floor); // 안내문 출력
		}
	}
	
	void up(int u) {
		for (int i = 0; i < u; i++) this.up(); // 받은 숫자만큼 상승
	}
	
	void down(int u) {
		for (int i = 0; i < u; i++) this.down(); // 받은 숫자만큼 하강
	}
	
	void msg(String id) { // 메세지 메소드
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				id, help, limit_up_floor, limit_down_floor, floor);
	}

}
