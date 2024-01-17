package operator;

public class SignOperatorExam {
//부호연산자(+,-) 코딩실습
	public static void main(String[] args) {
		int x = -100;
		System.out.println("x->" + x);               //x -> -100
		
		int result1 = +x;                            //result1 = +1 * -100  ->-100
		int result2 = -x;    					     //result2 = -1 * 100   ->100
		System.out.println("result1=" + result1);    //result1 = -100
		System.out.println("result2=" + result2);    //result2 = 100
		
		byte b = 100;							     
		int result3 = -b; 						     // reslt3 = -1*100 ->-100
		System.out.println("result3=" + result3);    // reuslt3=-100
	}

}
