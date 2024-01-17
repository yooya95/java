package operator;
//비교연산자 코딩실습
public class CompareOperatorExam {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);               // true
		boolean result2 = (num1 != num2);               // fasle
		boolean result3 = (num1 <= num2);               // true
		
		System.out.println("result1="+result1); 	   // reuslt1=true
		System.out.println("result2="+result2); 	   // reuslt2=false
		System.out.println("result3="+result3); 	   // reuslt3=true
		
		char char1 = 'A';                              // 코드 65
		char char2 = 'B';                              // 코드 66
		boolean result4 = (char1 < char2);             // true
		System.out.println("result4="+result4);        // result4=true
		
	}

}
