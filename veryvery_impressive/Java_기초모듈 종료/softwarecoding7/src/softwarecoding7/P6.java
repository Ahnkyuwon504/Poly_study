///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 6. �迭�� �ִ�, �ּҰ� ã��
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iArray = {1,7,5,3,2,1,2,3,4,5,12,212,33,35,9999,3,4,5,1,2,3};
		// Integer Array �����..
		for (int i = 0; i < iArray.length; i++) { // ���̸�ŭ
			System.out.printf("k20_iArray[%d] = %d\n", i, iArray[i]);
			// ���� ���������� �� ��������..
		}
		
		int iMax = iArray[0]; int iMaxPt = 0; // �ִ�, �ִ��� index �ʱ�ȭ
		int iMin = iArray[0]; int iMinPt = 0; // �ּڰ�, �ּڰ��� index �ʱ�ȭ
		
		for (int i = 0; i < iArray.length; i++) { // ���̸�ŭ ������ test...
			if (iMax < iArray[i]) { // �ִ񰪺��� ũ��
				iMax = iArray[i]; // �ٲٰ�
				iMaxPt = i; // ������ ����...
			}
			if (iMin > iArray[i]) { // �ּڰ����� ������
				iMin = iArray[i]; // �ٲٰ�
				iMinPt = i; // ������ ����...
			}
		}
		
		System.out.printf("Max : iArray[%d] = %d\nMin : iArray[%d] = %d\n", 
						   iMaxPt, iMax, iMinPt, iMin);
		// ����Ͽ� ���� Ȯ��...

	}

}
