package operator;
// 산술연산자(4칙연산자) 실습
public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);    // 5+2=7

		int result2 = v1 - v2;
		System.out.println("result2=" + result2);    // 5-2=3

		int result3 = v1 * v2;
		System.out.println("result3=" + result3);    //5*2=10

		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);    //5/2=2

		//***중요 %는 나머지
		int result5 = v1 % v2;                       //5%2=1
		System.out.println("result5=" + result5); 
		
		double result6 = (double) v1 / v2;           //5/2=(실수값)2.5
		System.out.println("result6=" + result6);
		// 정확하게 소숫점까지 확인해야 하는 상황에서 
		
	}

}
