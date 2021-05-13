package newprj0406;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello,hi,";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));

		char[] c = text.toCharArray();
		System.out.println(c[0]);
		System.out.println(text.replace("H", "h"));

		String[] t = text.split(",");
		System.out.println(t[0]);
		System.out.println(t[1]);
		
		try {
			System.out.println(t[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error!");
			System.out.println("Reason : There is no element in t[2].");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
