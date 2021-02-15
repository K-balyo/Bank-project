package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx1 {
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
			("create table MEMBER(NAME varchar(10), ID varchar(10), PW varchar(10), BALANCE int)");
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
