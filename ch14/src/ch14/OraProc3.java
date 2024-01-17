package ch14;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc3 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 Oralce 사원 코드 ?"); 		
		String empno = sc.nextLine();
		
		Connection         conn = null;
		CallableStatement  cs   = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		//LocalHost - > 127.0.0.0.1 port번호 : 1521 xe(orcl) -> service ID(sid) 
		String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		

		//procedure Call 할 때의 Format
		String sql = "{? = call func_sal(?)}";

		try {
			Class.forName(driver); //없어도 될 수 있음, 연결 되어있따면
			conn  = DriverManager.getConnection(url, "scott","tiger");
			cs    = conn.prepareCall(sql);
			cs.setString(2, empno);
		// cs.registerOutParameter(1, java.sql.Types.DOUBLE); //변경급여
		// cs.executeQuery();	
		// Double   sal = cs.getDouble(1);	
			cs.registerOutParameter(1, java.sql.Types.INTEGER); //변경급여
			cs.executeQuery();
			int		sal 	= cs.getInt(1);
			
			if (sal >0 ) {
				System.out.println("Oracle CallableStatement 수정 성공 ^ ^");
				System.out.println("변경 사번    : " + empno);
				System.out.println("변경 급여    :"  +  sal);
				}
			else  System.out.println("Oracle CallableStatement 수정 실패 ㅠ.ㅠ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	finally {
				if (cs    != null )cs.close();
				if (conn  != null )conn.close();
				
		}
		sc.close();
	}

}
