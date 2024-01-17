package ch09;

//equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만
//==     연산자는 비교하고자 하는 대상의 주소값을 비교
public class String1 {

	public static void main(String[] args) {
		String a1 = "Java"; //String 객체에 문자열 리터럴을 저장
		String a2 = "Java";
		String a3 = new String ("Java"); //문자열 상수를 생성자에 전달해서 String 객체를 생성한 예
		String a4 = new String ("java");
		System.out.println(a1 +","+ a2 +","+ a3);
		//== 연산자는 비교하고자 하는 대상의 주소값
		if (a1 == a2) System.out.println("==a1과 a2는 같다");
		else 		  System.out.println("==a1과 a2는 다르다");
		if (a1 == a3) System.out.println("==a1과 a3는 같다");
		else 		  System.out.println("==a1과 a3는 다르다");
		
		//equls 메소드는 비교하고자 하는 대상의 내용 자체를 비교
		if (a1.equals(a2)) System.out.println("equals  a1과 a2는 같다");
		else 		       System.out.println("equals  a1과 a2는 다르다");
		if (a1.equals(a3)) System.out.println("equals  a1과 a3는 같다");
		else 		       System.out.println("equals  a1과 a3는 다르다");
	
		if (a1.equals(a4)) System.out.println("a1과 a4는 같다");
		else 		       System.out.println("a1과 a4는 다르다");
		// 대소문자 무시
		if (a1.equalsIgnoreCase(a4)) System.out.println("a1과 a4는 같다");
		else 		       System.out.println("a1과 a4는 다르다");
	}




}
