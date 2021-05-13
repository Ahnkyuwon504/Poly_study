///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 1. �ѱ� ���
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));
		// �ں��� �����ϴ� �޼ҵ� ȣ��
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));
		// �ں��� �����ϴ� �޼ҵ� ȣ��
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa", 15));
		// �պ��� �����ϴ� �޼ҵ� ȣ��
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));
		// �պ��� �����ϴ� �޼ҵ� ȣ��
		System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa"));
		// �ѱ� ���� ����ϴ� �޼ҵ� ȣ��

	}

	static String HanBlankForeword(String k20_temp, int k20_numberOfbytes) {
		// parameter�� ����� ����Ʈ ��
		String k20_blankstring = k20_temp;
		// ���Ӱ� ������ String �ʱ�ȭ
		for (int k20_i = 0; k20_i < k20_numberOfbytes - k20_temp.getBytes().length; k20_i++) {
			k20_blankstring = " " + k20_blankstring;
			// ����Ʈ �� ���� ������ ��ŭ �����̽� �� �߰�...
		}

		return k20_blankstring; // ����
	}

	static String HanBlankBackword(String k20_temp, int k20_numberOfbytes) {
		// parameter�� ����� ����Ʈ ��
		String k20_blankstring = k20_temp;
		// ���Ӱ� ������ String �ʱ�ȭ
		for (int k20_i = 0; k20_i < k20_numberOfbytes - k20_temp.getBytes().length; k20_i++) {
			k20_blankstring = k20_blankstring + " ";
			// ����Ʈ �� ���� ������ ��ŭ �����̽� �� �߰�...�ڿ�..
		}

		return k20_blankstring; // ����
	}

	static int HanCount(String k20_temp) { // �ѱ� ��������
		int k20_number_KOR = k20_temp.getBytes().length - k20_temp.length();
		// �ѱ��� ���� 2����Ʈ. �׿ܴ� ���� 1����Ʈ.
		// �� ����Ʈ ���� 2*�ѱ� + 1*�׿�
		// �� ���̴� 1*�ѱ� + 1*�׿�...
		// ���� ����Ʈ���� ���� ���� �ѱ� �� ����.
		int k20_number_notKOR = k20_temp.length() - k20_number_KOR;
		// ��������� �ʴµ� ���� ����.
		return k20_number_KOR; // �ѱ� �� ����..
	}
}
