package realnewprj0310;

public class P9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P9Menu menu = new P9Menu();
		while(true) {
			int m = menu.printMainMenu();
			if (m ==1) {
				menu.printCourse();
			} else if (m == 2) {
				menu.printCourse();
			}
		}

	}

}
