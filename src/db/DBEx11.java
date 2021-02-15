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
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
	/*
    -FOREIGN KEY : �ܷ� Ű
    FOREIGN KEY ���� ������ ������ �ʵ�� �ܷ� Ű��� �θ���,
        �� ���̺��� �ٸ� ���̺�� �������ִ� ������ �մϴ�.
        �ܷ� Ű�� ������ ���̺� ���ڵ带 �Է��ϸ�, ������ �Ǵ� ���̺��� ������ 
        �����ؼ� ���ڵ尡 �Էµ˴ϴ�.
        ��, FOREIGN KEY ���� ������ �ϳ��� ���̺��� �ٸ� ���̺� �����ϰ� ����ϴ�.
        FOREIGN KEY ���� ������ ������ �� �����Ǵ� ���̺��� �ʵ�� �ݵ��
        UNIQUE �� PRIMARY KEY ���� ������ �����Ǿ� �־�� �մϴ�.
        -->[���̺� ����]
      CREATE TABLE TEST4( --parent
      CODE INT(3) PRIMARY KEY,
      ITEM VARCHAR(30),
      RDate DATE
      );
      CREATE TABLE TEST5(   --child
      NUM             INT(3) PRIMARY KEY auto_increment, // ȸ�� ������ ���� ���� �����ϴ� �ڵ�
      CODE            INT(3),
      FOREIGN KEY (CODE)
      REFERENCES TEST4(CODE) ON UPDATE CASCADE
      );
      ���̺� ���� 
      DROP TABLE TEST5;   ������� �����ؾ���
      DROP TABLE TEST4;
      
 */
//			FOREIGN KEY �� ����
			
//			String sql = insert();
//			  int result = stmt.executeUpdate(sql);
//			  String msg = result > -1 ? "successful" : "fail";
//			  System.out.println(msg);
			
//			FOREIGN KEY ���Ȯ��
			  
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
//		/* �Է��ؼ� �ְ������ ���� �ڵ�
//		java.util.Scanner scan =
//				new java.util.Scanner(System.in);
//		*/
//		String sql = 
//		/* ����1)
//		"insert into TEST4" 
//		+ "(CODE, ITEM, RDate)VALUES(1, '������1', '2020-01-01' )" ; //insert ��
//		*/
//	    /* ����2)
//		"insert into TEST4" 
//		+ "(CODE, ITEM, RDate)VALUES(2, '������2', '2020-01-01' )" ; //insert ��
//	    */
//		/* ����3)
//		 "insert into TEST5" 
//		+ "(CODE)VALUES(1)" ; //insert ��
//		*/
//		/* ����4)
//		 "insert into TEST5" 
//		+ "(CODE)VALUES(2)" ; //insert ��
//		*/
//	    return sql;
//	}
	/*
	 * DATA SELECT
	 * @return SQL Query
	 */

//	public static String select() {
//    /*����1)
//	String sql = "SELECT * FROM TEST4";
//    */
// 
////	/*����2)
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
