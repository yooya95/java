package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OraDr {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		//							        IP      Port Service ID >> 바꿔줘야하는 부분
		//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@172.30.1.77:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";   //localhost 는 내pc임
		 
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Start");
			if (conn != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
