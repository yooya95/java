package ch07;
// *복습대상
class Parent3 {
	Parent3() {
		System.out.println("1. 매개변수 없는 조상 생성자 Parent3");		
	}
	Parent3(int x) {
		this(); //자신 Class의 생성자로 호출한다
		System.out.println("매개변수 1개 Parent3: x = " + x);
	}
}

class Child3 extends Parent3 {
	Child3(int x) {
		//상속 관계에서 생성자를 호출 할때는 무조건 부모 클래스의 생성자가 먼저 호출되어야 하는데, 
		// 부모생성자를 생성자를 호출하는 로직이 없다면, 부모의 기본생성자라도 호출한다!!***
		// super(X) 아버지한테 감
		System.out.println("2. Child3 매개변수 1개 Child3: x = " + x);
	}
	Child3(int x, int y) {
		this(x); //자신 Class의 또다른 생성자 호출 
		System.out.println("3. Child3 매개변수 2개 부모: x= " + x + ",y"+y);
	}
}

class Child5 extends Child3 {
	
	Child5 (int x, int y) {
		super(x, y); //Child3 Class의 2개 매개변수 생성자
		System.out.println("4.Child5 매개변수 2개 자식: x= " + x + ",y"+y);
	}
	void cc5() {
		System.out.println("Child5 cc5 메소드...");
	}
}

public class Super3 {

	public static void main(String[] args) {
		Child5 child5 = new Child5(7,15);
	}

}
