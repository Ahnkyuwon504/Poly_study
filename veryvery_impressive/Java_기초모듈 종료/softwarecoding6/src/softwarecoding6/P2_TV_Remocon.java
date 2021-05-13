package softwarecoding6;

public class P2_TV_Remocon {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 2. 클래스, 객체, 인스턴스 - 티비 리모콘 만들기
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	final int k20_max_volume = 5; final int k20_min_volume = 0; // 볼륨 최대최소 생성
	final int k20_max_channel = 10; final int k20_min_channel = 0; // 채널 최대최소 생성
	int k20_volume = 1; // 시작 볼륨
	int k20_channel = 1; // 시작 채널
	String k20_volume_help; // 볼륨 안내문
	String k20_channel_help; // 채널 안내문
	
	void VolUp() { // 볼륨 증가 메소드
		if (k20_volume == k20_max_volume) { // 최대 볼륨이라면
			k20_volume_help = "더 올릴 수 없습니다. 최대 볼륨입니다. 볼륨을 줄이십시오."; // 안내문
		} else { // 최대가 아니라면
			k20_volume++; // 볼륨을 1 올린다.
			k20_volume_help = String.format("현재 볼륨은 %d입니다.", k20_volume); // 안내문
		}
	}
	
	void VolDn() { // 볼륨 감소 메소드
		if (k20_volume == k20_min_volume) { // 최소 볼륨이라면
			k20_volume_help = "더 내릴 수 없습니다.최소 볼륨입니다. 안 들리실 겁니다."; // 안내문
		} else { // 최소가 아니라면
			k20_volume--; // 볼륨을 1 감소시킨다.
			k20_volume_help = String.format("현재 볼륨은 %d입니다.", k20_volume); // 안내문
		}
	}
	
	void ChannelUp() { // 채널 증가 메소드
		if (k20_channel == k20_max_channel) { // 최대 채널이라면
			k20_channel_help = "마지막 채널입니다."; // 안내문
		} else { // 최대가 아니라면
			k20_channel++; // 채널 증가
			k20_channel_help = String.format("현재 채널은 %d번입니다.", k20_channel); // 안내문
		}
	}
	
	void ChannelDn() { // 채널 감소 메소드
		if (k20_channel == k20_min_channel) { // 최소 채널이라면
			k20_channel_help = "처음 채널입니다."; // 안내문
		} else { // 최소가 아니라면
			k20_channel--; // 채널 감소
			k20_channel_help = String.format("현재 채널은 %d번입니다.", k20_channel); // 안내문
		}
	}

	public static void main(String[] args) { // 메인 메소드
		P2_TV_Remocon remocon = new P2_TV_Remocon(); // 클래스객체 생성
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5번
			remocon.VolUp(); // 볼륨 증가
			System.out.printf("MSG[%s]\n", remocon.k20_volume_help); // 안내문 출력
		}
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5번
			remocon.VolDn(); // 볼륨 감소
			System.out.printf("MSG[%s]\n", remocon.k20_volume_help); // 안내문 출력
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10번
			remocon.ChannelUp(); // 채널 증가
			System.out.printf("MSG[%s]\n", remocon.k20_channel_help); // 안내문 출력
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10번
			remocon.ChannelDn(); // 채널 감소
			System.out.printf("MSG[%s]\n", remocon.k20_channel_help); // 안내문 출력
		}
	}

}
