package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/*
 *  제약조건(constraint)
               제약조건(constraint)이란 데이터의 무결성을 지키기 위해, 데이터를 입력받을 때 
               실행되는 검사 규칙을 의미합니다.
               이러한 제약 조건은 CREATE 문으로 테이블을 생성할 때나 ALTER 문으로 필드를 
               추가할 때도 설정할 수도 있습니다.
               -MySQL에서 사용할 수 있는 제약 조건은 다음과 같습니다.
               1. NOT NULL
               2. UNIQUE
               3. PRIMARY KEY
               4. FOREIGN KEY
               5. DEFAULT
              
         
   
 */
// ex1) 테이블 생성
public class DBEx8 {
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
			 - NOT NULL
	          
	           NOT NULL 제약 조건을 설정하면, 해당 필드는 NULL 값을 저장할 수 없습니다.
	           즉, 이 제약 조건이 설정된 필드는 무조건 데이터를 가지고 있어야 합니다.
	           NOT NULL 제약 조건은 CREATE문으로 테이블을 생성할 때나,
	           나중에 ALTER 문으로 추가할 수도 있습니다.
	           
	           ex1) [테이블 생성]
	           
	           ("CREATE TABLE TEST1(
	           ID VARCHAR(10) NOT NULL,
	           PW VARCHAR(30),
	           NAME VARCHAR(30),
	           MDate DATE,   날짜 정보를 저장할때 쓰는 코드
	           AGE INT(3)
	           )");
	   */
			// NOT NULL 값 저장

//			  String sql = insert();
//			  int result = stmt.executeUpdate(sql);
//			  String msg = result > -1 ? "successful" : "fail";
//			  System.out.println(msg);
			
			
			// NOT NULL 결과확인
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
		public static String insert() {
			java.util.Scanner scan =
					new java.util.Scanner(System.in);
			String sql = 
			"insert into TEST1 values" 
			+ "('abc1', '123', '홍길동', '2020-01-01', '999' )" ; //insert 문
		    return sql;
		}
		/*
		 * DATA SELECT
		 * @return SQL Query
		 */
		public static String select() {
			String sql = "SELECT * FROM TEST1";
			return sql;
		}
	}
