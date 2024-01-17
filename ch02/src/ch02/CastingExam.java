package ch02;

public class CastingExam {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; //강제 타입변환 (큰>작은)
		System.out.println(charValue); //가 44032 유니코드

		long longValue = 500L;
		intValue = (int) longValue; //강제 타입변환 (큰>작은)
		System.out.println(intValue); //500 
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //강제 타입변환 (큰>작은)
		System.out.println(intValue); // 3
	
	
	}

}
