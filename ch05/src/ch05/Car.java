package ch05;
// class를 설계도 (필드=인스텬스 변수와 메서드로 구성되어있음)
public class Car {
	
	// Member, 인스턴스 변수 ,피드 차에는 색깔이나 속도를 정할 수 있음
	// 같은 인스턴스 변수끼리 공유 가능함
	String color;
	int 	speed;
	
//	public Car() { //생성자 조건은 클래스와 동일명으로 설정
//		// TODO Auto-generated constructor stub
//  }
	
	//method 멤버 변수, 필드가 동작하게 만듬
	void speedUp() {
		speed++;
		System.out.println(speed+"속도를 올렸다.");
	}
	void speedDown() {
		speed--;
		System.out.println(speed+"속도를 내렸다.");
	}
	void print() {
		System.out.println("색깔: "+color);
		System.out.println("속도: "+speed);
	}
}



// void는 return(반환되는) 되는 타입이 없음을 의미
// 메소드에 리턴값이 존재한다면


//클래스의 구성요소
// 필드는 클래스에 포함된 변수
// 메소드는 특정 작업을 수행하기위한 문장들의 집합, 함수같은 개념, 
// 언제든지 필요할 때 써서 가지고올 수 있음
// 셍성자(객체)는 인스턴스 초기화메소드

// 생성자의 역할 
// 1. 메모리 할당
// 2. 멤버 변수와 필드를 초기화 시켜줌


