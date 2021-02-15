package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx5 {
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
			// UPDATE 문
//			String sql = " update DBTEST set ID = 'z', PW = '7'";//기본
//			String sql = "update DBTEST set ID = 'Y', PW = '5' WHERE ID = 'a' ";//조건 절
			String sql = update(); 
			int result = stmt.executeUpdate(sql); 
			String msg = result > -1 ? "sucessful" : "fail";
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("데이터베이스 연결 실패");
		}finally {
			try {
				if(stmt != null) conn.close();
				if(conn != null) conn.close();
			}catch(Exception e){}
		}
	} //end main
	
	/*
	 * DATA INSERT
	 * @retun
	 */
			
		public static String update() {
			java.util.Scanner scan =
					new java.util.Scanner(System.in);
			System.out.println("DBTEST 테이블에 값 업데이트");
			// ID 필드 값을 입력 받음
			System.out.print("ID : ");
			String id = scan.next();
			// PASSWORD 필드 값을 입력 받음
			System.out.print("PW : ");
			String pw = scan.next();
			// 조건에 해당하는 ID 필드 값을 입력 받음
//			System.out.print("바꿀 대상 ID : ");
			System.out.print("조건 ID 입력 : ");
			String wId = scan.next();
//			String sql = "insert into DBTEST values('" + id + "', '" + pw + "')";
			String sql = "update DBTEST set ID = '" + id 
					                  + "', PW = '" + pw 
					                  + "' WHERE ID = '" + wId+ "'";
		    return sql;
		}
}
