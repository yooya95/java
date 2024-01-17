package ch02;

public class IntegerLiteralExam {

	public static void main(String[] args) {
		int var1 = 0b1011; //2진수(앞에 0b) 1*2의3승+..
		int var2 = 0206;   //8진수(0) 2*8의2승 + ..
		int var3 = 365;	   //10진수(안붙을때)
		int var4 = 0xB3;   //16진수(0x) 11*16의 1승+3*16의 0승
		
		System.out.println("var1: " + var1); //var1: 11
		System.out.println("var2: " + var2); //var2: 134
		System.out.println("var3: " + var3); //var3: 365
		System.out.println("var4: " + var4); //var4: 179

		
				
				
	}

}
