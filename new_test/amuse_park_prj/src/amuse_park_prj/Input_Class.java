package amuse_park_prj;

import java.util.Scanner;

public class Input_Class {
	Scanner sc = null;
	public Input_Class() {
		sc = new Scanner(System.in);
	}
	// ��&�� ���� ����
	public int day_Or_Night_InputFromConsole() {
		int user_Choice;
		System.out.printf("������ �����ϼ���.\n1. �ְ���\n2. �߰���\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // ���� �ذ�
		return user_Choice;
	}
	// �ֹι�ȣ �Է�. ���� ���ϸ� �߶��.
	public int social_Number_InputFromConsole() {
		String user_Input;
		int birth;
		System.out.printf("�ֹι�ȣ�� �Է��ϼ���.\n");
		user_Input = sc.nextLine();
		birth = Integer.parseInt(user_Input.substring(0, 2));
		return birth;
	}
	// ������ �ֹ�����.
	public int how_Many_InputFromConsole() {
		int user_Choice;
		System.out.printf("�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // ���� �ذ�
		return user_Choice;
	}
	// ������ ����.
	public int treatment_InputFromConsole() {
		int user_Choice;
		System.out.printf("�������� �����ϼ���.\n1. ���� (���� ���� �ڵ�ó��)\n2. �����\n");
		System.out.printf("3. ����������\n4. ���ڳ�\n5. �ӻ��\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // ���� �ذ�
		return user_Choice;
	}
	// ��� �߱� ����
	public int continue_Or_Not_InputFromConsole() {
		int user_Choice;
		System.out.printf("��� �߱��Ͻðڽ��ϱ�?\n1. Ƽ�� �߱�\n2. ����\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // ���� �ذ�
		return user_Choice;
	}
	// ó������ �ֹ�����, ���α׷� �������� ����
	public int continue_Program_Or_Not_InputFromConsole() {
		int user_Choice;
		System.out.printf("��� ����(1 : ���ο� �ֹ�, 2 : ���α׷� ����)\n");
		user_Choice = sc.nextInt();
		sc.nextLine(); // ���� �ذ�
		return user_Choice;
	}
	
	
}
