package project3;
import java.util.Scanner;

public class Main {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sumK = 0;
	        int sumE = 0;
	        int sumM = 0;
	        
	        for(int i=0; i<5; i++) {
	            Test1 student = new Test1();
	            System.out.println("이름: ");
	            student.setName(scanner.next());
	            System.out.println("국어점수: ");
	            student.setKor(scanner.nextInt());
	            System.out.println("영어점수: ");
	            student.setEng(scanner.nextInt());
	            System.out.println("수학점수: ");
	            student.setMath(scanner.nextInt());
	            sumK += student.getKor();
	            sumE += student.getEng();
	            sumM += student.getMath();
	        }
	        
	        System.out.println("Korean(Avg, Min, Max) : " + sumK);
	        System.out.println("English(Avg, Min, Max) : " + sumE);
	        System.out.println("Math(Avg, Min, Max) : " + sumM);
	        

	        
	    }

}
