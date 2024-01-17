package lec;

public class Television implements RemoteConrol {
//	필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume>RemoteConrol.MAX_VOLUME) {
			this.volume = RemoteConrol.MAX_VOLUME;
		} else if(volume<RemoteConrol.MIN_VOLUME) {
			this.volume = RemoteConrol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 :" + this.volume);		
	}

}
