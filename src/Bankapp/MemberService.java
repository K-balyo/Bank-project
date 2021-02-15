package Bankapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Bankapp.Member;
import db.DBAction;

public class MemberService {
	public Member members; 
	public Connection conn;
	public Statement stmt;
	public MemberService() { 
//    Member member = new Member("홍길동", "abc", "123", 0); 
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/app?"
//				+ "characterEncoding=UTF-8&serverTimezone=UTC";
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, "root", "java");
//			stmt = conn.createStatement();
//		}catch(ClassNotFoundException e ) { 
//			e.printStackTrace();
//		}catch(SQLException ex) {
//			ex.printStackTrace();
//		}
//		createMember();
		
		DBAction db = DBAction.getInstance();
		conn = db.getConnection();
		try {
			stmt = conn.createStatement();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	Member member;
    public boolean login(String id, String pw) {
    	boolean result = false;
//    	String sql = "SELECT NAME,ID, PW FROM MEMBER WHERE ID = '" + member.getId() 
//    	+ "' AND PW = '" + member.getPw() + "'";
//    	String sql = "SELECT NAME,ID, PW FROM MEMBER WHERE ID = '" + id 
//    	+ "' AND PW = '" + pw + "'";
    	String sql = "SELECT NAME,ID, PW FROM MEMBER WHERE ID = '" + id 
    	    	+ "'";
    	ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String r_pw = rs.getString("PW");
				if (pw.equals(r_pw)) {
					String name = rs.getString("NAME");
					member = new Member();
					member.setName(name);
					member.setName(id);
					member.setName(pw);
					System.out.println(member.getName() + "님");
					result = true;
				} else {
					System.out.println(" PW X " );
				}
			} else {
            	System.out.println(" ID X " );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
    		try {
    		    if(rs != null) rs.close();
    			if(stmt != null)stmt.close();
    			if(conn != null)conn.close();
    		}catch(Exception e) {}
    	}
    	
//    	if(id == members.getId() && pw == members.getPw()) {       // if(id.equals(member.getId())&& pw.equals(member.getPw()){ 도 가능   		
//    		System.out.println(members.getName() + "님");
//    		result = true;
//    	}else {
//    		System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
//    	}
    		return result;
    }
    public void createMember() {
    
//	    String name = text1.getText(); 
//
//		String id = text2.getText();
//
//		String pw = value1.getText();
//
//		int balance = 1000;
    	Member member = new Member("000000", "홍길동", "abc", "123", 0); 
//    	Member member = new Member(name, id, pw, balance);
    	String sql = "INSERT INTO MEMBER VALUES ('" + member.getNum() + "', '"  
                                    + member.getName() + "', '" 
    			                    + member.getId() + "', '" 
                                    + member.getPw() + "', " 
    			                    + member.getBalance() + ")";
    	try {
    		stmt.executeUpdate(sql);
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}finally {
    		try {
//    		    if(rs != null) rs.close();
    			if(stmt != null)stmt.close();
    			if(conn != null)conn.close();
    		}catch(Exception e) {}
    	}
    	
    }
}
