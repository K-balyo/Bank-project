package db;

import java.sql.Connection;
import java.sql.Statement;

public class DBEx14 {
	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
//		 ALTER ��
//		 -TABLE ����
//		 [���̺� ����] : ATTEST
		 /*
		 String sql = "CREATE TABLE ATTEST(" +
		              "ID VARCHAR(10) NOT NULL, " +
		              "PW VARCHAR(10))";
		             
		              */
//		 �ǽ�1) ���̺� ���ο� �÷� �߰�
//		 �ǽ�2) ���̺� �÷� Ÿ�� �߰�
//		 �ǽ�3) ���̺� �÷� �̸� ����
//		 �ǽ�4) ���̺� �÷� ����
//		����) MEMBER ���̺� PRIMARY KEY �߰�
		
		 String sql = alter();
		 try {
			 stmt = conn.createStatement();
			 int result = stmt.executeUpdate(sql);
			 String msg = result > -1 ? "successful" : "fail";
			 System.out.println(msg);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 if(stmt != null) stmt.close();
				 if(conn != null) conn.close();
			 }catch(Exception e) {}
		 }
	}
	public static String alter() {
//		String sql = "ALTER TABLE ATTEST ADD COLUMN AGE VARCHAR(10) NOT NULL";  //���ο� �÷� �߰�
//		String sql = "ALTER TABLE ATTEST  MODIFY COLUMN AGE INT";               //�߰��� �÷� Ÿ�� ����
//		String sql = "ALTER TABLE ATTEST  CHANGE COLUMN PW PASSWORD VARCHAR(30) NOT NULL"; // �߰��� �÷� �̸� ����
//		String sql = "ALTER TABLE ATTEST  DROP COLUMN AGE"; // �÷� ����
		String sql = "ALTER TABLE MEMBER  MODIFY COLUMN ID "; // �÷� ����
		return sql;
	}

}
