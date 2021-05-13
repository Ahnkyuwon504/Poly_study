package newprj0305;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello,hi,3";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		
		char[] c = text.toCharArray();   /// array
		System.out.println(c[0]);    /// c[5] = 콤마   c[10] = 없음  c[8] 까지만
		
		System.out.println(text.replace("H", "h"));   // 공백으로 하면 없어져
		
		String[] t = text.split(",");
		System.out.println(t[0]);   // , 기준으로첫번째꺼
		System.out.println(t[1]);   // , 기준으로 두번째꺼
		System.out.println(t[2]);   // , 기준으로 세번째꺼
	}
}
