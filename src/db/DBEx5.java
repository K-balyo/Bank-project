package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx5 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?"
				+ "characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null; 
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
			// UPDATE ��
//			String sql = " update DBTEST set ID = 'z', PW = '7'";//�⺻
//			String sql = "update DBTEST set ID = 'Y', PW = '5' WHERE ID = 'a' ";//���� ��
			String sql = update(); 
			int result = stmt.executeUpdate(sql); 
			String msg = result > -1 ? "sucessful" : "fail";
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("�����ͺ��̽� ���� ����");
		}finally {
			try {
				if(stmt != null) conn.close();
				if(conn != null) conn.close();
			}catch(Exception e){}
		}
	} //end main
	
	/*
	 * DATA INSERT
	 * @retun
	 */
			
		public static String update() {
			java.util.Scanner scan =
					new java.util.Scanner(System.in);
			System.out.println("DBTEST ���̺� �� ������Ʈ");
			// ID �ʵ� ���� �Է� ����
			System.out.print("ID : ");
			String id = scan.next();
			// PASSWORD �ʵ� ���� �Է� ����
			System.out.print("PW : ");
			String pw = scan.next();
			// ���ǿ� �ش��ϴ� ID �ʵ� ���� �Է� ����
//			System.out.print("�ٲ� ��� ID : ");
			System.out.print("���� ID �Է� : ");
			String wId = scan.next();
//			String sql = "insert into DBTEST values('" + id + "', '" + pw + "')";
			String sql = "update DBTEST set ID = '" + id 
					                  + "', PW = '" + pw 
					                  + "' WHERE ID = '" + wId+ "'";
		    return sql;
		}
}
