package ch08;

interface Interfa2 {
	void ifa2();	
}
//인터페이스끼리 상속받을 때는 extends  // 클라스끼리 상속받을때도 extends 
interface Interfa21 extends Interfa2 {
	void ifa21();
}

interface Interfa22  extends Interfa21 {
	void ifa22();

class ImplClass2 implements Interfa22 {

	@Override
	public void ifa22() {
		System.out.println("ImplClass2 Interfa22의 메소드");		
	}

	@Override
	public void ifa21() {
		System.out.println("ImplClass2 Interfa21의 메소드");	
		
	}

	@Override
	public void ifa2() {
		System.out.println("ImplClass2 Interfa2의 메소드");	
		
	}
	
}	
	
	public class Inter2 {

	public static void main(String[] args) {
		ImplClass2 implClass2 = new ImplClass2();
		implClass2.ifa2();
		implClass2.ifa21();
		implClass2.ifa22();
		System.out.println("------Interfa21 interfa21 사용가능 범위");
		Interfa21 interfa21 = new ImplClass2();
		interfa21.ifa21();
		//  interfa21.ifa22();
	}	
		
	}

}
