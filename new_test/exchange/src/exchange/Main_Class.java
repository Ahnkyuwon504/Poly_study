package exchange;

import java.io.FileWriter;
import java.util.Calendar;

public class Main_Class {

	public static void main(String[] args) {
		Input_Class inputClass = new Input_Class();
		double won;
		int N;
		
		do { 	
			won = inputClass.inputFromConsoleWon();
			N = inputClass.inputFromConsoleType();

			switch (N) {													// N의 값에 따라 switch문 전개
			case ConstValue_Class.CHANGE_TYPE_USD:							// final static int 이기 때문에 ConstValueClass는 따로 객체생성하지않음.
				moneyFinal.changeToNation(won, ConstValueClass.USD_RATIO, 
						                  ConstValueClass.DOLLAR, N);			// 아까 생성한 moneyFinal 객체에서 changeToUSD메소드 실행(투입값은 int won) 
				break;
				
			case ConstValue_Class.CHANGE_TYPE_EUR:							//  위와 동일 
				moneyFinal.changeToNation(won, ConstValueClass.EUR_RATIO, 
						                  ConstValueClass.EURO, N);		    //  아까 생성한 moneyFinal 객체에서 changeToEUR메소드 실행(투입값은 int won)
				break;
				
			case ConstValue_Class.CHANGE_TYPE_JPY:							//  위와 동일
				moneyFinal.changeToNation(won, ConstValueClass.JPY_RATIO, 
						                  ConstValueClass.JPY, N);				//  아까 생성한 moneyFinal 객체에서 changeToUSD메소드 실행(투입값은 int won)
				break; 
			}
		} while (N != 0);	
	}
}
