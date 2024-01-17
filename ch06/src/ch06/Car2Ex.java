package ch06;

class Car2 {
	String     name;
	String     color;   
	int 	   speed; 

	public Car2(String name, String color, int speed) {
	
	//   this 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음
	//   인스턴스(멤버)변수와 Parameter(지역변수)를 구별하기 위해 참조변수 this사용
	//   인스턴스변수    지역변수
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void print() {
		System.out.println(name + "\t" + color + "\t"+speed );
	}

	
	// void는 return값을 받을 필요가 없음
	// int 타입은 return값을 지정해 주어야 함
	
	int speedUp(int speed) {
		int incSpeed = speed +10;
		System.out.println("incSpeed->"+incSpeed);
		return incSpeed;
	}
}
	

public class Car2Ex {

	
	public static void main(String[] args) {
		Car2 c1 = new Car2("소나타","빨강",150);
		c1.print();
		int methodSpeed = c1.speedUp(c1.speed);
		System.out.println("Main methodSpeed ->"+methodSpeed);
		c1.print();
	}

}
