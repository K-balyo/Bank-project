package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBEx2 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/app";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
//		String user =
//		String password =
		Connection conn = null;
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("데이터베이스 연결 성공!");
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패");
		}finally {
			try {
				if(conn != null) conn.close();
			}catch(Exception e){
				
			}
		}
	}

}
