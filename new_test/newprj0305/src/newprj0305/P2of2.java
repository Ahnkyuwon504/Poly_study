package newprj0305;
import java.util.Scanner;

public class P2of2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";  // input defined
		String output = "";  // output defined
		int tmp;            // tmp 숫자통 defined, tmp는 곧 알파벳 1개의 숫자가 됨
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();  // 현재까지 input은 문자열
		
		for(int i = 0; i < input.length(); i++) {  // 입력된 문자열의 
			tmp = (int)input.charAt(i);  // input 문자열 중 i번째에 해당하는 알파벳을 숫자로
			
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
