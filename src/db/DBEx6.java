package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx6 {
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
			//Delete ��
			String sql = delete();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "sucessful" : "fail";
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("�����ͺ��̽� ���� ����");
		}finally { 
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){} 
		}
	} //end main
	public static String delete() {
		java.util.Scanner scan =
				new java.util.Scanner(System.in);
		System.out.println("DBTEST ���̺� �� �����");
		//ID �ʵ尪 �Է�
		System.out.print("���� ID : ");
		String wId = scan.next();
		//PW �ʵ尪 �Է�
		System.out.print("���� PW : ");
		String wPw = scan.next();
//		String sql = "DELETE FROM DBTEST WHERE ID = 'aaa' && PW = '111'";  // && ��ſ� AND ����      or ������
		String sql = "DELETE FROM DBTEST WHERE ID = '" + wId + "' "
				                         + "&& PW = '" + wPw + "'";  // && << �̱⶧���� Id�� Pw�� ��� ���̾�� ������
		   return sql;
			
	
	}
	}


