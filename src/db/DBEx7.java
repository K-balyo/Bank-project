package db;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bankapp.Member;

public class DBEx7 {
	public List<Member> memberList(){
		List<Member> list = new ArrayList<>();
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
//		ResultSetMetaData rsmd = rs.getMetaData();
//		int cols = rsmd.getColumnCount();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(select());
			while(rs.next()) {
				Member member = new Member(rs.getString(1),  
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						Integer.parseInt(rs.getString(5)));
				list.add(member);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}		 
		return	list; 
	}
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank?"
				+ "characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
			//Select ��
//			String sql = select();
//			rs = stmt.executeQuery(sql);
			
			/*
			if(rs.next()) {    //where ������ if �ƴ϶�� while
				String name = rs.getString(1); // 1 �� �÷� �ε��� 1���ͽ����� MEMBER ���̺����� name ����
				String id = rs.getString(2);  // 2�� �ι�° ID
				String pw = rs.getString(3);  // pw
				int balance = rs.getInt(4); //balance
				System.out.println("�̸� : " + name
						    + " ID : " + id
				            + " PW : " + pw
                            + " Balance : " + balance);
//				String balance = rs.getString(4); 
//              balance  �̷��Ե� �� �� ���� �����ͺ��̽����� �Ѿ�Ë� ���ڿ��� �Ѿ�ͼ�
			}
			*/
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
	public String select() {
//		java.util.Scanner scan =
//				new java.util.Scanner(System.in);
		//ID �ʵ尪 �Է�
//		System.out.print("select ID : ");
//		String id = scan.next(); 
//		//PW �ʵ尪 �Է�
//		System.out.print("select PW : ");
//		String pw = scan.next();

//		String sql = "SELECT * FROM MEMBER";  // * ��� �÷��� �����ϴ� �ڵ�
//		String sql = "SELECT NAME, ID, PW, BALANCE FROM MEMBER";  // ID�� PW ���� ������    "SELECT ��ĭ FROM DBTEST"  ��ĭ�� ���� �ֱ�
//		String sql = "SELECT FROM DBTEST WHERE ID = '1' && PW = '1'";
//		String sql = "SELECT * FROM MEMBER WHERE ID = '" + id + "' && PW = '" + pw + "'";
		String sql = "SELECT * FROM MEMBER";
		return sql;
			
	
	}

}
