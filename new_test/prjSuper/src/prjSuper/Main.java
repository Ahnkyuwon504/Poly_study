package prjSuper;

public class Main extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.parentName();
	}
	
	public void parentName() {
		super.parentName();
		System.out.println("Jack, Alice");
	}
}
