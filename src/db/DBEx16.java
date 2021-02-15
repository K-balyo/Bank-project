package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//게시판 만들면 게시물 10개씩 보이게 페이지 분류 하려면 이거 쓰는 듯
public class DBEx16 {
    /*
	BETWEEN (범위) : a AND b 에서 a와 b를 포함한(inclusive)
	                                그 사이의 모든 값에 해당하는지 여부를 조건으로 한다.
	      [실습 테이블 만들기] : BWTEST
	      CREATE TABLE BWTEST(
	      IDX INT,
	      BIRTH DATE,
	      NAME VARCHAR(10));
	      [레코드 추가]
	      INSERT INTO BWTEST VALUES(1, '2020-01-01', '홍길동');
	      INSERT INTO BWTEST VALUES(2, '2020-01-02', '이순신');
	      INSERT INTO BWTEST VALUES(3, '2020-01-03', '만득이');
	      INSERT INTO BWTEST VALUES(4, '2020-02-01', '개똥이');
	      INSERT INTO BWTEST VALUES(5, '2020-02-02', '칠득이');
	      INSERT INTO BWTEST VALUES(6, '2020-03-01', '갑돌이');
	      INSERT INTO BWTEST VALUES(7, '2020-03-02', '갑순이');
	*/
	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql =select();
//		연습문제) 2020-01-02 ~ 2020-01-08 범위의 레코드를 추출하시오.
//		Limit :범위 추출
//		ex1) 1~n;
//		String sql = "SELECt * FROM BWTEST LIMIT n"; 처음 값부터 n개 까지 추출 됨
//		String sql = "SELECT * FROM BWTEST LIMIT n OFFSET n2"; n 이후 부터 가져올  n개  
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			for(int i = 1; i <= columnCnt; i++) {
				String columnName = rsmd.getColumnName(i);
				System.out.print(columnName + "\t");
			}
			System.out.println("\n-------------------------------");
			while(rs.next()) {
				for(int i = 1; i <= columnCnt; i++) {
					String columnValue = rs.getString(i);
					System.out.print(columnValue);
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
//		String sql = "SELECT * FROM BWTEST WHERE IDX BETWEEN 2 AND 5";
//		String sql = "SELECT * FROM BWTEST WHERE IDX >= 2 AND IDX <= 5";
//		 연습문제
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2020-01-02' AND '2020-01-08'";//1-1  1-2 랑 같은거임
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH >= '2020-01-02' AND BIRTH <= '2020-01-08'";//1-2
//		String sql = "SELECt * FROM BWTEST LIMIT 4";
//	    String sql = "SELECT * FROM BWTEST LIMIT 2 OFFSET 5"; //3-1
//	    String sql = "SELECT * FROM BWTEST LIMIT 5, 2"; // 3-2
	    String sql = "SELECT * FROM BWTEST ORDER BY idx desc LIMIT 5, 2"; // 응용 내림 차순까지 적용
		return sql;
	}

}
