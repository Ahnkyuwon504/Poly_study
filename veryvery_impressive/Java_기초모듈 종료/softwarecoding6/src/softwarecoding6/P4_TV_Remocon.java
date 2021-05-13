package softwarecoding6;

public class P4_TV_Remocon {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 4. Constructor - Remocon Class
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	protected int k20_max_volume;  protected int k20_min_volume; // ���� �� ����
	protected int k20_max_channel; protected int k20_min_channel; // ä�� �� ����
	protected int k20_volume; protected int k20_channel; // ����, ä�� ���۰�
	protected String k20_volume_help; protected String k20_channel_help; // �ȳ���
	
	P4_TV_Remocon() { // ������(�ʱ�ȭ�� ���ÿ�)
		k20_max_volume = 5; k20_min_volume = 0; // 5~0�� ������
		k20_max_channel = 10; k20_min_channel = 0; // 10~0�� ä�ΰ�
		k20_volume = 1; k20_channel = 1; // ����, ä�� ���۰�
		k20_volume_help = "���� 0~5, �⺻ ���� 1�� ���ÿϷ�"; k20_channel_help = "ä�� 0~10, �⺻ ä�� 1�� ���ÿϷ�"; // �ȳ���
	}
	
	P4_TV_Remocon(int maxvol, int minvol, int maxcha, int mincha, int vol, int cha) {
		// ������(��ü������ ���� �ο���)
		k20_max_volume = maxvol; k20_min_volume = minvol; // �ִ��ּ� ����
		k20_max_channel = maxcha; k20_max_channel = mincha; // �ִ��ּ� ä��
		k20_volume = vol; k20_channel = cha; // ���� ����ä��
		k20_volume_help = "���� ���� ���ÿϷ�"; k20_channel_help = "���� ä�� ���ÿϷ�"; // �ȳ���
	}
	
	void VolUp() { // ���� ���� �޼ҵ�
		if (k20_volume == k20_max_volume) { // �ִ�
			k20_volume_help = "�ִ� �����Դϴ�. ������ ���̽ʽÿ�."; // �ȳ���
		} else { // �ִ� �ƴ϶��
			k20_volume++; // ������ ����
			k20_volume_help = String.format("���� ������ %d�Դϴ�.", k20_volume); // �ȳ���
		}
	}
	
	void VolUp(int k20_how) { // ���� ���� �޼ҵ�, integer����ŭ ����, �����ε�
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // �ο��� integer��ŭ
			this.VolUp(); // ���������޼ҵ� �ǽõ�.
		}
	}
	
	void VolDn() { // ���� ���� �޼ҵ�
		if (k20_volume == k20_min_volume) { // �ּ�
			k20_volume_help = "�ּ� �����Դϴ�. �� �鸮�� �̴ϴ�."; // �ȳ���
		} else { // �ּ� �ƴ϶��
			k20_volume--; // ���� ����
			k20_volume_help = String.format("���� ������ %d�Դϴ�.", k20_volume); // �ȳ���
		}
	}
	
	void VolDn(int k20_how) { // ���� ���� �޼ҵ�, �����ε�
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // �ο��� ����ŭ
			this.VolDn(); // ���Ҹ޼ҵ� �ǽ�
		}
	}
	
	void ChannelUp() { // ä�������޼ҵ�
		if (k20_channel == k20_max_channel) { // �ִ�ä���̶��
			k20_channel_help = "������ ä���Դϴ�."; // �ȳ���
		} else { // �ִ� �ƴ϶��
			k20_channel++; // ä�� ����
			k20_channel_help = String.format("���� ä���� %d���Դϴ�.", k20_channel); // �ȳ���
		}
	}
	
	void ChannelUp(int k20_how) { // ä�������޼ҵ�, �����ε�
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // �ο��� ����ŭ
			this.ChannelUp(); // ����
		}
	}
	
	void ChannelDn() { // ä�� ���� �޼ҵ�
		if (k20_channel == k20_min_channel) { // �ּҶ��
			k20_channel_help = "ó�� ä���Դϴ�."; // �ȳ���
		} else { // �ּ� �ƴ϶��
			k20_channel--; // ä�� ����
			k20_channel_help = String.format("���� ä���� %d���Դϴ�.", k20_channel); // �ȳ��� 
		}
	}
	
	void ChannelDn(int k20_how) { // ä�� ���� �޼ҵ�
		for (int k20_i = 0; k20_i < k20_how; k20_i++) { // �ο��� ����ŭ
			this.ChannelDn(); // ä�� ����
		}
	}

	void msg_Volume(String id) { // �ȳ��� ������ִ� �޼ҵ�
		System.out.printf("%s => [%s] �ִ뺼��[%d] �ּҺ���[%d] ���纼��[%d]\n", // �ȳ��� ���, ��Ȳ �˷���
						  id, k20_volume_help, k20_max_volume, k20_min_volume, k20_volume);
	}
	
	void msg_Channel(String id) { // �ȳ��� ������ִ� �޼ҵ�
		System.out.printf("%s => [%s] �ִ�ä��[%d] �ּ�ä��[%d] ����ä��[%d]\n", // �ȳ��� ���, ��Ȳ �˷���
						  id, k20_channel_help, k20_max_channel, k20_min_channel, k20_channel);
	}
	
	
	
	
	
	
	
	
	

}
