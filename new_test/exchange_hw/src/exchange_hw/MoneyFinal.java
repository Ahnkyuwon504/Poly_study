package exchange_hw;

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
	
	public String getNation (int N) {
		String nation = "";
		switch (N) {
		case 1 :
			nation = "Dollaar";
			break;
		case 2 :
			nation = "Euro";
			break;
		case 3 : 
			nation = "Jpy";
			break;
		}
			return nation;
	}

	public void changeToNation(double won, double ratio, int[] array, int N) throws IOException {
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); // 현재시간 출력 포맷
		Calendar cal = Calendar.getInstance(); // Calendar import하여 현재시간 출력
		FileWriter fw = new FileWriter ("C:\\Users\\안규원\\Desktop\\Money.csv", true);
		Write_Class writeclass = new Write_Class();

		String print_Console = "";
		String write_Data = "";
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
		
		print_Console += "------------------------------------\n" + sdt.format(cal.getTime()) + "\n\n";
		write_Data += sdt.format(cal.getTime()) + "," + won + "," + getNation(N) + ",";
		print_Console += "Our Dollar : " + ConstValueClass.BALANCE_USD + "\n"
				+ "Our Euro : " + ConstValueClass.BALANCE_EUR + "\n"
				+ "Our Jpy : " + ConstValueClass.BALANCE_JPY + "\n\n";

		if (checkBalance(returnClean, N) == true) {
			print_Console += outputclass.printMoney(returnMoreClean, array) + "\n\n";
			print_Console += outputclass.printMoney(returnWonClean, ConstValueClass.WON) + "\n\n";
			write_Data += outputclass.printMoney(returnMoreClean, array) + ",";
			write_Data += outputclass.printMoney(returnWonClean, ConstValueClass.WON) + ",";
			updateBalance(N, returnMoreClean);
			print_Console += "Our Dollar : " + ConstValueClass.BALANCE_USD + "\n"
					+ "Our Euro : " + ConstValueClass.BALANCE_EUR + "\n"
					+ "Our Jpy : " + ConstValueClass.BALANCE_JPY + "\n";
			write_Data += "***Balance***," + ConstValueClass.BALANCE_USD + ","
					+ ConstValueClass.BALANCE_EUR + ","
					+ ConstValueClass.BALANCE_JPY + "\n";

		} else {
			print_Console += "I'm Sorry. Our balance is not enough.\n";
			print_Console += outputclass.printMoney((int)getNationBalance(N), array) + "\n\n";
			print_Console += outputclass.printMoney((int)won - ((int)ratio * (int)getNationBalance(N)), ConstValueClass.WON) + "\n\n";
			write_Data += outputclass.printMoney((int)getNationBalance(N), array) + ",";
			write_Data += outputclass.printMoney((int)won - ((int)ratio * (int)getNationBalance(N)), ConstValueClass.WON) + ",";
			updateBalance(N, (int)getNationBalance(N));
			print_Console += "Our Dollar : " + ConstValueClass.BALANCE_USD + "\n"
					+ "Our Euro : " + ConstValueClass.BALANCE_EUR + "\n"
					+ "Our Jpy : " + ConstValueClass.BALANCE_JPY + "\n";
			write_Data += "***Balance***," + ConstValueClass.BALANCE_USD + ","
					+ ConstValueClass.BALANCE_EUR + ","
					+ ConstValueClass.BALANCE_JPY + "\n";
			
		}
		writeclass.write(write_Data);
		print_Console += "------------------------------------\n";
		System.out.println(print_Console);
	}
	/*
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
	
	public String getNation (int N) {
		String nation = "";
		switch (N) {
		case 1 :
			nation = "Dollar";
			break;
		case 2 :
			nation = "Euro";
			break;
		case 3 : 
			nation = "Jpy";
			break;
		}
			return nation;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
		/*
		print_Console += "Our Dollar : " + ConstValueClass.BALANCE_USD + "\n"
				+ "Our Euro : " + ConstValueClass.BALANCE_EUR + "\n"
				+ "Our Jpy : " + ConstValueClass.BALANCE_JPY + "\n\n";

		if (checkBalance(returnClean, N) == true) {
			print_Console += outputclass.printMoney(returnMoreClean, array) + "\n\n";
			print_Console += outputclass.printMoney(returnWonClean, ConstValueClass.WON) + "\n\n";
			write_Data += outputclass.printMoney(returnMoreClean, array) + ",";
			write_Data += outputclass.printMoney(returnWonClean, ConstValueClass.WON) + ",";
			updateBalance(N, returnMoreClean);
			print_Console += "Our Dollar : " + ConstValueClass.BALANCE_USD + "\n"
					+ "Our Euro : " + ConstValueClass.BALANCE_EUR + "\n"
					+ "Our Jpy : " + ConstValueClass.BALANCE_JPY + "\n";
			write_Data += "***Balance***," + ConstValueClass.BALANCE_USD + ","
					+ ConstValueClass.BALANCE_EUR + ","
					+ ConstValueClass.BALANCE_JPY + "\n";

		} else {
			print_Console += "I'm Sorry. Our balance is not enough.\n";
			print_Console += outputclass.printMoney((int)getNationBalance(N), array) + "\n\n";
			print_Console += outputclass.printMoney((int)won - ((int)ratio * (int)getNationBalance(N)), ConstValueClass.WON) + "\n\n";
			write_Data += outputclass.printMoney((int)getNationBalance(N), array) + ",";
			write_Data += outputclass.printMoney((int)won - ((int)ratio * (int)getNationBalance(N)), ConstValueClass.WON) + ",";
			updateBalance(N, (int)getNationBalance(N));
			print_Console += "Our Dollar : " + ConstValueClass.BALANCE_USD + "\n"
					+ "Our Euro : " + ConstValueClass.BALANCE_EUR + "\n"
					+ "Our Jpy : " + ConstValueClass.BALANCE_JPY + "\n";
			write_Data += "***Balance***," + ConstValueClass.BALANCE_USD + ","
					+ ConstValueClass.BALANCE_EUR + ","
					+ ConstValueClass.BALANCE_JPY + "\n";
			
		}
		fw.write(write_Data);
		fw.close();
		print_Console += "------------------------------------\n";
		System.out.println(print_Console);
	}
	*/

}
