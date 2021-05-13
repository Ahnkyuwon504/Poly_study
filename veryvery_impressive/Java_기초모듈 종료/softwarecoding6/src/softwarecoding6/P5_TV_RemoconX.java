package softwarecoding6;

public class P5_TV_RemoconX extends P4_TV_Remocon {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 5. Inheritance - TV Remocon X
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	private int k20_battery; // ���͸� �������� ����
	protected String k20_battery_help; // ���͸��ȳ��� �������� ����

	P5_TV_RemoconX(int k20_maxvol, int k20_minvol, int k20_maxcha, int k20_mincha, int k20_vol, int k20_cha, int k20_bat) { // ������, ���͸����� ���� �������.
		k20_max_volume = k20_maxvol; k20_min_volume = k20_minvol; k20_max_channel = k20_maxcha; k20_min_channel = k20_mincha; // ����ä�� �ִ��ּҰ� ���� 
		k20_volume = k20_vol; k20_channel = k20_cha; k20_battery = k20_bat; // ����, ä��, ���͸���Ȳ�� ����
		k20_volume_help = "���� ���� ���ÿϷ�"; // ���� �ȳ���
		k20_channel_help = "���� ä�� ���ÿϷ�"; // ä�� �ȳ���
		k20_battery_help = "�� ���͸��� ��ü�߽��ϴ�."; // ���͸� �ȳ���
	}

	@Override
	void VolUp() {
		if (k20_battery > 0) {
			if (k20_volume == k20_max_volume) {
				k20_volume_help = "�ִ� �����Դϴ�. ������ ���̽ʽÿ�.";
			} else {
				k20_volume++;
				k20_battery--;
				k20_volume_help = String.format("���� ������ %d�Դϴ�.", k20_volume);
			}
		} else {
			k20_volume_help = String.format("���͸��� ������ ����� ������ �� �����ϴ�.");
		}
	}

	@Override
	void VolDn() {
		if (k20_battery > 0) {
			if (k20_volume == k20_min_volume) {
				k20_volume_help = "�ּ� �����Դϴ�. �� �鸮�� �̴ϴ�.";
			} else {
				k20_volume--;
				k20_battery--;
				k20_volume_help = String.format("���� ������ %d�Դϴ�.", k20_volume);
			}
		} else {
			k20_volume_help = String.format("���͸��� ������ ����� ������ �� �����ϴ�.");
		}
	}

	@Override
	void ChannelUp() {
		if (k20_battery > 0) {
			if (k20_channel == k20_max_channel) {
				k20_channel_help = "������ ä���Դϴ�.";
			} else {
				k20_channel++;
				k20_battery--;
				k20_channel_help = String.format("���� ä���� %d���Դϴ�.", k20_channel);
			}
		} else {
			k20_channel_help = String.format("���͸��� ������ ����� ������ �� �����ϴ�.");
		}
	}

	@Override
	void ChannelDn() {
		if (k20_battery > 0) {
			if (k20_channel == k20_min_channel) {
				k20_channel_help = "ó�� ä���Դϴ�.";
			} else {
				k20_channel--;
				k20_battery--;
				k20_channel_help = String.format("���� ä���� %d���Դϴ�.", k20_channel);
			}
		} else {
			k20_channel_help = String.format("���͸��� ������ ����� ������ �� �����ϴ�.");
		}
	}

	@Override
	void msg_Volume(String k20_id) {
		System.out.printf("%s => [%s] �ִ뺼��[%d] �ּҺ���[%d] ���纼��[%d] ���͸� �ܿ���[%d]\n", k20_id, k20_volume_help, k20_max_volume,
				k20_min_volume, k20_volume, k20_battery);
	}

	@Override
	void msg_Channel(String k20_id) {
		System.out.printf("%s => [%s] �ִ�ä��[%d] �ּ�ä��[%d] ����ä��[%d] ���͸� �ܿ���[%d]\n", k20_id, k20_channel_help, k20_max_channel,
				k20_min_channel, k20_channel, k20_battery);
	}

	void Check_Battery() { // ���͸� üũ �޼ҵ�
		if (k20_battery == 0) { // ���͸��� ������
			k20_battery_help = String.format("���͸��� �� �Ǿ����ϴ�. ���͸��� ��ü�� �ֽʽÿ�.."); // �ȳ���
		} else { // ���͸��� ������
			k20_battery_help = String.format("���� ���͸��� %d%%�Դϴ�.", k20_battery); // �ȳ���
		}
		System.out.println(k20_battery_help); // �ȳ��� ���
	}

}
