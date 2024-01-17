package ch08;
// 책이 한권이라는 가정
public interface Lenderable {
	// 상태값 표시(상수)
	int BORROW = 1; //빌려간 상태
	int NORMAL = 0; // 대여 가능상태
	
	void checkout(String borrower, String date);
	void checkin();
	
}

class SeperateVolume implements Lenderable {
	String title;		// 초기 생성시 값 입력 --> 젊은 베르테르 슬픔
	String date;		// 2022/07/25
	String borrower;	// 정승환/박윤하
	int    status;		// 상태값   0 (초기값이 들어가지 않기 때문에 0으로 먼저 들어가서 ㄷBORROW로 시작)
	
	SeperateVolume(String title) {
		this.title = title;
	}
	
	// 책 대여
	@Override
	public void checkout(String borrower, String date) {
		if (status != NORMAL) return;
		this.date    =  date;
		this.borrower = borrower;
		status 		  = BORROW;
		
		System.out.println(borrower + "가" + date+"일에" + title+"을 대여했다");
	}
	
	// 책 반환
	@Override
	public void checkin() {
		if (status != BORROW) return;
		System.out.println(borrower +"rk "+title+"을 반납했다");
		date   	= null;
		title   = null;
		borrower= null;
		status  = NORMAL;  //0
		
	}
}