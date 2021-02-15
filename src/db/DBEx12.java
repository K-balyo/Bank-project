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
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
			/*
			 - DEFAULT
			 DEFAULT ���� ������ �ش� �ʵ��� �⺻���� ������ �� �ְ� ���ݴϴ�.
			 ���� ���ڵ带 �Է��� �� �ش� �ʵ� ���� �������� ������,
			 �ڵ����� ������ �⺻���� �����մϴ�.
			 [���̺� ����]
			      CREATE TABLE TEST6(
			     ID        VARCHAR(10),
			     PW        VARCHAR(30),
			     NAME      VARCHAR(30) DEFAULT 'Anonymous',
			     MDate     DATE,
			     AGE       INT
			 );
			 */
			
//			// PRIMARY KEY �� ����
//			String sql = insert();
//			  int result = stmt.executeUpdate(sql);
//			  String msg = result > -1 ? "successful" : "fail";
//			  System.out.println(msg);
//			
			//PRIMARY KEY ���Ȯ��
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
			System.out.println("�����ͺ��̽� ���� ����");
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
//		+ "('abc1', '123', '2020-01-01', '999' )" ; //insert ��
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
