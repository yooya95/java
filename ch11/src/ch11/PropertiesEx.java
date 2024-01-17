package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pt = new Properties();
		
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		System.out.println("1-1 path : "    + path);
		path = URLDecoder.decode(path,"utf-8");
		System.out.println("1-2 path :"      + path);
		pt.load(new FileReader(path));
		String driver = pt.getProperty("driver");
		System.out.println("2.드라이버 :"       +driver);
		String url = pt.getProperty("url");
		System.out.println("3.url :"       +url);
		String username = pt.getProperty("username");
		System.out.println("4.username :"      +username);
		String password = pt.getProperty("password");
		System.out.println("5.password :"      +password);
		
	}

}
