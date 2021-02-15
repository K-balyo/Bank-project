package db;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import app.PropertiesEx;

public class DBAction {
	private static DBAction instance = new DBAction();
	private Connection conn;
	public DBAction() {
		/*�ǽ�1 properties
		try {
			Properties properties = new Properties();
			String path = DBAction.class.getResource
					("database.properties").getPath();
			path= URLDecoder.decode(path, "utf-8"); //����Ÿ �ս��� �߻����� �ʱ� ���� �ڵ�
			properties.load(new FileReader(path));
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			Class.forName(driver);
			conn =DriverManager.getConnection(url, username, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
//		�ǽ�2 JDBC �⺻ //��� ����� ����
		 String driver = "com.mysql.cj.jdbc.Driver";
//		 String url = "jdbc:mysql://192.168.0.157:3306/user20?"
//					+ "characterEncoding=UTF-8&serverTimezone=UTC";
		 String url = "jdbc:mysql://localhost:3306/app?"   //��� ���� 44���̶� ���� Ȱ��ȭ �������
				+ "characterEncoding=UTF-8&serverTimezone=UTC";
		try {
			Class.forName(driver);
//			conn = DriverManager.getConnection(url, "user20", "user");
			conn = DriverManager.getConnection(url, "root", "java"); //���� �ڵ�
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		
	}
	public static DBAction getInstance() {
		if(instance == null)
			instance = new DBAction();
		return instance;
	}
	public Connection getConnection() {
		return conn;
	}
	public void close() {
		try {
			if( conn != null ) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
