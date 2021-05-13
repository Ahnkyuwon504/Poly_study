package prj2;

public class Test1 {
	private String name;
	private int age;
	private double offense;
	double defense;
	
	public Test1(String inputname) {
	}
	
	public Test1(int inputage, double inputoffense) {
	}
	
	public Test1(String inputname, int inputage, double inputoffense, double inputdefense) {
		this.name = inputname;
		this.age = inputage;
		this.offense = inputoffense;
		this.defense = inputdefense;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getOffense() {
		return offense;
	}
	public void setOffense(double offense) {
		this.offense = offense;
	}

	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public void printCharacter() {
		System.out.println(name + " / " +  age + " / " + offense + " / " + defense);
	}

}
