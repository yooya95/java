package ch02;

public class BoolExam {

	public static void main(String[] args) {
		int var1 = 5;
		Boolean boolvar = true;
		
		// boolvar true 일때 수행
		if(boolvar) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			
			System.out.println("if var1->"+var1); //if var1->10
			System.out.println("if var2->"+var2); //if var2->20
			
		}
		System.out.println("main var1 -> "+var1); //main var1 -> 10
	}

}
