package ch14;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc1 {

	public static void main(String[] args) throws SQLException {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("입력할 Oracle 부서코드 ?");	   String deptno = sc.nextLine();
		   System.out.println("입력할 Oracle 부서명 ?");  	   String dname  = sc.nextLine();
		   System.out.println("입력할 Oracle 근무지 ?");  	   String loc    = sc.nextLine();
		   
		   Connection         conn = null;
		   String driver = "oracle.jdbc.driver.OracleDriver";
			// Localhost -> 127.0.0.1; , Port 번호:1521  , xe(orcl)-> Service ID(Sid)
		   String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		   // PROCEDURE 호출객체
		   CallableStatement cs = null;
		   
		   String sql    = "{call dept_Insert(?, ?, ?)}";  
		   
		   try {
			   Class.forName(driver);
			   conn = DriverManager.getConnection(url,"scott","tiger");
            cs = conn.prepareCall(sql);
			   cs.setString(1, deptno);
			   cs.setString(2, dname);
			   cs.setString(3, loc);
			   // Boolean resultBool 적용 --> parameter 전환 고려  			   
			   boolean resultBool  = cs.execute();
			   System.out.println("Oracle CallableStatement Boolean 입력 성공 ^ ^ ");
			   // 나중처리 
//			   if ( resultBool) System.out.println("Oracle CallableStatement Boolean 입력 성공 ^ ^ ");
//			   else             System.out.println("Oracle CallableStatement Boolean 입력 실패 T.T ");
			   
		   }catch(Exception e) {
			   System.out.println("Exception->"+e.getMessage());
		   } finally {
				  if( cs   != null ) cs.close();
				  if( conn != null ) conn.close();
		   }
		   sc.close();
		   
	}

}
