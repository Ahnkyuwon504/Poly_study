package testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/ahnkyuwon",
				"root",
				"dksrbdnjs");
		Statement stmt = conn.createStatement();
		/*stmt.execute("INSERT INTO `report` ("
				+ "`date`, `ticket_type`, `age`, `amount`, `price`, `treat`) "
				+ "VALUES ('2021-04-21 01:33:32.000000', '주간권', '대인', '3', '168000', '우대사항 없음')");*/
		ResultSet rset = stmt.executeQuery("select * from report");
		System.out.println("권종   가격");
		
		while (rset.next()) {
			System.out.println(rset.getString(2) + " " + rset.getInt(5));
		}
		
		
		
		
		/*
		stmt.execute(	"create table examtable(" + 
						"name varchar(10)." + 
						"studentid int not null primary key." +
						"kor int" +
						"eng int" +
						"mat int" +
						"DEFAULT CHARSET = utf8");
		stmt.close();
		conn.close();
		*/
		

	}

}
