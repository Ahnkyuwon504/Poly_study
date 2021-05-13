package prj9;

public class Animal {
	String name;
	
	public void setName(String name1) {
		this.name = name1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();
		cat.setName("Bobby");
		cat.name = "bob";
		System.out.println(cat.name);
		

	}

}
