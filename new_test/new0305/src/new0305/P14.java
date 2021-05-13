package new0305;

public class TEST02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n-i-1; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}	
			System.out.print("\n");
		}
	}

}
