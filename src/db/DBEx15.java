package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx15 {
	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
//		ORDER BY 문
//		   - ORDER BY (ASC[ascending], DESC[descending]) 정렬 오름차순 내림차순
//		   /*
//		    [테이블 생성] : OBTEST
//		    ("CREAT TABLE OBTEST(NUM INT, ID VARCHAR(10))");
			
//		    [레코드 추가]
//		    INSERT INTO OBTEST VALUES(1, 'abc');
//		    INSERT INTO OBTEST VALUES(2, 'def');
//		    INSERT INTO OBTEST VALUES(3, 'ghi');
//		 */
		String sql = orderBy();
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
	    int colCnt = rsmd.getColumnCount();
		for(int i = 1; i <= colCnt; i++) {
			String columnName = rsmd.getColumnName(i);
			System.out.print(columnName + "\t");
		}
		System.out.println("\n-------------------------------------------------------");
		while(rs.next()) {
			for(int i = 1; i <= colCnt; i++) {
				String columnValue = rs.getString(i);
				System.out.print(columnValue + "\t");
			}
			System.out.println();
		}
	}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static String orderBy() {
		String sql = "SELECT * FROM OBTEST ORDER BY NUM DESC";
		return sql;
	}

}
