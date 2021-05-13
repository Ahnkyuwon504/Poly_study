package newprj0311;
import java.util.Stack;

public class First04Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		System.out.println(stack.pop());
	}
}
