package newprj0305;
import java.util.Scanner;

public class P2of2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";  // input defined
		String output = "";  // output defined
		int tmp;            // tmp ������ defined, tmp�� �� ���ĺ� 1���� ���ڰ� ��
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();  // ������� input�� ���ڿ�
		
		for(int i = 0; i < input.length(); i++) {  // �Էµ� ���ڿ��� 
			tmp = (int)input.charAt(i);  // input ���ڿ� �� i��°�� �ش��ϴ� ���ĺ��� ���ڷ�
			
			if ( (tmp >= 65) && (tmp <= 90)) {
				output += (char)(tmp + 32);
			} else if ( (tmp >= 97) && (tmp <= 122) ) {
				output += (char)(tmp - 32);
			} else {
				output += " ";
			}
		}
		System.out.print(output);

	}
}
