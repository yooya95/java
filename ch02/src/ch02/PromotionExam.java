package ch02;

public class PromotionExam {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입변환됨 작은>큰
		System.out.println("intValue :" + intValue);  //int: 10
		
		char charValue = '가';
		intValue = charValue; //자동 타입변환됨 작은>큰 가의 유니코드 값으로 변환
		System.out.println("가의 유니코드: "+ intValue); // 가의유니코드:44032
		
		intValue = 50;
		long longValue = intValue; //작은>큰 타입변환, 
		System.out.println("longValue : "+ longValue); //longValue : 50
		
	
		longValue = 100;
		float floatValue = longValue; //작은 > 큰 타입변환, 정수>실수
		System.out.println("floatValue : "+ floatValue); // floatValue : 100.0
		
		floatValue = 100.5F;
		double doubleValue = floatValue; //작은 > 큰 타입 변환,
		System.out.println("doubleValue : "+ doubleValue); //doubleValue : 100.5

		
	}

}
