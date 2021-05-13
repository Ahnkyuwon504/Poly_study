import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name and scores, 5 times.");
		Person p1 = null, p2 = null, p3 = null, p4 = null, p5 = null;
		
		for (int i=0; i<5; i++) {
			String nameScore = sc.nextLine();
			String split[] = nameScore.split(",");
			
			switch (i) {
			    case 0 :
			    	p1 = new Person(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			    	break;
			    case 1 :
			    	p2 = new Person(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			    	break;
			    case 2 :
			    	p3 = new Person(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			    	break;
			    case 3 :
			    	p4 = new Person(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			    	break;
			    case 4 :
			    	p5 = new Person(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			    	break;
			    default :
			    	break;
			}
		}
		float KorAvg = (p1.getKor() + p2.getKor() + p3.getKor() + p4.getKor() + p5.getKor()) / (float)5;
		float EngAvg = (p1.getEng() + p2.getEng() + p3.getEng() + p4.getEng() + p5.getEng()) / (float)5;
		float MathAvg = (p1.getMath() + p2.getMath() + p3.getMath() + p4.getMath() + p5.getMath()) / (float)5;
		
		int Max = p1.getKor();
		if (Max >= p2.getKor()) {
		} else {
			Max = p2.getKor();
		}
		if (Max >= p3.getKor()) {
		} else {
			Max = p3.getKor();
		}
		if (Max >= p4.getKor()) {
		} else {
			Max = p4.getKor();
		}
		if (Max >= p5.getKor()) {
		} else {
			Max = p5.getKor();
		}
		
		
		
		int Min = p1.getKor();
		if (Min <= p2.getKor()) {
		} else {
			Min = p2.getKor();
		}
		if (Min <= p3.getKor()) {
		} else {
			Min = p3.getKor();
		}
		if (Min <= p4.getKor()) {
		} else {
			Min = p4.getKor();
		}
		if (Min <= p5.getKor()) {
		} else {
			Min = p5.getKor();
		}
		
		
		
		int Max1 = p1.getEng();
		if (Max1 >= p2.getEng()) {
		} else {
			Max1 = p2.getEng();
		}
		if (Max1 >= p3.getEng()) {
		} else {
			Max1 = p3.getEng();
		}
		if (Max1 >= p4.getEng()) {
		} else {
			Max1 = p4.getEng();
		}
		if (Max1 >= p5.getEng()) {
		} else {
			Max1 = p5.getEng();
		}
		
		
		int Min1 = p1.getEng();
		if (Min1 <= p2.getEng()) {
		} else {
			Min1 = p2.getEng();
		}
		if (Min1 <= p3.getEng()) {
		} else {
			Min1 = p3.getEng();
		}
		if (Min1 <= p4.getEng()) {
		} else {
			Min1 = p4.getEng();
		}
		if (Min1 <= p5.getEng()) {
		} else {
			Min1 = p5.getEng();
		}
		
		
		
		int Max2 = p1.getMath();
		if (Max2 >= p2.getMath()) {
		} else {
			Max2 = p2.getMath();
		}
		if (Max2 >= p3.getMath()) {
		} else {
			Max2 = p3.getMath();
		}
		if (Max2 >= p4.getMath()) {
		} else {
			Max2 = p4.getMath();
		}
		if (Max2 >= p5.getMath()) {
		} else {
			Max2 = p5.getMath();
		}
	
		int Min2 = p1.getMath();
		if (Min2 <= p2.getMath()) {
		} else {
			Min2 = p2.getMath();
		}
		if (Min2 <= p3.getMath()) {
		} else {
			Min2 = p3.getMath();
		}
		if (Min2 <= p4.getMath()) {
		} else {
			Min2 = p4.getMath();
		}
		if (Min2 <= p5.getMath()) {
		} else {
			Min2 = p5.getMath();
		}
		
		
		System.out.println("Number of Students : " + howManyEmpty(p1, p2, p3, p4, p5));
		System.out.println("Kor(Avg, Max, Min) : " + KorAvg  + ", " + Max + ", " + Min);		
        System.out.println("Eng(Avg, Max, Min) : " + EngAvg  + ", " + Max1 + ", " + Min1);		
        System.out.println("Math(Avg, Max, Min) : " + MathAvg  + ", " + Max2 + ", " + Min2);	
        System.out.println(p1.getName() + ", " + p1.getKor() + ", " + p1.getEng() + ", " + p1.getMath());
        System.out.println(p2.getName() + ", " + p2.getKor() + ", " + p2.getEng() + ", " + p2.getMath());
        System.out.println(p3.getName() + ", " + p3.getKor() + ", " + p3.getEng() + ", " + p3.getMath());
        System.out.println(p4.getName() + ", " + p4.getKor() + ", " + p4.getEng() + ", " + p4.getMath());
        System.out.println(p5.getName() + ", " + p5.getKor() + ", " + p5.getEng() + ", " + p5.getMath());
	}


	public static int howManyEmpty(Person p1, Person p2, Person p3, Person p4, Person p5) {
		int ret = 0;
		if (p1 != null) {
			ret++;
		}
		if (p2 != null) {
			ret++;
		}
		if (p3 != null) {
			ret++;
		}
		if (p4 != null) {
			ret++;
		}
		if (p5 != null) {
			ret++;
		}
		return ret;
	}
	

}
