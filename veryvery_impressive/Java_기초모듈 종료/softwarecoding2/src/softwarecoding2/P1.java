package softwarecoding2;

public class P1 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 1. ���� ���� 1
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int k20_year = 0; // k20_year ���� ����, �ʱ�ȭ
		int k20_age = 14; // k20_age ���� ����, �ʱ�ȭ
		// ��� 1�� k20_year �ܼ� ���
		System.out.println("���1 : " + k20_year);
		// ��� 2�� k20_age �ܼ� ���
		System.out.println("���2 : " + k20_age);
		
		k20_year = k20_age + 2000; // k20_year ������ 2000�� ����
		k20_age = k20_age + 1; // k20_age ������ 1�� ����
		// ��� 3 ���, �ٲ� ������
		System.out.println("���3 : " + k20_year);
		// ��� 4 ���, �ٲ� ������
		System.out.println("���4 : " + k20_age);
	}
}
