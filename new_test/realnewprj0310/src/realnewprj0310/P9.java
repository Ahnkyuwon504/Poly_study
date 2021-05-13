package realnewprj0310;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course course = new Course();     // °´Ã¼»ý¼º
		
		
		course.printMenu();
		int choice = sc.nextInt();
		if (choice==1) {
			course.printSubject();
		}
		
		boolean[] score = new boolean[6];
		int M = sc.nextInt();
		int N = 0;
		if (M != 0) {
			N = M-1;
		} else { 
			N = 5;
		}
		score[N] = true;    // 0: Kor, 1: Eng, 2: Math, 3: Science, 4: ip, 5: Baco to Main
		
		int n = 0;
		for (int i=0; i<6; i++) {
			if (score[i] == true) {
				n=i;
			}
		}
		course.printSubject(n);
	}
}




class Course {
	public void printMenu() {
		System.out.println("Menu\n1. Course List\n2. My Course");
	}
	
	public void printSubject() {
		System.out.println("1.Kor\n2.Eng\n3.Math\n4.Science\n5.ip\n0.Back to Main.");
	}
	
	public void printSubject(int n) {
		switch (n) {
		    case 0 : System.out.println("Kor is registered.");
		             break;
		    case 1 : System.out.println("Eng is registered.");
                     break;
		    case 2 : System.out.println("Math is registered.");
                     break;
		    case 3 : System.out.println("Science is registered.");
                     break;
		    case 4 : System.out.println("ip is registered.");
                     break;
		    case 5 : System.out.println("Back to Main.");
                     break;
		}
	}
}
