package softwarecoding6;

public class P3_GradeCard {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 6�� : ��ü���� ���ݸ� �˱�
	// 3. Method Overloading
	//
	// 2021. 04. 28. (��)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////		
	public static void printAverage(int k20_a, int k20_b, int k20_c) { // �� ���� �޼ҵ�
		double k20_avg = (k20_a+k20_b+k20_c) / 3; // ��հ�
		System.out.printf("3�� ����ǥ\n"); // ��� ���
		System.out.printf("=================================================\n"); // �� ���
		System.out.printf("�̸�    ����  ����  ����  ����  ���\n"); // ���� ���
		System.out.printf("=================================================\n"); // �� ���
		System.out.printf("������ %4d  %4d  %4d  %4d   %-4.1f\n\n\n", // ������ ���� ���
				k20_a, k20_b, k20_c, k20_a+k20_b+k20_c, k20_avg);
	}

	public static void printAverage(int k20_a, int k20_b, int k20_c, int k20_d) { // �� ���� �޼ҵ�, �����ε�
		double k20_avg = (k20_a+k20_b+k20_c+k20_d) / 4; // ��հ� 
		System.out.printf("4�� ����ǥ\n"); // ��� ���
		System.out.printf("=================================================\n"); // �� ���
		System.out.printf("�̸�    ����  ����  ����  ����  ����  ���\n"); // ���� ���
		System.out.printf("=================================================\n"); // �� ���
		System.out.printf("������ %4d  %4d  %4d  %4d  %4d   %-4.1f\n\n\n", // �װ��� ���� ���
				k20_a, k20_b, k20_c, k20_d, k20_a+k20_b+k20_c+k20_d, k20_avg);
	}

	public static void printAverage(int k20_a, int k20_b, int k20_c, int k20_d, int k20_e) { // �ټ� ���� �޼ҵ�, �����ε�
		double k20_avg = (k20_a+k20_b+k20_c+k20_d+k20_e) / 5; // ��հ�
		System.out.printf("5�� ����ǥ\n"); // ��� ���
		System.out.printf("=================================================\n");// �� ���
		System.out.printf("�̸�    ����  ����  ����  ����  ��ȸ  ����  ���\n"); // ���� ���
		System.out.printf("=================================================\n");// �� ���
		System.out.printf("������ %4d  %4d  %4d  %4d  %4d  %4d   %-4.1f\n", // �ټ����� ���� ���
				k20_a, k20_b, k20_c, k20_d, k20_e, k20_a+k20_b+k20_c+k20_d+k20_e, k20_avg);
	}

	public static void main(String[] args) { // ���� �޼ҵ�
		// TODO Auto-generated method stub
		printAverage(100, 100, 100); // ������
		printAverage(100, 100, 100, 100); // �װ���
		printAverage(100, 100, 100, 100, 100); // �ټ�����

	}

}
