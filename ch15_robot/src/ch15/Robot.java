package ch15;
import actions.FireAction;
// 패키지가 달라서 관련 내용이 IMPORT 되어짐
import actions.FlyAction;
import actions.KnifeAction;

//객체변수를 멤버변수로 선언
public abstract class Robot {
	public FlyAction   flyAction;
	public FireAction  fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {
		
	}
	
	public abstract void shape() ;
	
	public void actionBasic() {
		System.out.println("팔, 다리, 머리, 몸통 존재.");
	}
	
	// 비행기능
	public void actionFly() {
		flyAction.fly();
	}
	// 미사일 기능
	public void actionFire() {
		fireAction.fire();
	}
	
	// 칼부림 기능
	public void actionknife() {
		knifeAction.knife();
		

		
	}
}
