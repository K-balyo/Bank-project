package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTEST {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/appp?"
				+ "characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate 
					("SELECT user_id FROM USERS");
			         
			String msg = result > -1 ? "successful" : "fail";
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("�����ͺ��̽� ���� ����");
		}finally {
			try {
				if(stmt != null) conn.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				
			}
		}
	}

}













//("CREATE TABLE BWTEST("  
//	+	" IDX INT, "  
//	+	" BIRTH DATE, "  
//	+	" NAME VARCHAR(10))");
//("create table MEMBER("
//		+ "NUM VARCHAR(6), "
//		+ "NAME VARCHAR(10) NOT NULL, "
//		+ "ID VARCHAR(10) PRIMARY KEY, "
//		+ "PW VARCHAR(10) NOT NULL, "
//		+ "BALANCE INT)"); 
// ("CREATE TABLE GBTEST( "
//		+ " IDX int, "
//		+ " TYPE int, "
//		+ " NAME VARCHAR(10))");
//("CREATE TABLE LSTEST("
 //       + "PHONE VARCHAR(15),"
  //      + "NAME VARCHAR(10))");
//("create table DBTEST(ID varbinary(10) ,PW varchar(10) )"); 
//varchar �� varbinary ��ҹ��ڸ� �����ϴ°� ���ϴ°� ��� varchar�� ���� ���߿� ��ҹ��� �����ϴ� ����� ����
//("create table MEMBER(NUM varchar(6), NAME varchar(10) NOT NULL, ID varchar(10) PRIMARY KEY, PW varchar(10) NOT NULL, BALANCE int  )");
//("CREATE TABLE MEMBERNUM("
//+ "NUM  INT(3) PRIMARY KEY auto_increment,"
//+ "ID varchar(10), "
//+ "FOREIGN KEY (ID) "
//+ "REFERENCES MEMBER(ID) "
//+ "ON UPDATE CASCADE)");