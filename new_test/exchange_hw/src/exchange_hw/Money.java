package exchange_hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Money {
	public static void main(String[] args) throws IOException {
		MoneyFinal moneyFinal = new MoneyFinal();    						// moneyFinal 객체 선언, constValue는 final static들의 class라서 선언 x
		InputClass inputClass = new InputClass();
		double won;
		int N;
		
		ConstValueClass.get_Balance(); // 저장된 balance 불러오기
		
		while(true) { 	// 입력을 무한정 받는다.
			won = inputClass.inputFromConsoleWon(); if (won == 0)  break;
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
		}
	}
}
