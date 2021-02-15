package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx17 {
//	    - SYSDATE, NOW : 현재 시간, 날짜 정보 출력
	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql = select();
 
//		ex2) CURDATE, CURRENTDATE 현재 날짜 정보 출력
//		ex3) CURDATE, CURRENTTIME 현재 시간 정보 출력
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
//		String sql = "SELECT SYSDATE() SYSDATE, NOW() NOW";
//		String sql = "SELECT CURDATE() CURDATE, CURRENT_DATE() CURRENTDATE"; // 날짜 정보 출력
		String sql = "SELECT CURDATE() CURTIME, CURRENT_TIME() CURRENTTIME"; // 시간 정보 출력
				return sql;
	}

}
