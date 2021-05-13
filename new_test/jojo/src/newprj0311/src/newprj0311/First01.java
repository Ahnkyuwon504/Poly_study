package newprj0311;

import java.util.HashSet;
import java.util.Iterator;

public class First01 {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("Kim");
		name.add("Kim2");
		name.add("Kim3");
		System.out.println(name);
		Iterator it = name.iterator();           // when we want to get value of HashSet , gets next element by while
		while (it.hasNext()) {                   // Array : set size, but here not.
			System.out.println(it.next());
		}
	}
}
