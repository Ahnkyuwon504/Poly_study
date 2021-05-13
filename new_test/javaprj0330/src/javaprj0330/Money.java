package javaprj0330;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Money {
	public static void main(String[] args) throws IOException {
		MoneyFinal moneyFinal = new MoneyFinal();    						// moneyFinal 객체 선언, constValue는 final static들의 class라서 선언 x
		InputClass inputClass = new InputClass();
		double won;
		int N;
		
		//do { 	// 입력을 무한정 받는다.
			won = inputClass.inputFromConsoleWon();
			N = inputClass.inputFromConsoleType();

			switch (N) {													// N의 값에 따라 switch문 전개
			case ConstValueClass.CHANGE_TYPE_USD:							// final static int 이기 때문에 ConstValueClass는 따로 객체생성하지않음.
				moneyFinal.changeToNation(won, ConstValueClass.USD_RATIO, 
						                  ConstValueClass.DOLLAR, N);			// 아까 생성한 moneyFinal 객체에서 changeToUSD메소드 실행(투입값은 int won) 
				break;
				
			case ConstValueClass.CHANGE_TYPE_EUR:							//  위와 동일 
				moneyFinal.changeToNation(won, ConstValueClass.EUR_RATIO, 
						                  ConstValueClass.EURO, N);		    //  아까 생성한 moneyFinal 객체에서 changeToEUR메소드 실행(투입값은 int won)
				
				break;
				
			case ConstValueClass.CHANGE_TYPE_JPY:							//  위와 동일
				moneyFinal.changeToNation(won, ConstValueClass.JPY_RATIO, 
						                  ConstValueClass.JPY, N);				//  아까 생성한 moneyFinal 객체에서 changeToUSD메소드 실행(투입값은 int won)
				break; 
			}
		//}while (N != 0);													// won에 0을 입력시 반복중지
		
	}
}

	
	
/*
	public void getEUR(double won) {
		int realeur, realretwon;
		double eur, reteur, retwon;											// double형태의 eur
		
		eur = won / EUR_RATIO;
		realeur = (int) eur; 											// eur to integer
		reteur = eur - realeur; 
		
		retwon = reteur * EUR_RATIO;									 // below 1 eur => won
		retwon = retwon / 10;												 // remove 1st index number of won
		realretwon = (int) retwon * 10;											 // won to integer

		System.out.println("\nReturn Euro : " 
						   + realeur + " euro");
		mon.euroValue(realeur);
		System.out.println("\nReturn won : " 
						   + realretwon + "원");
		mon.wonValue(realretwon);
	}

	public void getJPY(double won) {
		int realjpy, realretwon, realjpy1;
		double jpy, retjpy, retwon; // double형태의 jpy
		
		jpy = won / JPY_RATIO;
		realjpy = (int)jpy; // jpy to integer
		realjpy1 = (realjpy/1000)*1000;
		
		retjpy = jpy - realjpy1; // below 1000 jpy
		retwon = retjpy * JPY_RATIO; // below 1 jpy => won
		retwon = retwon / 10; // remove 1st index number of won
		realretwon = (int) retwon * 10; // won to integer

		System.out.println("\nReturn Jpy : " + realjpy1 + " yen");
		mon.jpyValue(realjpy1);
		System.out.println("\nReturn won : " + realretwon + "원");
		mon.wonValue(realretwon);

	}
*/
	
/*
	public void euroValue(int euro) {
		int num500, num200, num100;
		int num50, num20, num10, num5;
		
		num500 = euro / 500;
		num200 = (euro % 500) / 200;
		num100 = ((euro % 500) % 200) / 100;
		num50 = (((euro % 500) % 200) % 100) / 50;
		num20 = ((((euro % 500) % 200) % 100) % 50) / 20;
		num10 = (((((euro % 500) % 200) % 100) % 50) % 20) / 10;
		num5 = ((((((euro % 500) % 200) % 100) % 50) % 20) % 10) / 5;

		System.out.print("500 euro : " + num500 + "개 //  ");
		System.out.print("200 euro : " + num200 + "개 //  ");
		System.out.println("100 euro : " + num100 + "개");
		System.out.print("50 euro : " + num50 + "개 //  ");
		System.out.print("20 euro : " + num20 + "개 //  ");
		System.out.print("10 euro : " + num10 + "개 //  ");
		System.out.println("5 euro : " + num5 + "개");
	}

	public void jpyValue(int jpy) {
		int num10000, num5000;
		int num2000, num1000;
		
		num10000 = jpy / 10000;
		num5000 = (jpy % 10000) / 5000;
		num2000 = ((jpy % 10000) % 5000) / 2000;
		num1000 = (((jpy % 10000) % 5000) % 2000) / 1000;

		System.out.print("10000 jpy : " + num10000 + "개 //  ");
		System.out.print("5000 jpy : " + num5000 + "개 //  ");
		System.out.println("2000 jpy : " + num2000 + "개");
		System.out.print("1000 jpy : " + num1000 + "개 //  ");
	}
*/
	
	

