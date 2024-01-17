import java.sql.Connection;
import java.sql.DriverManager;

public class MyDr {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url 	  = "jdbc:mysql://127.0.0.1:3306/scottdb";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,"root","mysql80");
			if (conn !=null) {
				System.out.println("mysql 연결 성공");
			}conn.close();
		} catch (Exception e) {
			System.out.println("mysqul 연결 실패" +e.getMessage());
		}
	}

}
