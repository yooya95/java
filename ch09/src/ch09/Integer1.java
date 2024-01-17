package ch09;

public class Integer1 {

	public static void main(String[] args) {
		String str = "3";
		//원시Data int 반환
		int   int1 = Integer.parseInt(str);
		// Integer 객체 반환
		int   int2 = Integer.valueOf("5");
		System.out.println("int1->"+int1);
		System.out.println("int2->"+int2);
		System.out.println("int1+int2->"+(int1+int2));
	}

}
