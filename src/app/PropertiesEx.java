package app;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args)throws Exception { 
		Properties properties = new Properties();
		String path = PropertiesEx.class.getResource
				("database.properties").getPath();
		//PropertiesEx.class.getResource("detabase.properties").getPath();
		path= URLDecoder.decode(path, "utf-8"); //데이타 손실을 발생하지 않기 위한 코드
		properties.load(new FileReader(path));
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
		
	}
}
