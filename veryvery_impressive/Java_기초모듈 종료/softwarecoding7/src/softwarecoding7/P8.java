///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 8. ArrayList
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k20_iAL = new ArrayList(); // ArrayList ����
		
		k20_iAL.add("abc"); // ���� �߰�
		k20_iAL.add("abcd"); // ���� �߰�
		k20_iAL.add("efga"); // ���� �߰�
		k20_iAL.add("������0"); // ���� �߰�
		k20_iAL.add("1234"); // ���� �߰�
		k20_iAL.add("123rk45"); // ���� �߰�
		
		System.out.printf("****************************************\n"); // �� ���
		System.out.printf(" ���� ArraySize %d\n", k20_iAL.size()); // ��ȭ ����..������
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // get ����
		}
		
		k20_iAL.set(3, "������"); // 3��° ���Ҹ� ����..0���� �����̴ϱ� �����δ� 4��°..
		System.out.printf("****************************************\n");
		System.out.printf(" ���뺯�� ArraySize %d\n", k20_iAL.size()); // ���� ����Ǿ���..
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // ���� Ȯ��
		}
		
		k20_iAL.remove(4); // 4��° ���� ����.. ArrayList�� �˾Ƽ� ��������...
		System.out.printf("****************************************\n");
		System.out.printf(" ���뺯�� ArraySize %d\n", k20_iAL.size()); // ���� ����Ǿ���...
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // ���� Ȯ��
		}
		
		k20_iAL.sort(null); // ����.. ���� ���� ���� ���� �ѱ� ����..
		System.out.printf("****************************************\n");
		System.out.printf(" ����ƮSort ArraySize %d\n", k20_iAL.size()); // ���� ����...
		for (int i = 0; i < k20_iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i)); // ���� Ȯ��
		}
		
		k20_iAL.clear(); // ArrayList ����
		System.out.printf("****************************************\n");
		System.out.printf(" ���λ��� ArraySize %d\n", k20_iAL.size()); // size�� 0�̵ȴ�..
		for (int i = 0; i < k20_iAL.size(); i++) { // �� for�� �ƿ� �ǽ� �ȵ�
			System.out.printf(" ArrayList %d = %s\n", i, k20_iAL.get(i));
		}
	}
}
