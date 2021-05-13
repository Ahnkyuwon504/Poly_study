///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 4. �����ڵ� �ʵ� ����/ó�� 2
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P4_GetHanguel {
	static String get_Hanguel(int N) {
		int k20_iNumVal = N; // �޾ƿ� ����...
		String k20_sNumVal = String.valueOf(k20_iNumVal); // �켱 String���� ��ȯ...

		String k20_sNumVoice = ""; // ���� ���� String ����..
		int k20_i, k20_j; // index��..

		String[] k20_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// ������..
		String[] k20_unitsX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// �ڸ�����..

		k20_i = 0; // 0���� ����..�׷��� �պ��� �д´�..
		k20_j = k20_sNumVal.length() - 1; // ū�ź��� ����..���ʺ��� �����ؾ��Ѵ�..

		while (true) { 
			if (k20_i >= k20_sNumVal.length()) // �������� break
				break;

			if (k20_sNumVal.substring(k20_i, k20_i + 1).equals("0")) { // ���� 0�� ������
				if (k20_unitsX[k20_j].equals("��") || k20_unitsX[k20_j].equals("��")) {
					// ���̳� ���̸�.. �о� �����..
					k20_sNumVoice = k20_sNumVoice + "" + k20_units[k20_j];
					// �߰����ش�
				} else { // �� �� �ƴϸ� �ʿ� ����..
				}
			} else { // 0 ������ ������..
				k20_sNumVoice = k20_sNumVoice + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))]
						+ k20_unitsX[k20_j];
				// �ڸ��� + ��� �о��ش�..
			}
			k20_i++; // �տ��� �ڷ�
			k20_j--; // ū������ ��������..
		}
		return k20_sNumVoice; // ���� String
	}

	static String get_Hanguel_FromPhone(String temp) {
		// ��ȭ��ȣ�� �д¹��� �ٸ���..
		String[] k20_section_temp = temp.split("-"); // �켱 -�������� split
		String k20_phone_section = ""; String k20_phoneVoice = ""; // ���� �׸�
		// ���� �׸��� ��, �߰�, �ڸ� ���� �����׸�
		String[] k20_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// ���� ������ �д´�.
		for (int i = 0; i < k20_section_temp.length; i++) { // �� �ڸ����� �°�..
			String k20_sNumVal = k20_section_temp[i]; // split�� Array�� ����..
			k20_phone_section = ""; // ���� ���� �׸�... �ʱ�ȭ �����ָ� ���δ�
			int k20_i; // �ڸ��� �̵������� index

			k20_i = 0; // 0���� ����

			while (true) {
				if (k20_i == k20_sNumVal.length()) break; // �������� break

				k20_phone_section = k20_phone_section + k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i, k20_i + 1))];
				// ��ȭ��ȣ�� �� �κ��� �ϼ�..
				k20_i++; // index �����Ͽ� break���Ǳ���..
			}
			
			k20_phoneVoice = k20_phoneVoice + k20_phone_section + " ";
			// ��ȭ��ȣ�� �κ��� �׾Ƽ� ��ȭ��ȣ �ϼ�..
		}
		
		return k20_phoneVoice; // String return�Ѵ�..
	}
}
