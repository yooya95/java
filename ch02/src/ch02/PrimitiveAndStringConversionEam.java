package ch02;

public class PrimitiveAndStringConversionEam {

	public static void main(String[] args) {
		int value1      = Integer.parseInt("10");
		//int value11   = int.parseDouble("A1");
		double value2   = Double.parseDouble("3.14");
		boolean value3  = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		//System.out.println("value11: " + value11);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		int valueA      = 10;
		double valueB   = 3.14;
		boolean valueC  = true;
		
		String str1 = String.valueOf(valueA); //valueof는 값을 모두 문자열로 변변환시켜줌
		String str2 = String.valueOf(valueB);
		String str3 = String.valueOf(valueC);
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		
	}

}
