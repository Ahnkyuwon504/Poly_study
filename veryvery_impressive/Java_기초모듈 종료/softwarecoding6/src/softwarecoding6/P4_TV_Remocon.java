package softwarecoding6;

public class P4_TV_Remocon {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 4. Constructor - Remocon Class
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	protected int k20_max_volume;  protected int k20_min_volume; // 볼륨 값 생성
	protected int k20_max_channel; protected int k20_min_channel; // 채널 값 생성
	protected int k20_volume; protected int k20_channel; // 볼륨, 채널 시작값
	protected String k20_volume_help; protected String k20_channel_help; // 안내문
	
	P4_TV_Remocon() { // 생성자(초기화를 동시에)
		k20_max_volume = 5; k20_min_volume = 0; // 5~0의 볼륨값
		k20_max_channel = 10; k20_min_channel = 0; // 10~0의 채널값
		k20_volume = 1; k20_channel = 1; // 볼륨, 채널 시작값
		k20_volume_help = "볼륨 0~5, 기본 볼륨 1로 세팅완료"; k20_channel_help = "채널 0~10, 기본 채널 1로 세팅완료"; // 안내문
	}
	
	P4_TV_Remocon(int maxvol, int minvol, int maxcha, int mincha, int vol, int cha) {
		// 생성자(객체생성간 값을 부여함)
		k20_max_volume = maxvol; k20_min_volume = minvol; // 최대최소 볼륨
		k20_max_channel = maxcha; k20_max_channel = mincha; // 최대최소 채널
		k20_volume = vol; k20_channel = cha; // 시작 볼륨채널
		k20_volume_help = "맞춤 볼륨 세팅완료"; k20_channel_help = "맞춤 채널 세팅완료"; // 안내문
	}
	
	void VolUp() { // 볼륨 증가 메소드
		if (k20_volume == k20_max_volume) { // 최대
			k20_volume_help = "최대 볼륨입니다. 볼륨을 줄이십시오."; // 안내문
		} else { // 최대 아니라면
			k20_volume++; // 볼륨을 증가
			k20_volume_help = String.format("현재 볼륨은 %d입니다.", k20_volume); // 안내문
		}
	}
	
	void VolUp(int k20_how) { // 볼륨 증가 메소드, integer값만큼 증가, 오버로딩
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // 부여된 integer만큼
			this.VolUp(); // 볼륨증가메소드 실시됨.
		}
	}
	
	void VolDn() { // 볼륨 감소 메소드
		if (k20_volume == k20_min_volume) { // 최소
			k20_volume_help = "최소 볼륨입니다. 안 들리실 겁니다."; // 안내문
		} else { // 최소 아니라면
			k20_volume--; // 볼륨 감소
			k20_volume_help = String.format("현재 볼륨은 %d입니다.", k20_volume); // 안내문
		}
	}
	
	void VolDn(int k20_how) { // 볼륨 감소 메소드, 오버로딩
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // 부여된 수만큼
			this.VolDn(); // 감소메소드 실시
		}
	}
	
	void ChannelUp() { // 채널증가메소드
		if (k20_channel == k20_max_channel) { // 최대채널이라면
			k20_channel_help = "마지막 채널입니다."; // 안내문
		} else { // 최대 아니라면
			k20_channel++; // 채널 증가
			k20_channel_help = String.format("현재 채널은 %d번입니다.", k20_channel); // 안내문
		}
	}
	
	void ChannelUp(int k20_how) { // 채널증가메소드, 오버로딩
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // 부여된 값만큼
			this.ChannelUp(); // 증가
		}
	}
	
	void ChannelDn() { // 채널 감소 메소드
		if (k20_channel == k20_min_channel) { // 최소라면
			k20_channel_help = "처음 채널입니다."; // 안내문
		} else { // 최소 아니라면
			k20_channel--; // 채널 감소
			k20_channel_help = String.format("현재 채널은 %d번입니다.", k20_channel); // 안내문 
		}
	}
	
	void ChannelDn(int k20_how) { // 채널 감소 메소드
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // 부여된 수만큼
			this.ChannelDn(); // 채널 감소
		}
	}

	void msg_Volume(String id) { // 안내문 출력해주는 메소드
		System.out.printf("%s => [%s] 최대볼륨[%d] 최소볼륨[%d] 현재볼륨[%d]\n", // 안내문 출력, 현황 알려줌
						  id, k20_volume_help, k20_max_volume, k20_min_volume, k20_volume);
	}
	
	void msg_Channel(String id) { // 안내문 출력해주는 메소드
		System.out.printf("%s => [%s] 최대채널[%d] 최소채널[%d] 현재채널[%d]\n", // 안내문 출력, 현황 알려줌
						  id, k20_channel_help, k20_max_channel, k20_min_channel, k20_channel);
	}
	
	
	
	
	
	
	
	
	

}
