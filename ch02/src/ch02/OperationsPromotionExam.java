package ch02;
//연산식에서자동타입변환
public class OperationsPromotionExam {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//컴파일 에러 byte byteValue3 = (byteValue1 + byteValue2);
		//byte 유지 후 컴파일 에러 수정하려면? byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); //30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		System.out.println(charValue2+1);
		// 컴파일 에러 char charValue3 = charValue1 + charValue2;
		// char 유지 후 컴파일 에러 수정하려면? char charValue3 = (char) (charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2; //'A'의 유니코드 값 65 + 1(10진수로 저장)
		System.out.println("유니코드=" + intValue2); //유니코드 =66
		System.out.println("출력문자=" + (char)intValue2); //출력문자 = 정수를 유니코드 문자로 변환 66의 유니코드 문자는 B임
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);  //2 (정수 타입이기 때문에 소숫점은 나타낼 수 없음)
	
		int intValue5 = 10;
		//컴파일 에러 
		//int intValue6 = 10 / 4.0; // 정수와 실수가 같이 쓰였기 때문에 double 타입으로 변환
		double doubleValue = intValue5 /4.0;  //intValue 값은 10.0이 됨
		System.out.println(doubleValue); //2.5
		
		
		int x = 1;   //하기 double 1.0 인식
		int y = 2;   //하기 double 2.0 인식
		double result = (double)x/y; // 1.0/2.0
		System.out.println(result);    //0.5
		
	}

}
