package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBEx12 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?"
				+ "characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("데이터베이스 연결 성공!");
			stmt = conn.createStatement();
			/*
			 - DEFAULT
			 DEFAULT 제약 조건은 해당 필드의 기본값을 설정할 수 있게 해줍니다.
			 만약 레코드를 입력할 때 해당 필드 값을 전달하지 않으면,
			 자동으로 설정된 기본값을 저장합니다.
			 [테이블 생성]
			      CREATE TABLE TEST6(
			     ID        VARCHAR(10),
			     PW        VARCHAR(30),
			     NAME      VARCHAR(30) DEFAULT 'Anonymous',
			     MDate     DATE,
			     AGE       INT
			 );
			 */
			
//			// PRIMARY KEY 값 저장
//			String sql = insert();
//			  int result = stmt.executeUpdate(sql);
//			  String msg = result > -1 ? "successful" : "fail";
//			  System.out.println(msg);
//			
			//PRIMARY KEY 결과확인
			String sql = select();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCnt = rsmd.getColumnCount();
			while(rs.next()) {
				for ( int i = 1; i <= colCnt; i++) {
					String result = rs.getString(i);
					System.out.println(result);
				}
			}
			  
			  
			
		}catch(Exception e){
			System.out.println("데이터베이스 연결 실패");
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){}
		}
	} //end main
	/*
	 * DATA INSERT
	 *  @return SQL Query
	 */
//	public static String insert() {
//		java.util.Scanner scan =
//				new java.util.Scanner(System.in);
//		String sql = 
//		"insert into TEST6(ID, PW, MDate, AGE) values" 
//		+ "('abc1', '123', '2020-01-01', '999' )" ; //insert 문
//	    return sql;
//	}
	/*
	 * DATA SELECT
	 * @return SQL Query
	 */
	public static String select() {
		String sql = "SELECT * FROM TEST6";
		return sql;
	}

}
