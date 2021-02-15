package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/*
 *  ��������(constraint)
               ��������(constraint)�̶� �������� ���Ἲ�� ��Ű�� ����, �����͸� �Է¹��� �� 
               ����Ǵ� �˻� ��Ģ�� �ǹ��մϴ�.
               �̷��� ���� ������ CREATE ������ ���̺��� ������ ���� ALTER ������ �ʵ带 
               �߰��� ���� ������ ���� �ֽ��ϴ�.
               -MySQL���� ����� �� �ִ� ���� ������ ������ �����ϴ�.
               1. NOT NULL
               2. UNIQUE
               3. PRIMARY KEY
               4. FOREIGN KEY
               5. DEFAULT
              
         
   
 */
// ex1) ���̺� ����
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
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
		/*	
			 - NOT NULL
	          
	           NOT NULL ���� ������ �����ϸ�, �ش� �ʵ�� NULL ���� ������ �� �����ϴ�.
	           ��, �� ���� ������ ������ �ʵ�� ������ �����͸� ������ �־�� �մϴ�.
	           NOT NULL ���� ������ CREATE������ ���̺��� ������ ����,
	           ���߿� ALTER ������ �߰��� ���� �ֽ��ϴ�.
	           
	           ex1) [���̺� ����]
	           
	           ("CREATE TABLE TEST1(
	           ID VARCHAR(10) NOT NULL,
	           PW VARCHAR(30),
	           NAME VARCHAR(30),
	           MDate DATE,   ��¥ ������ �����Ҷ� ���� �ڵ�
	           AGE INT(3)
	           )");
	   */
			// NOT NULL �� ����

//			  String sql = insert();
//			  int result = stmt.executeUpdate(sql);
//			  String msg = result > -1 ? "successful" : "fail";
//			  System.out.println(msg);
			
			
			// NOT NULL ���Ȯ��
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
		public static String insert() {
			java.util.Scanner scan =
					new java.util.Scanner(System.in);
			String sql = 
			"insert into TEST1 values" 
			+ "('abc1', '123', 'ȫ�浿', '2020-01-01', '999' )" ; //insert ��
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
