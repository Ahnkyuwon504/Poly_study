package softwarecoding6;

public class Star6_Elevator {
	int limit_up_floor;  // ��������
	int limit_down_floor; // ��������
	int floor; // ��������
	String help; // ��������
	
	Star6_Elevator() {
		limit_up_floor = 10; // ������... �⺻����
		limit_down_floor = 1; // �⺻����
		floor = 1; // �⺻����
		help = "���������� �⺻ �߰��Ϸ�."; // �⺻����
	}
	
	Star6_Elevator(int up_floor, int d_floor, int in_floor) {
		limit_up_floor = up_floor; // ���㼼��
		limit_down_floor = d_floor; // ���㼼��
		floor = in_floor; // ���㼼��
		help = "���������� ���� �߰��Ϸ�."; // ���㼼��
	}
	
	void up() {
		if (floor == limit_up_floor) { // �ִ���
			help = "������ ���Դϴ�."; // �ȳ��� ���
		} else { // �ִ��� �ƴϸ�
			floor++; // 1�� ������
			help = String.format("[%d]���Դϴ�.", floor); // �ȳ��� ���
		}
	}
	
	void down() {
		if (floor == limit_down_floor) { // �ּ���
			help = "ó�� ���Դϴ�."; // �ȳ��� ���
		} else { // �ּ��� �ƴϸ�
			floor--; // �ȳ��� ���
			help = String.format("[%d]���Դϴ�.", floor); // �ȳ��� ���
		}
	}
	
	void up(int u) {
		for (int i = 0; i < u; i++) this.up(); // ���� ���ڸ�ŭ ���
	}
	
	void down(int u) {
		for (int i = 0; i < u; i++) this.down(); // ���� ���ڸ�ŭ �ϰ�
	}
	
	void msg(String id) { // �޼��� �޼ҵ�
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n",
				id, help, limit_up_floor, limit_down_floor, floor);
	}

}
