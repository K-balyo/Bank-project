package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx6 {
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
			//Delete 문
			String sql = delete();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "sucessful" : "fail";
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("데이터베이스 연결 실패");
		}finally { 
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){} 
		}
	} //end main
	public static String delete() {
		java.util.Scanner scan =
				new java.util.Scanner(System.in);
		System.out.println("DBTEST 테이블에 값 지우기");
		//ID 필드값 입력
		System.out.print("지울 ID : ");
		String wId = scan.next();
		//PW 필드값 입력
		System.out.print("지울 PW : ");
		String wPw = scan.next();
//		String sql = "DELETE FROM DBTEST WHERE ID = 'aaa' && PW = '111'";  // && 대신에 AND 가능      or 도가능
		String sql = "DELETE FROM DBTEST WHERE ID = '" + wId + "' "
				                         + "&& PW = '" + wPw + "'";  // && << 이기때문에 Id와 Pw가 모두 참이어야 지워짐
		   return sql;
			
	
	}
	}


