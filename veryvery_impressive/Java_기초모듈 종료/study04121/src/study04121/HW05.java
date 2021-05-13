package study04121;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////////////////////////////////////////////
		// #5. �����ÿ���(������ ��� ��) 5�� / 2125341020�ȱԿ�
		// ������ ��� 2
		////////////////////////////////////////////////////////////////////////
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // ��ǥ ������� import
		Calendar k20_cal = Calendar.getInstance(); // calendar�� ����ð� �ҷ��������� import
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ����ð� ��� ����
		Calendar k20_cal2 = Calendar.getInstance();
		k20_cal2.set(2021, 4, 7);
		SimpleDateFormat k20_sdt2 = new SimpleDateFormat("MM");
		SimpleDateFormat k20_sdt3 = new SimpleDateFormat("dd");
		// ������ ��ǰ�� �̸��� ����� Array
		String[] k20_name_Array = new String[] { "ǻ��� �����ܿ븶��ũ(�ְ����)", "�����̵�ĸ��� (�ְ�� ������)", "�������� ���׸�����ũ(�˷�̴�Ÿ��)" };
		// ������ ��ǰ�� code ��ȣ�� ����� Array
		for (int k20_i = 0; k20_i < k20_name_Array.length; k20_i++) {
			k20_name_Array[k20_i] = k20_cut(k20_name_Array[k20_i], 18);
		}
		String[] k20_code_Array = new String[] { "[1031615]", "[1008152]", "[1020800]" };
		// ������ ��ǰ�� ������ ����� Array
		int[] k20_price_Array = new int[] {1, 1000, 1000 };
		// ������ ��ǰ�� ������ ����� Array
		int[] k20_how_Many_Array = new int[] { 1, 1, 1 };
		int k20_iPrice = 0; // ��ǰ�� �Ѿ��� ����ϱ� ���� ���� ���� �� �ʱ�ȭ
		for (int k20_i = 0; k20_i < 3; k20_i++) { // for���� ��ǰ�� ������ŭ �ǽõǰ�
			k20_iPrice += k20_price_Array[k20_i]; // �� for������ �ݾ��� ������
		} // for���� ����Ǹ�, ��ǰ�� �Ѿ��� �����
		double k20_tax = 0.1; // ���� 10%
		int k20_real_iPrice = (int) (k20_iPrice / (k20_tax + 1)); // ������ �����ϴ� ���� ���� �� �ʱ�ȭ
		int k20_tax_iPrice = (int) Math.ceil(k20_iPrice * k20_tax / (k20_tax + 1)); // ������ �����ϴ� ����

		System.out.printf("\n\n            \"���ΰ���, ���̼�\"\n"); // �ؽ�Ʈ ���
		// �� ���� �� �Ѱ������ν� ���� ������!
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n"); // �ؽ�Ʈ ���
		System.out.printf("��ȭ:031-702-6016\n"); // �ؽ�Ʈ ���
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n"); // �ؽ�Ʈ ���
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n"); // �ؽ�Ʈ ���
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (������)\n"); // �ؽ�Ʈ ���
		System.out.printf("=========================================\n"); // �ٷ� ������ �� �ֵ���
		System.out.printf("       �Һ����߽ɰ濵(CCM) �������\n"); // �ؽ�Ʈ ���
		System.out.printf("     ISO 9001 ǰ���濵�ý��� �������\n"); // �ؽ�Ʈ ���
		System.out.printf("=========================================\n"); // �ٷ� ����
		System.out.printf("       ��ȯ/ȯ�� 14��(%s��%s��)�̳�,\n", k20_sdt2.format(k20_cal2.getTime()), k20_sdt3.format(k20_cal2.getTime())); // �ؽ�Ʈ ���
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n"); // �ؽ�Ʈ ���
		System.out.printf("    ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n"); // �ؽ�Ʈ ���
		System.out.printf("      üũī�� ��� �� �ִ� 7�� �ҿ�\n"); // �ؽ�Ʈ ���
		System.out.printf("=========================================\n"); // �ٷ� ������ �� �ֵ���
		System.out.printf("[POS 1058231]   %25s\n", k20_sdt.format(k20_cal.getTime())); // �ؽ�Ʈ ���
		// ���� �ð� �������. ��� ������ �Ʊ� ������ k20_sdt �̿�
		System.out.printf("=========================================\n"); // �ٷ� ����
		// �������� ������ ���� ����
		System.out.printf("%s%10s%3d%10s\n", k20_name_Array[0], k20_df.format(k20_price_Array[0]),
				k20_how_Many_Array[0], k20_df.format(k20_price_Array[0] * k20_how_Many_Array[0]));
		// ���� ��¹� Ȯ�ν�, ���� �ڸ������� ��� name�� ��� ��µ��� Ȯ�� ����
		// �̸�, �ݾ� ���
		System.out.printf("%s\n", k20_code_Array[0]); // 0��° �ڵ��ȣ ���
		System.out.printf("%s%10s%3d%10s\n", k20_name_Array[1], k20_df.format(k20_price_Array[1]),
				k20_how_Many_Array[1], k20_df.format(k20_price_Array[1] * k20_how_Many_Array[1]));
		// �����ϰ�, String�� ���̿� ������� ��� �����
		System.out.printf("%s\n", k20_code_Array[1]); // 1��° �ڵ��ȣ ���
		System.out.printf("%s%10s%3d%10s\n", k20_name_Array[2], k20_df.format(k20_price_Array[2]),
				k20_how_Many_Array[2], k20_df.format(k20_price_Array[2] * k20_how_Many_Array[2]));
		// �����ϰ�, String�� ���̿� ������� ��� �����
		System.out.printf("%s\n", k20_code_Array[2]); // 2��° �ڵ��ȣ ���
		System.out.printf("         �����հ�%24s\n", k20_df.format(k20_real_iPrice)); // �ؽ�Ʈ ���
		// �����հ� : ���� ���
		System.out.printf("           �ΰ���%24s\n", k20_df.format(k20_tax_iPrice)); // �ؽ�Ʈ ���
		// �ΰ��� : ���� ���
		System.out.printf("-----------------------------------------\n"); // �ٷ� ����
		System.out.printf("�Ǹ��հ�%33s\n", k20_df.format(k20_iPrice)); // �ؽ�Ʈ ���
		System.out.printf("=========================================\n"); // �ٷ� ����
		System.out.printf("�ſ�ī��%33s\n", k20_df.format(k20_iPrice)); // �ؽ�Ʈ ���
		System.out.printf("-----------------------------------------\n"); // �ٷ� ����
		System.out.printf("�츮ī��%33s\n", "538720************");// �ؽ�Ʈ ���
		System.out.printf("���ι�ȣ 77982843(0) %s  %10s\n", "���αݾ�", k20_df.format(k20_iPrice));
		// ���αݾ� ���
		System.out.printf("=========================================\n"); // �ٷ� ����
		System.out.printf("      %s �д缭����\n", k20_sdt.format(k20_cal.getTime()));
		// �ؽ�Ʈ ���, ����ð� ���
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n"); // �ؽ�Ʈ ���
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n"); // �ؽ�Ʈ ���
		System.out.printf("          1l1il1i1li1li1li1l1il1\n"); // �ؽ�Ʈ ���
		System.out.printf("             2112820610158231\n"); // �ؽ�Ʈ ���
		System.out.printf("-----------------------------------------\n"); // �ٷ� ����
		System.out.printf("�� ���̼� ����� �� �Ǵ� Ȩ�������� ����\n"); // �ؽ�Ʈ ���
		System.out.printf("   �ϼż� ȸ������ �� �پ��� ������ ����\n"); // �ؽ�Ʈ ���
		System.out.printf("   ������! ��\n"); // �ؽ�Ʈ ���
	}

	public static String k20_cut(String k20_str, int k20_len) {

		if (k20_str.getBytes().length <= k20_len) {
			int k20_blank = (k20_len) - k20_str.getBytes().length;
			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_str += " ";
			}
			return k20_str;
		} else {
			StringBuffer k20_sbStr = new StringBuffer(k20_len);
			int k20_cnt = 0;
			for (char k20_ch : k20_str.toCharArray()) {
				k20_cnt += String.valueOf(k20_ch).getBytes().length;
				if (k20_cnt > k20_len)
					break;
				k20_sbStr.append(k20_ch);
			}
			String k20_text = k20_sbStr.toString();
			int k20_blank = k20_len - k20_text.getBytes().length;

			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_text += " ";
			}
			return k20_text;
		}
	}
}
