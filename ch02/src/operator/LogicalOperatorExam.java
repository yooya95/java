package operator;
//논리연산자 코딩 실습 and는 둘다 or는 하나만   
public class LogicalOperatorExam {

	public static void main(String[] args) {
		int charCode = 'A';                            //'A'타입을 정수로 선언 > 65
		
		                                               
		
	      if( (charCode>=65) && (charCode<=90) ) {      //and조건 설계 65보다 크거나같고  90보다 작거나같으면 "대문자 이군요"
	          System.out.println("대문자 이군요");         // "대문자 이군요" >성립
	       }
	       
	       if( (charCode>=97) & (charCode<=122) ) {    //and조건 설계 97보다 크거나 같고 122보다 작거나 같으면 "소문자 이군요"
	          System.out.println("소문자 이군요");          // X
	       }
	       
	       if( !(charCode<48) && !(charCode>57) ) {    //and조건 설계 48보다 크거나 같고 57보다 작거나 같으면 "0~9 숫자 이군요"
	          System.out.println("0~9 숫자 이군요");      // X
	       }

	       int value = 6;
	       
	       if( (value%2==0) || (value%3==0) ) {               //or 조건 설계 6으로 나눴을 때의 나머지가 0이거나 3으로 나눴을 때 나머지가 0이면
		          System.out.println("2 또는 3의 배수 이군요");    // "2 또는 3의 배수 이군요"
		       }
	             
	    }

}