package newprjParents;

public class Super extends Parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super old = new Super();
		old.parentName();

	}
	
	public void parentName() {
		super.parentName();
		System.out.println("Jack, Alice");
	}

}

