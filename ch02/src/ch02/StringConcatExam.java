package ch02;

public class StringConcatExam {

	public static void main(String[] args) {
		// 숫자연산
		int value = 10 + 2 + 0;
		System.out.println("value "+ value);
	
		//결합연산
		// 1. 10+2 수행
		// 2. 12 + "8" >> 둘다 문자열(String)으로 취급해버림
		String str1 = 10 + 2 + "8";
		System.out.println("str1 "+ str1);
	
		String str2 = 10 + "2" + 8;
		System.out.println("str2 "+ str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 "+ str3);
	
		String str4 = "10" + (2 + 8);
		System.out.println("str4 "+ str4);
	}
	

}
