package ch08;
//-------------------------------------------------------
//인터페이스는 1) 양식의 역할( 큼) 함 , 
//      2) 다중상속 지원(극히 일부분..)
//      3) class 와 class 를 연결 해줌 (중요)++ 이역할
//-------------------------------------------------------
public interface Robot {
	//무	
}

class DanceRobot implements Robot {
	void dance() {
		System.out.println("춤을 춥니다");
	}
}

class DrawRobot implements Robot {
	void draw() {
		System.out.println("그림을 그립니다");
	}
}

class SingRobot implements Robot {
	void sing() {
		System.out.println("노래를 부릅니다");
	}
}