package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx20 {
	public static void main(String[] args) {
		getCode("»óºÀ");
	}
	public static void getCode(String dong) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		String sql = "SELECT * FROM ZIPCODE where DONG like "
				+ "'%" + dong + "%' order by SEQ"; // null Ç¥½Ã
		Statement stmt = null;
		ResultSet rs = null;
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String zipcode = rs.getString("ZIPCODE");
				System.out.println(zipcode);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
