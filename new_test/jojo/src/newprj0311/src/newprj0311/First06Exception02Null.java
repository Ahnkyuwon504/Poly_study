package newprj0311;

public class First06Exception02Null {
	

	public static void main(String[] args) {
		String temp = null;
		
		try {
			System.out.println(temp.length());
		} catch (NullPointerException e) {
			System.out.println("This is null");
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
