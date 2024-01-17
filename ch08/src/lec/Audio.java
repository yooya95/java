package lec;

public class Audio implements RemoteConrol {
//	필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

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
		System.out.println("현재 Audio 볼륨 :" + volume);
	}   // volume이 this 가 아님 차이점 확임 >> 지역변수인지 필드변수인지?? 비교해보기!
	

}
