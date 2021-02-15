package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//�Խ��� ����� �Խù� 10���� ���̰� ������ �з� �Ϸ��� �̰� ���� ��
public class DBEx16 {
    /*
	BETWEEN (����) : a AND b ���� a�� b�� ������(inclusive)
	                                �� ������ ��� ���� �ش��ϴ��� ���θ� �������� �Ѵ�.
	      [�ǽ� ���̺� �����] : BWTEST
	      CREATE TABLE BWTEST(
	      IDX INT,
	      BIRTH DATE,
	      NAME VARCHAR(10));
	      [���ڵ� �߰�]
	      INSERT INTO BWTEST VALUES(1, '2020-01-01', 'ȫ�浿');
	      INSERT INTO BWTEST VALUES(2, '2020-01-02', '�̼���');
	      INSERT INTO BWTEST VALUES(3, '2020-01-03', '������');
	      INSERT INTO BWTEST VALUES(4, '2020-02-01', '������');
	      INSERT INTO BWTEST VALUES(5, '2020-02-02', 'ĥ����');
	      INSERT INTO BWTEST VALUES(6, '2020-03-01', '������');
	      INSERT INTO BWTEST VALUES(7, '2020-03-02', '������');
	*/
	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql =select();
//		��������) 2020-01-02 ~ 2020-01-08 ������ ���ڵ带 �����Ͻÿ�.
//		Limit :���� ����
//		ex1) 1~n;
//		String sql = "SELECt * FROM BWTEST LIMIT n"; ó�� ������ n�� ���� ���� ��
//		String sql = "SELECT * FROM BWTEST LIMIT n OFFSET n2"; n ���� ���� ������  n��  
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			for(int i = 1; i <= columnCnt; i++) {
				String columnName = rsmd.getColumnName(i);
				System.out.print(columnName + "\t");
			}
			System.out.println("\n-------------------------------");
			while(rs.next()) {
				for(int i = 1; i <= columnCnt; i++) {
					String columnValue = rs.getString(i);
					System.out.print(columnValue);
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
//		String sql = "SELECT * FROM BWTEST WHERE IDX BETWEEN 2 AND 5";
//		String sql = "SELECT * FROM BWTEST WHERE IDX >= 2 AND IDX <= 5";
//		 ��������
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2020-01-02' AND '2020-01-08'";//1-1  1-2 �� ��������
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH >= '2020-01-02' AND BIRTH <= '2020-01-08'";//1-2
//		String sql = "SELECt * FROM BWTEST LIMIT 4";
//	    String sql = "SELECT * FROM BWTEST LIMIT 2 OFFSET 5"; //3-1
//	    String sql = "SELECT * FROM BWTEST LIMIT 5, 2"; // 3-2
	    String sql = "SELECT * FROM BWTEST ORDER BY idx desc LIMIT 5, 2"; // ���� ���� �������� ����
		return sql;
	}

}
