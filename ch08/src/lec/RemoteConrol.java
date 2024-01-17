package lec;
//java 8 이상
public interface RemoteConrol {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn() ;
	void turnOff() ;
	void setVolume(int volume);
	
	//디폴드 메소드
	default void SetMute (boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제합니다.");		
		}
	}
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	
	
	}
		
		
}

/// 일반적으로 인터페이스는 추상메소드로 구성되어있지만, 자바 8버전 이후로는 디폴드와 정적 메소드도 사용가능