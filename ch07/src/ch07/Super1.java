package ch07;

class parent {
	int       a = 7;
	int       b = 7;
	void display() {
		System.out.println("Parent 대박");
	}
	void print() {
		System.out.println("Parent 난 부모 print 메소드");
	}
}

class Child extends parent {
	int       a = 10;
	
	@Override
	void print() {
		super.print();
		System.out.println("Child 부모멤버 a = "+super.a); //7
		System.out.println("Child 난 자식 메소드 a = "+a); //This가 생략된 것으로 봄 
		System.out.println("Child 난 자식 메소드 b = "+b);		
		System.out.println("=========== ");
		
		}
}


public class Super1 {

	public static void main(String[] args) {
		Child child = new 	Child();
		child.print();
		child.display();
		

	}

}
