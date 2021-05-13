package softwarecoding6;

public class P4_Main {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 4. Constructor - Main Class
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	static P4_TV_Remocon k20_remocon1; // 리모콘1
	static P4_TV_Remocon k20_remocon2; // 리모콘2
	static P4_TV_Remocon k20_remocon3; // 리모콘3
	static P5_TV_RemoconX k20_remocon4_X; // 배터리 기능 내장된 리모콘4
	static P5_TV_RemoconX k20_remocon5_x; // 배터리 기능 내장된 리모콘5

	public static void main(String[] args) {
		k20_remocon1 = new P4_TV_Remocon(); // 리모콘1 객체 생성
		k20_remocon2 = new P4_TV_Remocon(5, 0, 10, 0, 1, 1); // 리모콘2 객체 생성, 채널볼륨값 부여
		k20_remocon3 = new P4_TV_Remocon(101, 23, 3, -15, 95, 0); // 리모콘3 객체 생성, 값 부여
		k20_remocon4_X = new P5_TV_RemoconX(10, 0, 20, 0, 5, 3, 100); // 리모콘4 객체 생성, 배터리 부여
		k20_remocon5_x = new P5_TV_RemoconX(20, 0, 20, 0, 5, 3, 5); // 리모콘5 객체 생성, 배터리 부여
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10번 실시
			k20_remocon1.ChannelUp(); k20_remocon1.msg_Channel("1번 리모콘으로 채널 1씩 올리기"); // 안내문 출력
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10번 실시
			k20_remocon1.ChannelUp(2); k20_remocon1.msg_Channel("1번 리모콘으로 채널 2씩 올리기"); // 안내문 출력
		}
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5번 실시
			k20_remocon1.ChannelDn(3); k20_remocon1.msg_Channel("1번 리모콘으로 채널 3씩 내리기"); // 안내문 출력
			
		}
		
		
		for (int k20_i = 0; k20_i < 5; k20_i++) {  // 5번 실시
			k20_remocon2.VolUp(2); k20_remocon2.msg_Volume("2번 리모콘으로 볼륨 2씩 올리기"); // 안내문 출력
		}
		
		for (int k20_i = 0; k20_i < 2; k20_i++) { // 2번 실시
			k20_remocon2.VolDn(5); k20_remocon2.msg_Volume("2번 리모콘으로 볼륨 5씩 내리기"); // 안내문 출력
		}
		
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5번 실시
			k20_remocon3.VolUp(3); k20_remocon3.msg_Volume("3번 리모콘으로 볼륨 3씩 올리기"); // 안내문 출력
		}
		
		
		k20_remocon4_X.Check_Battery(); // 배터리 체크
		
		for (int k20_i = 0; k20_i <7; k20_i++) { // 7번 실시
			k20_remocon4_X.ChannelUp(4); k20_remocon4_X.msg_Channel("4번 리모콘으로 볼륨 4씩 올리기"); // 안내문 출력
		}
		k20_remocon4_X.Check_Battery(); // 배터리 체크
		
		
		k20_remocon5_x.Check_Battery(); // 배터리 체크
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10번 실시
			k20_remocon5_x.VolUp(); k20_remocon5_x.msg_Volume("배터리 얼마 없는 5번 리모콘으로 볼륨 1씩 올리기"); // 안내문 출력
		}
		k20_remocon5_x.Check_Battery(); // 배터리 체크
		

	}

}
