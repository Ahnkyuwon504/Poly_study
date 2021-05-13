package newprj0415;

public class Student_Info_Structure {
	// 빵틀
	private String name;
	private int id;
	private int birth;
	private String address;
	private double score;
	private char bloodType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) { /////////////////////////////////////////////// 자료구조의 의의....
		if (score < 0 || score > 5) {
			this.score = 4.5;
		} else {
			this.score = score;
		}
	}

	public char getBloodType() {
		return bloodType;
	}

	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	}

}
