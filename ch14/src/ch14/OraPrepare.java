package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드 ?");	   String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명 ?");		String dname = sc.nextLine();
		System.out.println("입력할 Oracle 근무지 ?");		String loc = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//	String sql = "Insert Into dept values("+ deptno+",'"+dname+"','"+loc+"')"; 위와 같은 의미
		String sql = "Insert Into dept values(?, ?, ?)";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger"); 
			pstmt = conn.prepareStatement(sql); //sql 추가 //스니핑을 위해서 sql 인젝션을 보안하는데 많은 도움을 준다.
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			//result는 작업에 성공한 갯수
			int result = pstmt.executeUpdate(); //입력/수정/사제시->executeUpdate
			if (result >0)System.out.println("입력성공 ^^");
			else 		  System.out.println("입력실패 T.T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (pstmt != null)pstmt.close();
			if (conn != null)conn.close();
		}
		sc.close();
		
		
		
	}

}
