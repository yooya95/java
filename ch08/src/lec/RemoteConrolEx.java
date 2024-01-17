package lec;

public class RemoteConrolEx {

	public static void main(String[] args) {
		//1. 선언
		RemoteConrol rc  = null;
		RemoteConrol rc2 = null;

		//2. Television 메모리할당
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(13);
		rc.SetMute(true);
		RemoteConrol.changeBattery();
		
		//3. Audio 메모리 할당
		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(13);
		rc2.SetMute(true);
		RemoteConrol.changeBattery();
			
			
		
		
	}

}
