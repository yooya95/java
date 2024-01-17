package ch15;

import actions.FireOk;
import actions.FlyOk;
import actions.KnifeWithLazer;


public class SuperRobot extends Robot {

	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
	}
	@Override
	public void shape() {
		System.out.println("shape 날 수 있습니다.");
	}

	
}
