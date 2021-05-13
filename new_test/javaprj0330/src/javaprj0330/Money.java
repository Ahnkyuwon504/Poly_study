package javaprj0330;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Money {
	public static void main(String[] args) throws IOException {
		MoneyFinal moneyFinal = new MoneyFinal();    						// moneyFinal ��ü ����, constValue�� final static���� class�� ���� x
		InputClass inputClass = new InputClass();
		double won;
		int N;
		
		//do { 	// �Է��� ������ �޴´�.
			won = inputClass.inputFromConsoleWon();
			N = inputClass.inputFromConsoleType();

			switch (N) {													// N�� ���� ���� switch�� ����
			case ConstValueClass.CHANGE_TYPE_USD:							// final static int �̱� ������ ConstValueClass�� ���� ��ü������������.
				moneyFinal.changeToNation(won, ConstValueClass.USD_RATIO, 
						                  ConstValueClass.DOLLAR, N);			// �Ʊ� ������ moneyFinal ��ü���� changeToUSD�޼ҵ� ����(���԰��� int won) 
				break;
				
			case ConstValueClass.CHANGE_TYPE_EUR:							//  ���� ���� 
				moneyFinal.changeToNation(won, ConstValueClass.EUR_RATIO, 
						                  ConstValueClass.EURO, N);		    //  �Ʊ� ������ moneyFinal ��ü���� changeToEUR�޼ҵ� ����(���԰��� int won)
				
				break;
				
			case ConstValueClass.CHANGE_TYPE_JPY:							//  ���� ����
				moneyFinal.changeToNation(won, ConstValueClass.JPY_RATIO, 
						                  ConstValueClass.JPY, N);				//  �Ʊ� ������ moneyFinal ��ü���� changeToUSD�޼ҵ� ����(���԰��� int won)
				break; 
			}
		//}while (N != 0);													// won�� 0�� �Է½� �ݺ�����
		
	}
}

	
	
/*
	public void getEUR(double won) {
		int realeur, realretwon;
		double eur, reteur, retwon;											// double������ eur
		
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
						   + realretwon + "��");
		mon.wonValue(realretwon);
	}

	public void getJPY(double won) {
		int realjpy, realretwon, realjpy1;
		double jpy, retjpy, retwon; // double������ jpy
		
		jpy = won / JPY_RATIO;
		realjpy = (int)jpy; // jpy to integer
		realjpy1 = (realjpy/1000)*1000;
		
		retjpy = jpy - realjpy1; // below 1000 jpy
		retwon = retjpy * JPY_RATIO; // below 1 jpy => won
		retwon = retwon / 10; // remove 1st index number of won
		realretwon = (int) retwon * 10; // won to integer

		System.out.println("\nReturn Jpy : " + realjpy1 + " yen");
		mon.jpyValue(realjpy1);
		System.out.println("\nReturn won : " + realretwon + "��");
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

		System.out.print("500 euro : " + num500 + "�� //  ");
		System.out.print("200 euro : " + num200 + "�� //  ");
		System.out.println("100 euro : " + num100 + "��");
		System.out.print("50 euro : " + num50 + "�� //  ");
		System.out.print("20 euro : " + num20 + "�� //  ");
		System.out.print("10 euro : " + num10 + "�� //  ");
		System.out.println("5 euro : " + num5 + "��");
	}

	public void jpyValue(int jpy) {
		int num10000, num5000;
		int num2000, num1000;
		
		num10000 = jpy / 10000;
		num5000 = (jpy % 10000) / 5000;
		num2000 = ((jpy % 10000) % 5000) / 2000;
		num1000 = (((jpy % 10000) % 5000) % 2000) / 1000;

		System.out.print("10000 jpy : " + num10000 + "�� //  ");
		System.out.print("5000 jpy : " + num5000 + "�� //  ");
		System.out.println("2000 jpy : " + num2000 + "��");
		System.out.print("1000 jpy : " + num1000 + "�� //  ");
	}
*/
	
	

