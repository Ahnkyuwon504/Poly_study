package softwarecoding6;

public class P5_TV_RemoconX extends P4_TV_Remocon {
	///////////////////////////////////////////////////////////////////////
	// 소프트웨어코딩 6강 : 객체지향 조금만 알기
	// 5. Inheritance - TV Remocon X
	//
	// 2021. 04. 28. (수)
	// 2125341020 안규원
	///////////////////////////////////////////////////////////////////////	
	private int k20_battery; // 배터리 전역변수 선언
	protected String k20_battery_help; // 배터리안내문 전역변수 선언

	P5_TV_RemoconX(int k20_maxvol, int k20_minvol, int k20_maxcha, int k20_mincha, int k20_vol, int k20_cha, int k20_bat) { // 생성자, 배터리까지 같이 만들어줌.
		k20_max_volume = k20_maxvol; k20_min_volume = k20_minvol; k20_max_channel = k20_maxcha; k20_min_channel = k20_mincha; // 볼륨채널 최대최소값 생성 
		k20_volume = k20_vol; k20_channel = k20_cha; k20_battery = k20_bat; // 볼륨, 채널, 배터리현황값 생성
		k20_volume_help = "맞춤 볼륨 세팅완료"; // 볼륨 안내문
		k20_channel_help = "맞춤 채널 세팅완료"; // 채널 안내문
		k20_battery_help = "새 배터리로 교체했습니다."; // 배터리 안내문
	}

	@Override
	void VolUp() {
		if (k20_battery > 0) {
			if (k20_volume == k20_max_volume) {
				k20_volume_help = "최대 볼륨입니다. 볼륨을 줄이십시오.";
			} else {
				k20_volume++;
				k20_battery--;
				k20_volume_help = String.format("현재 볼륨은 %d입니다.", k20_volume);
			}
		} else {
			k20_volume_help = String.format("배터리가 부족해 명령을 실행할 수 없습니다.");
		}
	}

	@Override
	void VolDn() {
		if (k20_battery > 0) {
			if (k20_volume == k20_min_volume) {
				k20_volume_help = "최소 볼륨입니다. 안 들리실 겁니다.";
			} else {
				k20_volume--;
				k20_battery--;
				k20_volume_help = String.format("현재 볼륨은 %d입니다.", k20_volume);
			}
		} else {
			k20_volume_help = String.format("배터리가 부족해 명령을 실행할 수 없습니다.");
		}
	}

	@Override
	void ChannelUp() {
		if (k20_battery > 0) {
			if (k20_channel == k20_max_channel) {
				k20_channel_help = "마지막 채널입니다.";
			} else {
				k20_channel++;
				k20_battery--;
				k20_channel_help = String.format("현재 채널은 %d번입니다.", k20_channel);
			}
		} else {
			k20_channel_help = String.format("배터리가 부족해 명령을 실행할 수 없습니다.");
		}
	}

	@Override
	void ChannelDn() {
		if (k20_battery > 0) {
			if (k20_channel == k20_min_channel) {
				k20_channel_help = "처음 채널입니다.";
			} else {
				k20_channel--;
				k20_battery--;
				k20_channel_help = String.format("현재 채널은 %d번입니다.", k20_channel);
			}
		} else {
			k20_channel_help = String.format("배터리가 부족해 명령을 실행할 수 없습니다.");
		}
	}

	@Override
	void msg_Volume(String k20_id) {
		System.out.printf("%s => [%s] 최대볼륨[%d] 최소볼륨[%d] 현재볼륨[%d] 배터리 잔여량[%d]\n", k20_id, k20_volume_help, k20_max_volume,
				k20_min_volume, k20_volume, k20_battery);
	}

	@Override
	void msg_Channel(String k20_id) {
		System.out.printf("%s => [%s] 최대채널[%d] 최소채널[%d] 현재채널[%d] 배터리 잔여량[%d]\n", k20_id, k20_channel_help, k20_max_channel,
				k20_min_channel, k20_channel, k20_battery);
	}

	void Check_Battery() { // 배터리 체크 메소드
		if (k20_battery == 0) { // 배터리가 없으면
			k20_battery_help = String.format("배터리가 다 되었습니다. 배터리를 교체해 주십시오.."); // 안내문
		} else { // 배터리가 있으면
			k20_battery_help = String.format("현재 배터리는 %d%%입니다.", k20_battery); // 안내문
		}
		System.out.println(k20_battery_help); // 안내문 출력
	}

}
