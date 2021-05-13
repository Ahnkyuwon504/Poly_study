package newprj0305;

public class Math02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		int cnt = 0;  // count
		while(true) {
			double tempo = Math.random() * 45;
			int tempo2 = (int) Math.round(tempo);
			if (cnt == 0) {
				a = tempo2;
				cnt++;
			} else if (cnt == 1) {
				if (a != tempo2 ) {
					b = tempo2;
					cnt++;
				}
			} else if (cnt == 2) {
				if ( a != tempo2 && b  != tempo2) {
					c = tempo2;
					cnt++;
				}
			} else {
				break;
			}
		}
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}
}
