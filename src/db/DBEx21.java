package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx21 {
	/* JOIN
	 * JOIN�� �����ͺ��̽� ���� ���� ���̺��� ������ ���ڵ带 �����Ͽ� 
	  �ϳ��� ���̺��̳� ��� �������� ǥ���� �ݴϴ�.
	  �̷��� JOIN�� ���� SELECT ���� �Բ� ���� ���˴ϴ�.
	  ǥ�� SQL������ ���ڵ带 �����ϴ� ��Ŀ� ���� JOIN�� ������ ���� �����մϴ�.
	  1. Cross join
	  2. Equi join
	  3. LEFT JOIN
	  4. RIGHT JOIN
	  [�ǽ� ���̺� �����] : JNTEST
	  CREATE TABLE JNTEST1(
	  ID INT primary key auto_increment,
	  PHONE VARCHAR(15),
	  NAME VARCHAR(10)
	  );
	  [���ڵ� �߰�]
	  INSERT INTO JNTEST1(PHONE,NAME) VALUES('011-1234-5678', 'ȫ�浿');
	  INSERT INTO JNTEST1(PHONE,NAME) VALUES('011-1234-5678', '�̼���');
	  INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '������');
	  INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '������');
	  INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', 'ĥ����');
	  INSERT INTO JNTEST1(PHONE,NAME) VALUES('070-1234-5678', '������');
      
      [�ǽ� ���̺�2 �����] : JNTEST2
      CREATE TABLE JNTEST2(
      ID INT,
      MDATE DATE,
      NAME VARCHAR(10)
      );
      [���ڵ� �߰�]
      INSERT INTO JNTEST2 VALUES(1, '2001-01-01', '�౸����');
      INSERT INTO JNTEST2 VALUES(2, '2001-01-01', '�󱸼���');
      INSERT INTO JNTEST2 VALUES(3, '2001-01-01', '�豸����');
      INSERT INTO JNTEST2 VALUES(7, '2001-01-03', '�豸����2');
	 
	 
	 */
      public static void main(String[] args) {
    	  DBAction db = DBAction.getInstance();
  		Connection conn = db.getConnection();
  		Statement stmt = null;
  		ResultSet rs = null;
  		ResultSetMetaData rsmd = null;
  		String sql = select();
//  	-	Cross join
  		/*
  		 CROSS JOIN �� Cartesian Product(ī��� ��)�̶�� �ϸ� ���εǴ� �� ���̺���
  		 �������� ��ȯ�Ѵ�.
  		 ũ�ν� ������ ���� �����ϰ� ������ �⺻
  		 ��� ���� �� �������� ������ ����ȭ�� �����ͺ��̽����� ������ �ʴ´�.
  		 ù ��° ���̺��� ����� �� ��° ���̺��� ����� ���� �͸�ŭ�� ���� ��ȯ.
  		 - ����� ǥ��, - �Ͻ��� ǥ��
  		 
  		 -  Equi join(INNER EQUI JOIN)
  		     WHERE���� ���ǿ����� "=" �� ����Ͽ� �ߺ��� (������) ���� ����� ������.
  		     (����� ǥ���� �Ͻ��� ǥ��)
  		     
  		 -  LEFT OUTER JOIN  
  		    left��� ���� FROM ������ ������ ���� �Ǵ� ù ��° ���̺��� ����.
  		        ���� ���̺��� �������� JOIN, ������� A���̺��� ��� �����Ϳ� 
  		    A���̺�� B���̺��� �ߺ��Ǵ� ���� �˻�.
  		  
  		 - RIGHT OUTER JOIN(RIGHT JOIN)
  		 right��� ���� FROM ������ ������ ������ �Ǵ� �� ��° ���̺��� �����Ѵٴ� ��
  		 LEFT OUTER JOIN�� �ݴ��Դϴ�.
  		 ������ ���̺��� �������� JOIN, ������� B���̺��� ��� �����Ϳ� 
  		 A���̺�� B���̺��� �ߺ��Ǵ� ���� �˻�   
  		 */
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
//    	 String sql = "SELECT * FROM JNTEST1 CROSS JOIN JNTEST2";
//    	 String sql = "SELECT * FROM JNTEST1, JNTEST2";
//    	 String sql = "SELECT * FROM JNTEST1 T1 INNER JOIN JNTEST2 T2 ON T1.ID = T2.ID";
//    	 String sql = "SELECT * FROM JNTEST1 T1, JNTEST2 T2 WHERE T1.ID = T2.ID";
//    	 String sql = "SELECT * FROM JNTEST1 T1 LEFT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID"; 
    	 String sql = "SELECT * FROM JNTEST1 T1 RIGHT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID"; 
    	 return sql;
     }
}
