
public class main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String a = "356";
		String b = "122";
		
		System.out.println(a + b);   // just strings
		
		int iA = Integer.parseInt(a);
		int iB = Integer.parseInt(b);  // converting strings into integers
		
		System.out.println(iA + iB);  // sum of integers
		
		String c = "122.133";
		String d = "41.87";
		
		System.out.println(c + d);
		
		float fC = Float.parseFloat(c);
		float fd = Float.parseFloat(d);
		
		System.out.println(fC + fd);
	}
}
