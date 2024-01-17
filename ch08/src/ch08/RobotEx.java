package ch08;
//확인해보기
public class RobotEx {
	
	static void action(Robot r) {
		if( r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		} else if(r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}else {
			//(SingRobot)r).sing(); 아래와 같은 로직
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}
	
	public static void main(String[] args) {
		Robot[] rb = new Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot ();
		rb[2] = new SingRobot ();
						//DanceRobot ,DrawRobot, SingRobot
		for(Robot r : rb) {
			action(r);
		}

	}

}
