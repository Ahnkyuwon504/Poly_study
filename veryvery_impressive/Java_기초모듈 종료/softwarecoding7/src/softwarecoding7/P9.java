///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 9. ArrayList 2
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_iTestMAX = 1000000; // 100���� ���� �����ž�..
		ArrayList k20_iAL = new ArrayList(); // ArrayList ����, ����
		
		for (int i = 0; i < k20_iTestMAX; i++) { // 100���� ����..
			k20_iAL.add((int)(Math.random() * 1000000)); // ���������Ͽ� ArrayList add
		}
		
		for (int i = 0; i < k20_iAL.size(); i++) { // 100���� ����..
			System.out.printf("ArrayList %d = %d\n", i, k20_iAL.get(i)); //  ���
		}
		
		System.out.printf("************************************\n");
		k20_iAL.sort(null); // ArrayList sort�Ѵ�...
		
		for (int i = 0; i < k20_iAL.size(); i++) { // 100����...
			System.out.printf("ArrayList %d = %d\n", i, k20_iAL.get(i)); // ������� ���
		}

	}

}
