package ch15;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("--SuperRobot 주문--");
		Robot superRobot = new SuperRobot();
		superRobot.actionBasic(); //"팔, 다리, 머리, 몸통 존재."
		superRobot.shape(); //shape 날 수 있습니다
		superRobot.actionFly();  //날수 있음
		superRobot.actionFire(); //미사일 발사
		superRobot.actionknife(); 

		System.out.println("--------------------");
		System.out.println("--StandardRobot 주문--");
		Robot standRobot = new StandardRobot();
		standRobot.actionBasic();
		standRobot.shape();
		standRobot.actionFly();
		standRobot.actionFire();
		standRobot.actionknife();
		
		
		System.out.println("------------------");
		System.out.println("-- CheapRobot 주문--");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.actionBasic();
		cheapRobot.shape();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionknife();
	}

}

///-- SuperRobot 주문  --
/*
-- SuperRobot 주문  --
팔, 다리, 머리, 몸통 존재.
shape 날수 있습니다
날수 있어요.
미사일 발사
Lazer검 있음.
--------------------
--StandardRobot주문--
팔, 다리, 머리, 몸통 존재.
달릴 수 있습니다.
날수 없어요
미사일 발사
목검 있음.
--------------------
-- CheapRobot 주문 --
팔, 다리, 머리, 몸통 존재.
걷을 수 있습니다.
날수 없어요
미사일 발사 기능 없음
칼 No
*/