package realnewprj0310;
import java.util.Scanner;

public class P9Menu {
	public int printMainMenu() {
		int ret = 0;
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		Scanner sc = new Scanner(System.in);
		ret = sc.nextInt();
		return ret;
	}
	
	public void printCourse() {
		boolean[] subject = new boolean[3];
		int ret = 0;
		System.out.println("# Course List");
		System.out.println("1. Korea");
		System.out.println("1. Korea");
		System.out.println("1. Korea");
		Scanner sc = new Scanner(System.in);
		ret = sc.nextInt();
		subject[ret-1] = true;
		printResult(ret);
	}
	
	public void printResult(int num) {
		System.out.println("subject " + num + " is registered!");
	}

}
