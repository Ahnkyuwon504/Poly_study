package softwarecoding2;

import java.util.Scanner;

public class P6 {
	///////////////////////////////////////////////////////////////////////
	// ����Ʈ�����ڵ� 2��. ����
	// 6. ScannerEx
	// 21. 04. 27. (ȭ)
	// 2125341020 �ȱԿ�
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);
		// ���ڸ� �Է��ϵ��� �ȳ��� �ۼ�
		// �ٷ� ���� �Է��ϴ°��� �ð������� �����ϵ��� ln���� �� �ȹٲ�.
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		// input�� ��ĳ�ʷ� �Է¹޴� ���� ����
		String input = scanner.nextLine();
		// num�� ���� input�� Integer�� ��ȯ
		int num = Integer.parseInt(input);
		// �Է³��� ���
		System.out.println("�Է³��� : " + input);
		// number ���, ���� ������ ������... ���� �ٸ���.
		System.out.printf("num = %d%n", num);

	}

}
