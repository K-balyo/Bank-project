package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx19 {
	/*
	 *  - LIKE �˻� : ���ڿ��κ���ġ �˻�(LIKE)
	    EQUAL ������ (=) �� ��� �񱳴�󰪰� ��Ȯ�� ��ġ�ϴ� ���� ������� �˻��մϴ�.
	    �ݸ鿡, ���ڰ��� �κ������θ� ��ġ�ص� ������ �˻��� �ϰ��� �ϴ� ��쿡 LIKE ��ɾ ����մϴ�.
	    ���ڿ��÷� ���� �˻� ���ڰ��� �κ��̶� ��ġ�ϴ� �����͸� ��ȸ������� ���� �� ����մϴ�.
	    �κ� ��ġ �˻��� ���ؼ� Ư�� ���ڰ� �̿��� ��ġ���� **('_'. '%')**�� ����մϴ�.
	    - ���ϵ�ī�� ����('_', '%')
	    �ǹ�)
	    1. % : 0�� �̻��� �ڸ����� ���� ���ڿ�.
	    2. _ : 1�ڸ��� ����
	    
	    [����]               [����]
	    �÷��� LIKE '%CD%'     �÷��� �� CD�� ���Ե� ���ڿ��� ��� ���
	    �÷��� LIKE 'CD%'      �÷��� �� CD�� �����ϴ� ���ڿ��� ���
	    �÷��� LIKE 'C%D'      �÷��� �� C�� �����ϰ� �߰� ������ �����̵� �������
	                       (�ڸ����� �������) ���ڸ����� D�� ���ڿ��� ���
           �÷��� LIKE '_CD_'      �÷��� �ڸ����� 4�ڸ��̰� 1��°, 4��° �ڸ�����
                                                       �����̵� ������� 2~3��°�� CD�� �� ���ڿ�
           �÷��� LIKE 'CD_'       �÷����� 3�ڸ��̰�, CD�� �����ϰ� 3��°����
                                                       �����̵� ������� ���ڿ��� ���
           �÷��� LIKE 'C_D'       �÷����� 3�ڸ��̰� 1��° ���� C, 3��° ���� D�̰�
                                                       �߰��� 1�ڸ��� �����̵� ������� ���ڿ��� ���
                                                       
                   ����)
//          -> SELECT * FROM ���̺�� WHERE ���ڿ��÷� LIKE '�˻����ڰ�'
	  [�ǽ����̺� �����] LSTEST
	  CREATE TABLE LSTEST(
	         PHONE VARCHAR(15),
	         NAME VARCHAR(10));
	  
	  [���ڵ� �߰�]
	  INSERT INTO LSTEST VALUES('011-1234-5678', 'ȫ�浿');
	  INSERT INTO LSTEST VALUES('011-1234-5678', '�̼���');
	  INSERT INTO LSTEST VALUES('010-1234-5678', '������');
	  INSERT INTO LSTEST VALUES('010-1234-5678', '������');
	  INSERT INTO LSTEST VALUES('010-1234-5678', 'ĥ����');
	  INSERT INTO LSTEST VALUES('070-1234-5678', '������');
	 */
      public static void main(String[] args) {
    	  DBAction db = DBAction.getInstance();
  		Connection conn = db.getConnection();
  		Statement stmt = null;
  		ResultSet rs = null;
  		ResultSetMetaData rsmd = null;
  		String sql = select();
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
//    	  ex1)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '%011'";
//    	  ex2)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE'011%'";
//        ex3)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE'%070%'";
//        ex4)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE'0%8'";
//        ex5)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'_��_'";
//        ex6) 
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'ĥ__'";
//        ex7)
//    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'__��'";
//        ex8)
    	  String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE'��_��'";
    	  return sql;
      }
      }

 
