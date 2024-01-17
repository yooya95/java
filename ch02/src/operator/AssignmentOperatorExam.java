package operator;
//대입연산자 코딩 실습 
public class AssignmentOperatorExam {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10;                            //0=0+10  
		System.out.println("result=" + result);  //result=10
		
		result -= 5;                             // 10= 10-5
		System.out.println("result=" + result);  // result=5
		
		result *= 3;                             // 5=5*3
		System.out.println("result=" + result);  // result=15
		
		result /= 5;                             // 15=15/5
		System.out.println("result=" + result);  // result=3
		
		result %= 3;                             // 3=3%3
		System.out.println("result=" + result);  // result=0
	}

}
 
      // 변수 연산식 피연산자 >> 변수=변수 연산식 피연산자