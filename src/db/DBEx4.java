package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx4 {
	
	public static void main(String[] args) {
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/app?"
//				+ "characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, "root", "java");
//			System.out.println("�����ͺ��̽� ���� ����!");
//			stmt = conn.createStatement();
//			String sql = insert();
//		    int result = stmt.executeUpdate(sql);
//		    String msg = result > -1 ? "successful" : "fail";
//		    System.out.println(msg);
//		}catch(Exception e){
//			System.out.println("�����ͺ��̽� ���� ����");
//		}finally {
//			try {
//				if(stmt != null) stmt.close();
//				if(conn != null) conn.close();
//			}catch(Exception e){}
//		}
//	}//end
	/*
	 * DATA INSERT
	 * @retun
	 */
		
	DBAction db = DBAction.getInstance();
	conn = db.getConnection();
	String sql = insert();
    
	try {
		stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);
	    String msg = result > -1 ? "successful" : "fail";
	    System.out.println(msg);
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	}
		public static String insert() {
//			java.util.Scanner scan =
//					new java.util.Scanner(System.in);
//			System.out.println("DBTEST ���̺� �� �Է��ϱ�");
//			System.out.print("ID : ");
//			String id = scan.next();
//			System.out.print("PW : ");
//			String pw = scan.next();
//			String sql = 
//			"insert into DBTEST values('abc', '123')"; // insert ��
//			"insert into DBTEST values('" + id + "', '" + pw + "')"; // insert ��
//			"insert into DBTEST(ID) values('abc'. '123')";  ID ���� �߰��Ѵٴ� �ڵ�
			// table �̸�(DETEST) ���� ��ȣ ���� �÷� �̸������� ������ ���� �߰��� �� �ִ�
			/*
			System.out.println("MEMBER ���̺� �� �Է��ϱ�");
			System.out.print("NAME : ");
//			String name = scan.next();
//			System.out.print("ID : ");
//			String id = scan.next();
//			System.out.print("PW : ");
			String pw = scan.next();
			System.out.print("BALANCE : ");
			String balance = scan.next();
			
			String sql = 
					"insert into MEMBER values('" + name + "','" + id + "', '" + pw + "','" + balance + "')";
					*/
//			"insert into TEST1(PW) values('123')";
			String sql = 
//			  "INSERT INTO LSTEST VALUES('011-1234-5678', 'ȫ�浿')";
//			  "INSERT INTO LSTEST VALUES('011-1234-5678', '�̼���')";
//			  "INSERT INTO LSTEST VALUES('010-1234-5678', '������')";
//			  "INSERT INTO LSTEST VALUES('010-1234-5678', '������')";
//			  "INSERT INTO LSTEST VALUES('010-1234-5678', 'ĥ����')";
			  "INSERT INTO LSTEST VALUES('070-1234-5678', '������')";
		    return sql;
		}
	}
