package newprj0311;
import java.util.ArrayList;
import java.util.Collections;

public class First02ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> name = new ArrayList<Integer>();
		name.add(8);
		name.add(1750);
		name.add(211);
		
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		name.remove(1);
		System.out.println(name);
		
		name.set(1, 81);
		System.out.println(name);
		System.out.println(name.size());
		
		name.add(97);
		System.out.println(name);
		
		Collections.sort(name);      // ascending
		System.out.println(name);
		
		Collections.reverse(name);   // descending
		System.out.println(name);
	}
}
