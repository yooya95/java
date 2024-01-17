package ch07;
//*복습대상
class Parent33 {
	Parent33() {
		System.out.println("1. 매개변수 없는 조상 생성자 Parent3");		
	}
	Parent33(int x) {
		this(); //자신 Class의 생성자로 호출한다
		System.out.println("매개변수 1개 Parent3: x = " + x);
	}
}

class Child33 extends Parent33 {
	public Child33() { // 기본생성자 생성
		System.out.println("3. Child3 Bsic Constructor ");
	}
	Child33(int x) {
		// Parent3 기본 생성자  *** 부모생성자를 생성자를 호출하는 로직이 없다면, 부모의 기본생성자라도 호출한다!!***
		// super(X) 아버지한테 감
		System.out.println("2. Child3 매개변수 1개 Child3: x = " + x);
	}
	Child33(int x, int y) {
		this(x); //자신 Class의 생성자
		System.out.println("3. Child3 매개변수 2개 부모: x= " + x + ",y"+y);
	}
}

class Child55 extends Child33 {
	
	Child55 (int x, int y) {
		//super(x, y); //Child3 Class의 2개 매개변수 생성자 >> 기본생성자로 감
		System.out.println("4.Child5 매개변수 2개 자식: x= " + x + ",y"+y);
	}
	void cc5() {
		System.out.println("Child5 cc5 메소드...");
	}
}

public class Super3_mod {

	public static void main(String[] args) {
		Child55 child55 = new Child55(7,15);
	}

}