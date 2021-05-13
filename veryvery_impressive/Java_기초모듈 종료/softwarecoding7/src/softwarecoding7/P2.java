///////////////////////////////////////////////////////////////////////
// ����Ʈ�����ڵ� 7�� : String, Byte, StringBuffer, Array, ArrayList
// 2. �������̿��� �ʵ� ����/ó��
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (��)
// ����SW A�� 2125341020 �ȱԿ�
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.text.DecimalFormat;

public class P2 {
	static String[] k20_oneRec = { // static String Array ����
			// ������ �̾Ҵ� ������ ��ϵ��̴�..
			"01 aaaaaaaa���� a��      3,000  1     3,000",
			"02 �ڹٴ��ְ����й�  1,000,000  1 9,999,999",
			"03 @#%@#%@%#@%#$       800,000  1   800,000",
			"04 �� ����              20,000  2    40,000",
			"05 ��aaa ���         10,000  5    50,000",
			"06 Ȩ������ �߱��忡     2,500  6    15,000",
			"07*���̽�Ŀ��            3,000  7    21,000",
			"08*����Ĩ                2,200  8    17,600",
			"09 ������ �ٵ�Ծ�       1,800  1     1,800",
			"10 ������ ����           3,800  5    19,000",
			"11 ������ Ȳ��           5,200 13    67,600",
			"12 ����                  1,800 14    25,200",
			"13 ���� �̴�������       4,000  5    20,000",
			"14*�ղ�Ʋ�̾ȿ�ŷ��          1  6    26,400",
			"15*�̴Ͻ��̴Ϲ̴�        3,800  3    11,400",
			"16 ¯ �ſ�              13,200  1    13,200",
			"17 �ʺ���                3,800  3    11,400",
			"18 ���̼Ҵ������ٱ�      2,700  5    13,500",
			"19 ī��                    200 10     2,000",
			"20 ��� ��԰���̼�       300  6     1,800",
			"21 ����� ���ڼ���       3,400  8    27,200",
			"22 ��� ����               180  8     1,440",
			"23 ��� ���̰������     8,800  6    52,800",
			"24 ������               11,000  5    55,000",
			"25 �ִϾ�縻              500  8     4,000",
			"26 ���̸�                4,802 10    48,020",
			"27 ���󿡸�                800 12     9,600",
			"28 ���ڸ� �������ֳ�       900 14    12,600",
			"29 ����� ���ּ����     1,300 60    78,000",
			"30*īī�������¥��        643 80    51,440",
			"31 �� ��                90,000  1    90,000",
	};
	
	static void print_WrongOperation() { // ��� Ʋ�� �׸� ����Ʈ�ϴ� �޼ҵ�
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // ��ǥ�� ������ ���� import

		String k20_old_one_Line; String k20_old_one_Line_part; // ���� �� ����, ���� �κ�
		String k20_new_one_Line; String k20_new_one_TotalPrice; // ���� �� ����, ���� �κ�
		String k20_string_One_Price; String k20_string_One_Amount; String k20_string_One_TotalPrice;
		// ���� �� ����, ����, ����(String)
		int k20_one_Price; int k20_one_Amount; int k20_one_TotalPrice;
		// ������ ����, ����, ����(integer)
		
		for (int k20_i = 0; k20_i < k20_oneRec.length; k20_i++) {
			// �������� ���� ������ŭ for�� �ǽ�
			k20_old_one_Line = k20_oneRec[k20_i]; // �� ��
			k20_string_One_TotalPrice = k20_old_one_Line.substring(k20_old_one_Line.length() - 10, k20_old_one_Line.length()); 
			k20_string_One_Amount = k20_old_one_Line.substring(k20_old_one_Line.length() - 13, k20_old_one_Line.length() - 10); 
			k20_string_One_Price = k20_old_one_Line.substring(k20_old_one_Line.length() - 23, k20_old_one_Line.length() - 13);
			// ����ǰ�� ����, ����, ���� 
			// ����� String����, �̰͵��� �������̶� substring���� �ڸ�����...
			k20_string_One_Price = k20_string_One_Price.replace(",", "");
			k20_string_One_Amount = k20_string_One_Amount.replace(",", "");
			k20_string_One_TotalPrice = k20_string_One_TotalPrice.replace(",", "");
			// ���� �۾�... �޸� ������ 
			k20_string_One_Price = k20_string_One_Price.trim();
			k20_string_One_Amount = k20_string_One_Amount.trim();
			k20_string_One_TotalPrice = k20_string_One_TotalPrice.trim();
			// ���� �۾�...�յ� ���� ������
			k20_one_Price = Integer.parseInt(k20_string_One_Price);
			k20_one_Amount = Integer.parseInt(k20_string_One_Amount);
			k20_one_TotalPrice = Integer.parseInt(k20_string_One_TotalPrice);
			// ���� �������� Integer�� �ٲ㼭 ���������
			if ((k20_one_Price * k20_one_Amount) != k20_one_TotalPrice) { // ��� Ʋ����
				k20_one_TotalPrice = k20_one_Price * k20_one_Amount; // �´� ���� �־��ְ�
				k20_old_one_Line_part = k20_old_one_Line.substring(0, k20_old_one_Line.length() - 10);
				k20_new_one_TotalPrice = k20_cut(k20_df.format(k20_one_Price * k20_one_Amount), 10);
				k20_new_one_Line = k20_old_one_Line_part.concat(k20_new_one_TotalPrice);
				// ���Ӱ� ������� �´� ������ String���� �ٲ㼭 
				// �޸� �ٿ��ְ� ���� �ڿ� �ٿ��ش�...
				System.out.printf("*************************************************\n");
				System.out.printf("����[%s]\n", k20_old_one_Line);
				System.out.printf("����[%s]\n", k20_new_one_Line);
				System.out.printf("*************************************************\n");
				// ���� ������ ������ �������� ���...
			}
		}
	}
	
	public static String k20_cut(String k20_str, int k20_len) {

		if (k20_str.getBytes().length <= k20_len) { // ���� �����ִ� �޼ҵ�...
			// ������ �� ����ϰ� ������ �� �����...
			int k20_blank = (k20_len) - k20_str.getBytes().length; // ��ũ ����...
			for (int k20_i = 0; k20_i < k20_blank; k20_i++) { 
				k20_str = " " + k20_str; // ��ũ �߰����ش�...
			}
			return k20_str;
		} else {
			StringBuffer k20_sbStr = new StringBuffer(k20_len);
			// StringBuffer ���..
			int k20_cnt = 0; // count 0���� �ʱ�ȭ...
			for (char k20_ch : k20_str.toCharArray()) {
				k20_cnt += String.valueOf(k20_ch).getBytes().length;
				// ����Ʈ ���� �����ְ�..��� ī��Ʈ �ö󰣴�....
				if (k20_cnt > k20_len)
					break;
				k20_sbStr.append(k20_ch);
				// �ٿ� �ش�...
			}
			String k20_text = k20_sbStr.toString();
			int k20_blank = k20_len - k20_text.getBytes().length;
			// ���� ����..

			for (int k20_i = 0; k20_i < k20_blank; k20_i++) {
				k20_text += " "; // �ٿ� �ش�...
			}
			return k20_text;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_WrongOperation();

	}

}
