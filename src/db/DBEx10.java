package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBEx10 {
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
			-PRIMARY KEY
			PRIMARY KEY 제약 조건을 설정하면, 해당 필드는 NOT NULL 과 UNIQUE
			제약 조건의 특징을 모두 가집니다.
			따라서 이 제약 조건이 설정된 필드는 NULL 값을 가질 수 없으며,
			또한 중복된 값을 가져서도 안 됩니다.
			이러한PRIMARY KEY 제약 조건을 기본 키라고 합니다.
			UNIQUE는 한 테이블의 여러 필드에 설정할 수 있지만, PRIMARY KEY는 테이블당 
			오직 하나의 필드에만 설정할 수 있습니다.
			이러한 PRIMARY KEY 제약 조건은 테이블의 데이터를 쉽고 빠르게 찾도록
			도와주는 역할을 합니다. 
			      -->[테이블 생성]
			      ("CREATE TABLE TEST3(
			      ID VARCHAR(10) PRIMARY KEY,
			      PW VARCHAR(30),
			      NAME VARCHAR(30),
			      MDate DATE,
			      AGE INT
			     )");
			*/
			// PRIMARY KEY 값 저장
			String sql = insert();
			  int result = stmt.executeUpdate(sql);
			  String msg = result > -1 ? "successful" : "fail";
			  System.out.println(msg);
			
			//PRIMARY KEY 결과확인
//			String sql = select();
//			rs = stmt.executeQuery(sql);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int colCnt = rsmd.getColumnCount();
//			while(rs.next()) {
//				for ( int i = 1; i <= colCnt; i++) {
//					String result = rs.getString(i);
//					System.out.println(result);
//				}
//			}
			
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
	public static String insert() {
		java.util.Scanner scan =
				new java.util.Scanner(System.in);
		String sql = 
		"insert into TEST3 values" 
		+ "('abc1', '123', '홍길동', '2020-01-01', '999' )" ; //insert 문
	    return sql;
	}
	/*
	 * DATA SELECT
	 * @return SQL Query
	 */
//	public static String select() {
//		String sql = "SELECT * FROM TEST3";
//		return sql;
//	}
	
}
