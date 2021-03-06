package amusement_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class Sell_Analysis_Class {
	private Connection con;
	private Statement statement;
	DecimalFormat df;

	
	public Sell_Analysis_Class() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/ahnkyuwon",
					"root",
					"dksrbdnjs");
			statement = con.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public ArrayList<ArrayList<String>> get_Data_FromDB() {
		ArrayList<ArrayList<String>> doubleArray_data = new ArrayList<ArrayList<String>>();
		try {
			ResultSet rset = statement.executeQuery("select * from report");
			
			while(rset.next()) {
				ArrayList<String> singleArray_data = new ArrayList<String>();
				singleArray_data.add(rset.getString(1));
				singleArray_data.add(rset.getString(2));
				singleArray_data.add(rset.getString(3));
				singleArray_data.add(rset.getString(4));
				singleArray_data.add(rset.getString(5));
				singleArray_data.add(rset.getString(6));
				doubleArray_data.add(singleArray_data);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return doubleArray_data;
	}
	
	public void getData() throws SQLException {
		df = new DecimalFormat ("###,###,###,###,###");
		
		try {
			ResultSet rset = statement.executeQuery("SELECT SUM(price) FROM report where date like '2021-04-21%'");
			
			
			while (rset.next()) {
				System.out.println("2021-04-21 매출 : " + df.format((double)rset.getInt(1)) + "원");
			}
			rset.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	public void getData_DayNight_Age() throws SQLException {
		String temp = String.format("구분 주간권 야간권\n");
		try {
			temp += "유아     ";
			ResultSet rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '주간권' AND age = '유아'");
			while (rset.next()) {
				temp += rset.getString(1) + "     ";
			}
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '야간권' AND age = '유아'");
			while (rset.next()) {
				temp += rset.getString(1) + "\n";
			}
			
			temp += "소인     ";
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '주간권' AND age = '소인'");
			while (rset.next()) {
				temp += rset.getString(1) + "     ";
			}
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '야간권' AND age = '소인'");
			while (rset.next()) {
				temp += rset.getString(1) + "\n";
			}
			
			temp += "청소년 ";
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '주간권' AND age = '청소년'");
			while (rset.next()) {
				temp += rset.getString(1) + "     ";
			}
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '야간권' AND age = '청소년'");
			while (rset.next()) {
				temp += rset.getString(1) + "\n";
			}
			
			temp += "대인    ";
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '주간권' AND age = '대인'");
			while (rset.next()) {
				temp += rset.getString(1) + "   ";
			}
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '야간권' AND age = '대인'");
			while (rset.next()) {
				temp += rset.getString(1) + "\n";
			}
			
			temp += "경로     ";
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '주간권' AND age = '경로'");
			while (rset.next()) {
				temp += rset.getString(1) + "    ";
			}
			rset = statement.executeQuery("SELECT SUM(amount) FROM report where ticket_type = '야간권' AND age = '경로'");
			while (rset.next()) {
				temp += rset.getString(1) + "\n";
			}
			
			System.out.println(temp);
			
			
		} catch (Exception e) {
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
