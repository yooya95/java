package ch05;
//car와 같이보기
public class CarEX {

	public static void main(String[] args) {
		// 선언         생성   >car의 class를 사용하기 위해서 선언,생성을 해야함
		Car myCar = new Car();
		// 기본생성자 생성 (다른 생성자가 없을 경우에만!)
		// 생성자의 역할은 메모리 할당(기본생성자의 경우), 메모리 변수, 초기화
		// car .java의 public car()을 시행시킴
		// mycar - 메모리를 할당받아서 태어난 인스턴스라고 함
	
		
		myCar.color = "빨강";
		myCar.speed = 200;
		myCar.speedUp(); //>>void speedup 값 출력
		myCar.print();   //>>void print 값 출력
		
		// 1. 선언
		Car yourCar;
		yourCar = new Car();
		yourCar.color = "초록";
		yourCar.speed = 150;
		yourCar.speedDown();
		yourCar.print(); //>>void print 값 출력	
		yourCar.speedDown();
	}

}
