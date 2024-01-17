package ch09;


public class String2 {

	public static void main(String[] args) {
		char[] c = {'k','o','r','e','a'};
		System.out.println("c->"+ c);
		System.out.println(c);
		
		String str1= new String(c);
		System.out.println("str1->"+str1);
		String str2 = new String("Fighting");
		System.out.println("str2->"+str2);
		String str3 = str1 + str2;
		System.out.println("str3->"+str3);
		
		System.out.println(2+0+2+3+"년"); 
		System.out.println("연1:"+2+0+2+3);
		System.out.println("연2:"+2+0+2+3);
		
	
	}

}
