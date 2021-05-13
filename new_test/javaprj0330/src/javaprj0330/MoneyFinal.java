package javaprj0330;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MoneyFinal {
	public OutputClass outputclass = null; // define constructor <<- OutputClass

	public MoneyFinal() throws IOException { // define constructor#2
		outputclass = new OutputClass();
	}

	public boolean checkBalance(double won, int N) {
		boolean temp = true;
		switch (N) {
		case 1:
			if (won <= ConstValueClass.BALANCE_USD) {
				temp = true;
			} else {
				temp = false;
			}
			break;
		case 2:
			if (won <= ConstValueClass.BALANCE_EUR) {
				temp = true;
			} else {
				temp = false;
			}
			break;
		case 3:
			if (won <= ConstValueClass.BALANCE_JPY) {
				temp = true;
			} else {
				temp = false;
			}
			break;
		}
		return temp;
	}

	public void updateBalance(int N, int money) {
		switch (N) {
		case 1:
			 ConstValueClass.BALANCE_USD = ConstValueClass.BALANCE_USD - money;
			 break;
		case 2:
			 ConstValueClass.BALANCE_EUR = ConstValueClass.BALANCE_EUR - money;
			 break;
		case 3:
			 ConstValueClass.BALANCE_JPY = ConstValueClass.BALANCE_JPY - money;
			 break;
		}
	}
	
	public double getNationBalance(int N) {
		double bal = 0;
		switch (N) {
		case 1:
			 bal = ConstValueClass.BALANCE_USD;
			 break;
		case 2:
			 bal = ConstValueClass.BALANCE_EUR;
			 break;
		case 3:
			 bal = ConstValueClass.BALANCE_JPY;
			 break;
		}
		return bal;
	}

	public void changeToNation(double won, double ratio, int[] array, int N) throws IOException {
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); // 현재시간 출력 포맷
		Calendar cal = Calendar.getInstance(); // Calendar import하여 현재시간 출력
		FileWriter fw = new FileWriter ("C:\\Users\\안규원\\Desktop\\money4.txt");

		String temp = "";
		double returnDirty, returnWon;
		int returnClean, returnMoreClean, returnWonClean;
		int magicNumber = array[array.length - 1];

		returnDirty = won / ratio;
		returnClean = (int) returnDirty;
		returnMoreClean = (returnClean / magicNumber) * magicNumber;

		returnWon = returnDirty - returnMoreClean;
		returnWon = returnWon * ratio;
		returnWon = returnWon / 10; // cut below 2nd index
		returnWonClean = (int) returnWon * 10;
		
		//outputclass.showBalance(N);
		temp += sdt.format(cal.getTime()) + "\n";
		fw.write(temp);

		temp += outputclass.showBalance(N) + "\n";
		fw.write(temp);

		if (checkBalance(returnClean, N) == true) {
			//outputclass.printMoney(returnMoreClean, array);
			//outputclass.printMoney(returnWonClean, ConstValueClass.WON);
			temp += outputclass.printMoney(returnMoreClean, array) + "\n";
			fw.write(temp);

			temp += outputclass.printMoney(returnWonClean, ConstValueClass.WON) + "\n";
			fw.write(temp);

			updateBalance(N, returnMoreClean);
			//outputclass.showBalance(N);
			temp += outputclass.showBalance(N) + "\n";
			fw.write(temp);

		} else {
			//outputclass.printMoney((int)getNationBalance(N), array);
			//outputclass.printMoney(((int)won - ((int)ratio * (int)getNationBalance(N))), array);
			temp += outputclass.printMoney((int)getNationBalance(N), array) + "\n";
			fw.write(temp);

			temp += outputclass.printMoney((int)won - ((int)ratio * (int)getNationBalance(N)), ConstValueClass.WON) + "\n";
			fw.write(temp);

			updateBalance(N, (int)getNationBalance(N));
			//outputclass.showBalance(N);
			temp += outputclass.showBalance(N) + "\n";
			fw.write(temp);

		}
		System.out.println(temp);
	}
}

/*
 * public void changeToUSD(double won) { // won을 입력받아 USD에 대한 내용을 출력하는 메소드 int
 * realdol, realretwon; // 사용할 int 미리 선언 double dol, retdol, retwon; // 사용할
 * double 미리 선언
 * 
 * dol = won / ConstValueClass.USD_RATIO; // won을 입력받고, final static인 USD_RATIO
 * 환율로 나눠서 달러값 출력 realdol = (int) dol; // dollar to integer retdol = dol -
 * realdol; // below 1 dollar 출력
 * 
 * retwon = retdol * ConstValueClass.USD_RATIO; // below 1 dollar => won retwon
 * = retwon / 10; // remove 1st index number of won realretwon = (int) retwon *
 * 10; // won to integer
 * 
 * outputclass.printMoney(realdol, ConstValueClass.DOLLAR); // notice that how
 * many bills are returned outputclass.printMoney(realretwon,
 * ConstValueClass.WON); // notice that how many bills are returned
 * 
 * }
 * 
 * public void changeToEUR(double won) { // same as above int realeur,
 * realretwon; double eur, reteur, retwon;
 * 
 * eur = won / ConstValueClass.EUR_RATIO; realeur = (int) eur; reteur = eur -
 * realeur;
 * 
 * retwon = reteur * ConstValueClass.EUR_RATIO; retwon = retwon / 10; realretwon
 * = (int) retwon * 10;
 * 
 * outputclass.printMoney(realeur, ConstValueClass.EURO);
 * outputclass.printMoney(realretwon, ConstValueClass.WON); }
 * 
 * public void changeToJPY(double won) { // same as above int realjpy,
 * realretwon, realjpy1; double jpy, retjpy, retwon;
 * 
 * jpy = won / ConstValueClass.JPY_RATIO; realjpy = (int) jpy; realjpy1 =
 * (realjpy / 1000) * 1000;
 * 
 * retjpy = jpy - realjpy1; retwon = retjpy * ConstValueClass.JPY_RATIO; retwon
 * = retwon / 10; realretwon = (int) retwon * 10;
 * 
 * outputclass.printMoney(realjpy1, ConstValueClass.JPY);
 * outputclass.printMoney(realretwon, ConstValueClass.WON);
 * 
 * }
 */
