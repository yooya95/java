package ch05;

//설계도
class Car1 {
	String     color;    //Member 변수, 인스턴스 변수, 같은 인스턴스 끼리 공유 가능
	int 	   speed;    //초기값 안넣으면 0로 잡힘
	
	//**매우중요함 static 변수 선언/ 클래스 내의 모든 인스턴트들이 공유하는 변수 -->Class 멤버 변수
	//클라스 변수는 인스턴스 생성 전에 쓸 수 있음
	static int wheel;

	//메소드 - 지역변수, 필드가 동작하게 만듬, 메소드 내에서만 사용 가능
	void speedUp() {
		speed++;
		System.out.println(speed+"속도를 올렸다.");
	}
	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		System.out.println("바퀴: "+ wheel);
	}
}
			
// 선언	
public class Car1Ex {	
	
	
	public static void main(String[] args) {
		// c2.speed = 200; (안되는거)
		Car1.wheel= 8; // class 호출, wheel은 정적변수
		System.out.println("UFO wheel: "+Car1.wheel);
		//c1과 c2는 바퀴가 없음에도 표시됨
		
		// 선언      생성
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		//c1.rain = 5;
		c1.color = "빨강";
		c1.speed = 200;
		c2.color = "노랑";
		
		c1.print();
		c2.print();
		

	}

}
