package newprj0305;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "38412+213213";
		String result = "";
		result = temp.substring(1);
		System.out.println(result);
		result = temp.substring(2,6);
		System.out.println(result);
		result = temp.substring(temp.indexOf("+"));
		result = result.substring(1);
		System.out.println(result);
	}

}
