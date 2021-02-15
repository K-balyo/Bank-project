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
			System.out.println("데이터베이스 연결 성공!");
			stmt = conn.createStatement();
			//Select 문
//			String sql = select();
//			rs = stmt.executeQuery(sql);
			
			/*
			if(rs.next()) {    //where 문에는 if 아니라면 while
				String name = rs.getString(1); // 1 은 컬럼 인덱스 1부터시작함 MEMBER 테이블에서는 name 부터
				String id = rs.getString(2);  // 2는 두번째 ID
				String pw = rs.getString(3);  // pw
				int balance = rs.getInt(4); //balance
				System.out.println("이름 : " + name
						    + " ID : " + id
				            + " PW : " + pw
                            + " Balance : " + balance);
//				String balance = rs.getString(4); 
//              balance  이렇게도 쓸 수 있음 데이터베이스에서 넘어올떄 문자열로 넘어와서
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
			System.out.println("데이터베이스 연결 실패");
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
		//ID 필드값 입력
//		System.out.print("select ID : ");
//		String id = scan.next(); 
//		//PW 필드값 입력
//		System.out.print("select PW : ");
//		String pw = scan.next();

//		String sql = "SELECT * FROM MEMBER";  // * 모든 컬럼을 선택하는 코드
//		String sql = "SELECT NAME, ID, PW, BALANCE FROM MEMBER";  // ID랑 PW 몽땅 가져왕    "SELECT 빈칸 FROM DBTEST"  빈칸에 조건 넣기
//		String sql = "SELECT FROM DBTEST WHERE ID = '1' && PW = '1'";
//		String sql = "SELECT * FROM MEMBER WHERE ID = '" + id + "' && PW = '" + pw + "'";
		String sql = "SELECT * FROM MEMBER";
		return sql;
			
	
	}

}
