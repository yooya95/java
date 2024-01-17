package ch02;

public class FloatDoubleExam {

	public static void main(String[] args) {
		//실수값 저장
		float var2 = 3.14f;
		double var3 = 3.14;
		System.out.println("var2: " + var2); //var2: 3.14
		System.out.println("var3: " + var3); //var3: 3.14
		
		//정밀도 테스트 double이 더 정확한 수치까지 나옴
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		System.out.println("var4 :" + var4); //var4 :0.12345679
		System.out.println("var5 :" + var5); //var5 :0.12345678901234568
	
		
	}

}
