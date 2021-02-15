package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBEx11 {
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
    -FOREIGN KEY : 외래 키
    FOREIGN KEY 제약 조건을 설정한 필드는 외래 키라고 부르며,
        한 테이블을 다른 테이블과 연결해주는 역할을 합니다.
        외래 키가 설정된 테이블에 레코드를 입력하면, 기준이 되는 테이블의 내용을 
        참조해서 레코드가 입력됩니다.
        즉, FOREIGN KEY 제약 조건은 하나의 테이블을 다른 테이블에 의존하게 만듭니다.
        FOREIGN KEY 제약 조건을 설정할 때 참조되는 테이블의 필드는 반드시
        UNIQUE 나 PRIMARY KEY 제약 조건이 설정되어 있어야 합니다.
        -->[테이블 생성]
      CREATE TABLE TEST4( --parent
      CODE INT(3) PRIMARY KEY,
      ITEM VARCHAR(30),
      RDate DATE
      );
      CREATE TABLE TEST5(   --child
      NUM             INT(3) PRIMARY KEY auto_increment, // 회원 순번에 대한 값을 지정하는 코드
      CODE            INT(3),
      FOREIGN KEY (CODE)
      REFERENCES TEST4(CODE) ON UPDATE CASCADE
      );
      테이블 삭제 
      DROP TABLE TEST5;   순서대로 삭제해야함
      DROP TABLE TEST4;
      
 */
//			FOREIGN KEY 값 저장
			
//			String sql = insert();
//			  int result = stmt.executeUpdate(sql);
//			  String msg = result > -1 ? "successful" : "fail";
//			  System.out.println(msg);
			
//			FOREIGN KEY 결과확인
			  
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
//			 FOREIGN  UPDATE
			 
			  String sql = update();
				int result = stmt.executeUpdate(sql); 
				String msg = result > -1 ? "sucessful" : "fail";
				System.out.println(msg);
			
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
//		/* 입력해서 넣고싶을떄 쓰는 코드
//		java.util.Scanner scan =
//				new java.util.Scanner(System.in);
//		*/
//		String sql = 
//		/* 실행1)
//		"insert into TEST4" 
//		+ "(CODE, ITEM, RDate)VALUES(1, '아이템1', '2020-01-01' )" ; //insert 문
//		*/
//	    /* 실행2)
//		"insert into TEST4" 
//		+ "(CODE, ITEM, RDate)VALUES(2, '아이템2', '2020-01-01' )" ; //insert 문
//	    */
//		/* 실행3)
//		 "insert into TEST5" 
//		+ "(CODE)VALUES(1)" ; //insert 문
//		*/
//		/* 실행4)
//		 "insert into TEST5" 
//		+ "(CODE)VALUES(2)" ; //insert 문
//		*/
//	    return sql;
//	}
	/*
	 * DATA SELECT
	 * @return SQL Query
	 */

//	public static String select() {
//    /*실행1)
//	String sql = "SELECT * FROM TEST4";
//    */
// 
////	/*실행2)
//	String sql = "SELECT * FROM TEST5";
////    */
//		return sql;
//	}
	/*
	 *  DATA UPDATE
     * @return SQL Query
	 */
	public static String update() {
		String sql = 
				"UPDATE TEST4 SET CODE = 7 WHERE CODE = 8";
		return sql;
	}
}
