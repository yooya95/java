package ch15;

import actions.FireNo;
import actions.FlyNo;
import actions.KnifeNo;
//유지보수 편이성을 향상시킬 수 있다.
public class CheapRobot extends Robot {


	public CheapRobot() {
		flyAction = new FlyNo();
		fireAction = new FireNo();
		knifeAction = new KnifeNo();
}

	@Override
	public void shape() {
		System.out.println("걸을 수 있습니다.");
		
	}

}
