package newprj0311;

import java.util.LinkedList;
import java.util.Queue;

public class First05Queue {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();      // first-in, first-out
		name.offer("Kim");
		System.out.println(name);   // input
		name.offer("lee");
		System.out.println(name);
		System.out.println(name.poll());  // output
		System.out.println(name.poll());
		System.out.println(name);
	}
}
