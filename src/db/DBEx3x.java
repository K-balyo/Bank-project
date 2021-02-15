package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx3x {
	public static void main(String[] args) {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/app?"
			+ "characterEncoding=UTF-8&serverTimezone=UTC";
	Connection conn = null;
	Statement stmt = null;
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, "root", "java");
		System.out.println("데이터베이스 연결 성공!");
		stmt = conn.createStatement();
		int result = stmt.executeUpdate  
		("create table MEMBER(NAME varchar(10) NOT NULL, ID varchar(10)PRIMARY KEY,PW varchar(10)NOT NULL, BALANCE int NOT NULL )");
//		("create table TEST1(ID VARCHAR(10) NOT NULL, PW VARCHAR(30), NAME VARCHAR(30), MDate DATE, AGE INT)");
//		("create table TEST2(ID VARCHAR(10) UNIQUE, PW VARCHAR(30), NAME VARCHAR(30), MDate DATE, AGE INT)");
//		("create table TEST3(ID VARCHAR(10) PRIMARY KEY, PW VARCHAR(30), NAME VARCHAR(30), MDate DATE, AGE INT)");
//		("CREATE TABLE TEST4(CODE INT(3) PRIMARY KEY, ITEM VARCHAR(30),	RDate DATE)");
//		("CREATE TABLE TEST5(NUM INT(3) PRIMARY KEY auto_increment,"
//				+ " CODE INT(3), FOREIGN KEY (CODE)"
//				+ " REFERENCES TEST4(CODE) ON UPDATE CASCADE");
//	    ("CREATE TABLE TEST6(ID VARCHAR(10), PW VARCHAR(30), "
//	    		+ "NAME VARCHAR(30) DEFAULT 'Anonymous', "
//	    		+ "MDate DATE, "
//	    		+ "AGE INT)");
		String msg = result > -1 ? "successful" : "fail";
		System.out.println(msg);
	}catch(Exception e){
		System.out.println("데이터베이스 연결 실패");
	}finally {
		try {
			if(stmt != null) conn.close();
			if(conn != null) conn.close();
		}catch(Exception e){
			
		}
	}
}
}