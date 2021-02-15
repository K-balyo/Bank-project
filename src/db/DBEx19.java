package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx19 {
	/*
	 *  - LIKE 검색 : 문자열부분일치 검색(LIKE)
	    EQUAL 연산자 (=) 의 경우 비교대상값과 정확히 일치하는 값을 대상으로 검색합니다.
	    반면에, 문자값이 부분적으로만 일치해도 데이터 검색을 하고자 하는 경우에 LIKE 명령어를 사용합니다.
	    문자열컬럼 내에 검색 문자값이 부분이라도 일치하는 데이터를 조회대상으로 잡을 때 사용합니다.
	    부분 일치 검색을 위해서 특정 문자값 이외의 위치에는 **('_'. '%')**를 사용합니다.
	    - 와일드카드 종류('_', '%')
	    의미)
	    1. % : 0개 이상의 자리수를 갖는 문자열.
	    2. _ : 1자리수 문자
	    
	    [형식]               [설명]
	    컬럼명 LIKE '%CD%'     컬럼값 중 CD가 포함된 문자열이 모두 대상
	    컬럼명 LIKE 'CD%'      컬럼값 중 CD로 시작하는 문자열이 대상
	    컬럼명 LIKE 'C%D'      컬럼값 중 C로 시작하고 중간 값들은 무엇이든 상관없이
	                       (자리수도 상관없이) 끝자리값이 D인 문자열이 대상
           컬럼명 LIKE '_CD_'      컬럼값 자리수가 4자리이고 1번째, 4번째 자리값은
                                                       무엇이든 상관없고 2~3번째에 CD가 들어간 문자열
           컬럼명 LIKE 'CD_'       컬럼값이 3자리이고, CD로 시작하고 3번째값은
                                                       무엇이든 상관없고 문자열이 대상
           컬럼명 LIKE 'C_D'       컬럼값이 3자리이고 1번째 값이 C, 3번째 값이 D이고
                                                       중간값 1자리는 무엇이든 상관없는 문자열이 대상
                                                       
                   형식)
//          -> SELECT * FROM 테이블명 WHERE 문자열컬럼 LIKE '검색문자값'
	  [실습테이블 만들기] LSTEST
	  CREATE TABLE LSTEST(
	         PHONE VARCHAR(15),
	         NAME VARCHAR(10));
	  
	  [레코드 추가]
	  INSERT INTO LSTEST VALUES('011-1234-5678', '홍길동');
	  INSERT INTO LSTEST VALUES('011-1234-5678', '이순신');
	  INSERT INTO LSTEST VALUES('010-1234-5678', '만득이');
	  INSERT INTO LSTEST VALUES('010-1234-5678', '개똥이');
	  INSERT INTO LSTEST VALUES('010-1234-5678', '칠득이');
	  INSERT INTO LSTEST VALUES('070-1234-5678', '갑돌이');
	 */
      public static void main(String[] args) {
    	  DBAction db = DBAction.getInstance();
  		Connection conn = db.getConnection();
  		Statement stmt = null;
  		ResultSet rs = null;
  		ResultSetMetaData rsmd = null;
  		String sql = select();
  		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			for(int i = 1; i <= columnCnt; i++) {
				String columnName = rsmd.getColumnName(i);
				System.out.print(columnName + "\t");
			}
			System.out.println("\n--------------------------------");
			while(rs.next()) {
				for(int i = 1; i <= columnCnt; i++) {
					String columnValue = rs.getString(i);
					System.out.print(columnValue + "\t");
				}
				System.out.println();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
      public static String select() {
//    	  ex1)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '%011'";
//    	  ex2)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE'011%'";
//        ex3)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE'%070%'";
//        ex4)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE'0%8'";
//        ex5)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'_순_'";
//        ex6) 
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'칠__'";
//        ex7)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'__이'";
//        ex8)
    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'갑_이'";
    	  return sql;
      }
      }

 
