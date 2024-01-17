package ch08;

public class Inter1EX {

	public static void main(String[] args) {
		//반드시 추상메소드가 해결된 아이만 new 생성자 가능함
		//Inter1 implClass1 = new Inter1(); x 추상메소드 해결안됨
		ImplClass1 implClass1 = new ImplClass1();
		implClass1.display();
		implClass1.print();
		

	}

}
