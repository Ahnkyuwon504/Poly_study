package newprj0305;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "schoooool";
		int count = 0; // number of 'o'
		int sum = 0; // number of 'o' and 'h'
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == 'o') {
				count++;
			}
			if (temp.charAt(i) == 'o' || temp.charAt(i) == 'h') {
				sum++;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
