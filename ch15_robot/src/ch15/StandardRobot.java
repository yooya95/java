package ch15;

import actions.FireOk;
import actions.FlyNo;
import actions.knifeWithWood;

public class StandardRobot extends Robot {

	
	public StandardRobot() {
		fireAction = new FireOk();
		flyAction = new FlyNo();
		knifeAction = new knifeWithWood();
	}

	@Override
	public void shape() {
		System.out.println("달릴 수 있습니다.");
		
	}


	
}
