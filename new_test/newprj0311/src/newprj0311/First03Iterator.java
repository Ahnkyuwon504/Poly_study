package newprj0311;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First03Iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------------");
		
		for (String names : list) {
			System.out.println(names);
		}
		System.out.println("-----------------");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
