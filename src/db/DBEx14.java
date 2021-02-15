package db;

import java.sql.Connection;
import java.sql.Statement;

public class DBEx14 {
	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
//		 ALTER 문
//		 -TABLE 변경
//		 [테이블 생성] : ATTEST
		 /*
		 String sql = "CREATE TABLE ATTEST(" +
		              "ID VARCHAR(10) NOT NULL, " +
		              "PW VARCHAR(10))";
		             
		              */
//		 실습1) 테이블에 새로운 컬럼 추가
//		 실습2) 테이블에 컬럼 타입 추가
//		 실습3) 테이블에 컬럼 이름 변경
//		 실습4) 테이블에 컬럼 삭제
//		문제) MEMBER 테이블에 PRIMARY KEY 추가
		
		 String sql = alter();
		 try {
			 stmt = conn.createStatement();
			 int result = stmt.executeUpdate(sql);
			 String msg = result > -1 ? "successful" : "fail";
			 System.out.println(msg);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 if(stmt != null) stmt.close();
				 if(conn != null) conn.close();
			 }catch(Exception e) {}
		 }
	}
	public static String alter() {
//		String sql = "ALTER TABLE ATTEST ADD COLUMN AGE VARCHAR(10) NOT NULL";  //새로운 컬럼 추가
//		String sql = "ALTER TABLE ATTEST  MODIFY COLUMN AGE INT";               //추가된 컬럼 타입 변경
//		String sql = "ALTER TABLE ATTEST  CHANGE COLUMN PW PASSWORD VARCHAR(30) NOT NULL"; // 추가된 컬럼 이름 변경
//		String sql = "ALTER TABLE ATTEST  DROP COLUMN AGE"; // 컬럼 삭제
		String sql = "ALTER TABLE MEMBER  MODIFY COLUMN ID "; // 컬럼 삭제
		return sql;
	}

}
