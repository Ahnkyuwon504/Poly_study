package first2;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Kopo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p1 = null, p2 = null, p3 = null, p4 = null, p5 = null;
		for (int i = 0; i < 5; i++) {
			String temp = sc.next();
			// Split the string
			switch(i) {
				case 0:
					p1 = new Person(temp, 0, 0, 0); // insert the values
					break;
				case 1:
					p2 = new Person(temp, 0, 0, 0); // insert the values
					break;
				case 2:
					p3 = new Person(temp, 0, 0, 0); // insert the values
					break;
				case 3:
					p4 = new Person(temp, 0, 0, 0); // insert the values
					break;
				case 4:
					p5 = new Person(temp, 0, 0, 0); // insert the values
					break;
				default:
					break;
			}
		}
		
		System.out.println(howManyEmpty(p1, p2, p3, p4, p5));
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p4.getName());
		System.out.println(p5.getName());
		
	}
	
	public static int howManyEmpty(Person p1, Person p2, Person p3, Person p4, Person p5) {
		int ret = 5;
		if (p1 != null) {
			ret--;
		}
		if (p2 != null) {
			ret--;
		}
		if (p3 != null) {
			ret--;
		}
		if (p4 != null) {
			ret--;
		}
		if (p5 != null) {
			ret--;
		}
		
		return ret;
	}
	
}
