package softwarecoding6;

public class P4_Main {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 4. Constructor - Main Class
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////	
	static P4_TV_Remocon k20_remocon1; // ������1
	static P4_TV_Remocon k20_remocon2; // ������2
	static P4_TV_Remocon k20_remocon3; // ������3
	static P5_TV_RemoconX k20_remocon4_X; // ���͸� ��� ����� ������4
	static P5_TV_RemoconX k20_remocon5_x; // ���͸� ��� ����� ������5

	public static void main(String[] args) {
		k20_remocon1 = new P4_TV_Remocon(); // ������1 ��ü ����
		k20_remocon2 = new P4_TV_Remocon(5, 0, 10, 0, 1, 1); // ������2 ��ü ����, ä�κ����� �ο�
		k20_remocon3 = new P4_TV_Remocon(101, 23, 3, -15, 95, 0); // ������3 ��ü ����, �� �ο�
		k20_remocon4_X = new P5_TV_RemoconX(10, 0, 20, 0, 5, 3, 100); // ������4 ��ü ����, ���͸� �ο�
		k20_remocon5_x = new P5_TV_RemoconX(20, 0, 20, 0, 5, 3, 5); // ������5 ��ü ����, ���͸� �ο�
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10�� �ǽ�
			k20_remocon1.ChannelUp(); k20_remocon1.msg_Channel("1�� ���������� ä�� 1�� �ø���"); // �ȳ��� ���
		}
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10�� �ǽ�
			k20_remocon1.ChannelUp(2); k20_remocon1.msg_Channel("1�� ���������� ä�� 2�� �ø���"); // �ȳ��� ���
		}
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5�� �ǽ�
			k20_remocon1.ChannelDn(3); k20_remocon1.msg_Channel("1�� ���������� ä�� 3�� ������"); // �ȳ��� ���
			
		}
		
		
		for (int k20_i = 0; k20_i < 5; k20_i++) {  // 5�� �ǽ�
			k20_remocon2.VolUp(2); k20_remocon2.msg_Volume("2�� ���������� ���� 2�� �ø���"); // �ȳ��� ���
		}
		
		for (int k20_i = 0; k20_i < 2; k20_i++) { // 2�� �ǽ�
			k20_remocon2.VolDn(5); k20_remocon2.msg_Volume("2�� ���������� ���� 5�� ������"); // �ȳ��� ���
		}
		
		
		for (int k20_i = 0; k20_i < 5; k20_i++) { // 5�� �ǽ�
			k20_remocon3.VolUp(3); k20_remocon3.msg_Volume("3�� ���������� ���� 3�� �ø���"); // �ȳ��� ���
		}
		
		
		k20_remocon4_X.Check_Battery(); // ���͸� üũ
		
		for (int k20_i = 0; k20_i <7; k20_i++) { // 7�� �ǽ�
			k20_remocon4_X.ChannelUp(4); k20_remocon4_X.msg_Channel("4�� ���������� ���� 4�� �ø���"); // �ȳ��� ���
		}
		k20_remocon4_X.Check_Battery(); // ���͸� üũ
		
		
		k20_remocon5_x.Check_Battery(); // ���͸� üũ
		
		for (int k20_i = 0; k20_i < 10; k20_i++) { // 10�� �ǽ�
			k20_remocon5_x.VolUp(); k20_remocon5_x.msg_Volume("���͸� �� ���� 5�� ���������� ���� 1�� �ø���"); // �ȳ��� ���
		}
		k20_remocon5_x.Check_Battery(); // ���͸� üũ
		

	}

}
