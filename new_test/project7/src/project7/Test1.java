package project7;

public class Test1 {
	private String name;
	private int kor, eng, math;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public float getavr(int a, int b, int c, int d, int e) {
		return (a+b+c+d+e)/5;
	}
	

}
