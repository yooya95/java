package ch07;
// 면접 단골*** overLoading & overRideing
public class Car2 {
	int a = 7;
	void move() {
		System.out.println("차 이동...");		
	}
}

// 상속1 : 클래스를 상속할 때는 익스텐스
class Bus extends Car2 {
	int a = 25;
	
	@Override
	void move() {
		System.out.println(" 40명 태우고 이동");
	}
}
//상속2
class Ambulance extends Car2 {
	int a = 100;
	@Override
	void move() {
		System.out.println("사이렌 울리며 이동");
	}
	void special() {
		System.out.println("환자를 태우고 있다");
	}
	void printa() {
		System.out.println("Ambulance a->"+this.a);
	}
}
//상속3
class FireEngine extends Car2 {
	int a = 11;
	@Override
	void move() {
		System.out.println("물 뿌리면서 이동");
	}
}