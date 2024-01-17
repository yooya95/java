package ch14;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OraSelect2 {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		//Localhost -> 127.0.0.1;, Port 번호:1521   ,xe(orcle)->Service ID(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql  = "Select empno, ename, NVL(job, '업무좀 줘') JOB, sal, hiredate From emp"; //nvl 은 널값을 대체할 수 있음.
		Connection conn  = null; //DB
		Statement  stmt  = null; //SQL
		ResultSet  rs    = null; //**select로 조회했을 때는 resultset으로 받음!!
		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무\t\t 급여\t 일자");
		System.out.println("==============================================");
		
		
		try {
			Class.forName(driver); //Driver
			conn  = DriverManager.getConnection(url,"scott","tiger");
			stmt  = conn.createStatement(); //stmt
			rs    = stmt.executeQuery(sql); //SQL 
			if(rs.next()){
				do {
					int    empno     = rs.getInt(1);
					String ename     = rs.getString(2);
					String  job      = rs.getString(3);
					int    sal      = rs.getInt("SAL");
					Date   date      = rs.getDate("hiredate");
					if (job.length()>7)
						 System.out.printf("%d \t%s\t%s\t%d\t%TF\n",empno,ename,job,sal,date);
					else System.out.printf("%d \t%s\t%s\t\t%d\t%TF\n"  ,empno,ename,job,sal,date);
				}while (rs.next());
			}
			else {
				System.out.println("data no");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());	
		}finally {
			if (rs     !=null) rs.close();
			if (stmt   !=null) stmt.close();
			if (conn   !=null) conn.close();
		}
	}
}

/*사원명단
사원코드	 사원명	 업무		 급여	 일자
===========================================
7369 	SMITH	CLERK		800	1980-12-17
7499 	ALLEN	SALESMAN	1600	1981-02-20
7521 	WARD	SALESMAN	1250	1981-02-22
7566 	JONES	MANAGER		2975	1981-04-02
7654 	MARTIN	SALESMAN	1250	1981-09-28
7698 	BLAKE	MANAGER		2850	1981-05-01
7782 	CLARK	MANAGER		2450	1981-06-09
7788 	SCOTT	ANALYST		3000	1987-07-13
7839 	KING	PRESIDENT	5000	1981-11-17
7844 	TURNER	SALESMAN	1500	1981-09-08
7876 	ADAMS	CLERK		1100	1987-07-13
7900 	JAMES	CLERK		950	1981-12-03
7902 	FORD	ANALYST		3000	1981-12-03
7934 	MILLER	CLERK		1300	1982-01-23
1100 	강한빛	PRESIDENT	3500	NULL
1000 	강준우	CLERK		3000	2023-07-13
*/