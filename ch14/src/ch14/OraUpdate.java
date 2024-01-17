package ch14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate {


	public static void main(String[] args) throws SQLException  {
		   // DEPT TBL상의 deptno  해당 내용을 dname , loc로 수정 
		   Scanner sc = new Scanner(System.in);
		   System.out.println("수정할 부서를 입력하세요 ?"); String deptno = sc.nextLine();
		   System.out.println("부서명?");               String dname  = sc.nextLine();
		   System.out.println("근무지?");  	          String loc   = sc.nextLine();
		   String sql = 
					String.format ("Update Dept set dname ='%s',"
			   	           	+  "loc='%s' where deptno=%s",dname,loc,deptno);
	 
		   String driver = "oracle.jdbc.driver.OracleDriver";
		   String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		   Connection conn = null;
		   Statement  stmt = null;
			   
		   try {
				   Class.forName(driver);
				   conn = DriverManager.getConnection(url,"scott","tiger");
				   stmt = conn.createStatement();
				   // result는 작업에 성공한 갯수 
				   int result = stmt.executeUpdate(sql); // 입력/수정/삭제시 -> executeUpdate
				   if (result > 0 ) System.out.println("수정성공 ^^");
				   else             System.out.println("수정실패 T.T");
		   } catch(Exception e) {
//					   System.out.println(e.getMessage());
				  e.printStackTrace();
		   }finally {
				   if (stmt != null) stmt.close();
				   if (conn != null) conn.close();
		   }
		   sc.close();
	}

}
	
//DEPT TBL상의 deptno  해당 내용을 dname , loc로 수정