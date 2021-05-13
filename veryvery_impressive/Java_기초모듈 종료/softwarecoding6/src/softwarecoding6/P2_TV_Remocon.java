package softwarecoding6;

public class P2_TV_Remocon {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 2. Ŭ����, ��ü, �ν��Ͻ� - Ƽ�� ������ �����
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	final int k20_max_volume = 5; final int k20_min_volume = 0; // ���� �ִ��ּ� ����
	final int k20_max_channel = 10; final int k20_min_channel = 0; // ä�� �ִ��ּ� ����
	int k20_volume = 1; // ���� ����
	int k20_channel = 1; // ���� ä��
	String k20_volume_help; // ���� �ȳ���
	String k20_channel_help; // ä�� �ȳ���
	
	void VolUp() { // ���� ���� �޼ҵ�
		if (k20_volume == k20_max_volume) { // �ִ� �����̶��
			k20_volume_help = "�� �ø� �� �����ϴ�. �ִ� �����Դϴ�. ������ ���̽ʽÿ�."; // �ȳ���
		} else { // �ִ밡 �ƴ϶��
			k20_volume++; // ������ 1 �ø���.
			k20_volume_help = String.format("���� ������ %d�Դϴ�.", k20_volume); // �ȳ���
		}
	}
	
	void VolDn() { // ���� ���� �޼ҵ�
		if (k20_volume == k20_min_volume) { // �ּ� �����̶��
			k20_volume_help = "�� ���� �� �����ϴ�.�ּ� �����Դϴ�. �� �鸮�� �̴ϴ�."; // �ȳ���
		} else { // �ּҰ� �ƴ϶��
			k20_volume--; // ������ 1 ���ҽ�Ų��.
			k20_volume_help = String.format("���� ������ %d�Դϴ�.", k20_volume); // �ȳ���
		}
	}
	
	void ChannelUp() { // ä�� ���� �޼ҵ�
		if (k20_channel == k20_max_channel) { // �ִ� ä���̶��
			k20_channel_help = "������ ä���Դϴ�."; // �ȳ���
		} else { // �ִ밡 �ƴ϶��
			k20_channel++; // ä�� ����
			k20_channel_help = String.format("���� ä���� %d���Դϴ�.", k20_channel); // �ȳ���
		}
	}
	
	void ChannelDn() { // ä�� ���� �޼ҵ�
		if (k20_channel == k20_min_channel) { // �ּ� ä���̶��
			k20_channel_help = "ó�� ä���Դϴ�."; // �ȳ���
		} else { // �ּҰ� �ƴ϶��
			k20_channel--; // ä�� ����
			k20_channel_help = String.format("���� ä���� %d���Դϴ�.", k20_channel); // �ȳ���
		}
	}

	public static void main(String[] args) { // ���� �޼ҵ�
		P2_TV_Remocon remocon = new P2_TV_Remocon(); // Ŭ������ü ����
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5��
			remocon.VolUp(); // ���� ����
			System.out.printf("MSG[%s]\n", remocon.k20_volume_help); // �ȳ��� ���
		}
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5��
			remocon.VolDn(); // ���� ����
			System.out.printf("MSG[%s]\n", remocon.k20_volume_help); // �ȳ��� ���
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10��
			remocon.ChannelUp(); // ä�� ����
			System.out.printf("MSG[%s]\n", remocon.k20_channel_help); // �ȳ��� ���
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10��
			remocon.ChannelDn(); // ä�� ����
			System.out.printf("MSG[%s]\n", remocon.k20_channel_help); // �ȳ��� ���
		}
	}

}
