///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 7. Ŭ������ �迭 (6�� InputDataŬ���� �籸��)
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P7_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k20_iPerson = 5; // 5������ ���ϰ� ����...
		
		P7_OneRec[] k20_OneRec_Array = new P7_OneRec[k20_iPerson];
		// OneRec ��ü�� ���� Array.. ũ��� 5
		k20_OneRec_Array[0] = new P7_OneRec("ȫ��01", 100, 100, 100);
		// 0��° ��ü ����. ���ÿ� Array ����
		k20_OneRec_Array[1] = new P7_OneRec("ȫ��02", 80, 75, 100);
		// 1��° ��ü ����. ���ÿ� Array ����
		k20_OneRec_Array[2] = new P7_OneRec("ȫ��03", 100, 30, 100);
		// 2��° ��ü ����. ���ÿ� Array ����
		k20_OneRec_Array[3] = new P7_OneRec("ȫ��04", 100, 100, 100);
		// 3��° ��ü ����. ���ÿ� Array ����
		k20_OneRec_Array[4] = new P7_OneRec("ȫ��05", 90, 15, 10);
		// 4��° ��ü ����. ���ÿ� Array ����
		

		for (int k20_i = 0; k20_i < k20_iPerson; k20_i++) { // ����Ұ���...
			System.out.printf("��ȣ:%3d, �̸�:%s, ����:%3d, ����:%3d, ����:%3d, "
					// �̸�, ������, ����, �����
					// return�ϴ� �޼ҵ带 ����� ����������
					// ȣ���ϸ� �ڵ����� String, integer�� �Ǿ� ����...
					+ "����:%3d, ���:%f\n", k20_i + 1, k20_OneRec_Array[k20_i].name(), 
					k20_OneRec_Array[k20_i].kor(), k20_OneRec_Array[k20_i].eng(), 
					k20_OneRec_Array[k20_i].mat(), k20_OneRec_Array[k20_i].sum(), 
					k20_OneRec_Array[k20_i].ave());
		}

	}

}
