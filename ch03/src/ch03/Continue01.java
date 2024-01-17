package ch03;

public class Continue01 {

	public static void main(String[] args) {
		for (int i =0; i<10 ; i ++) {
			System.out.println("대뱍 i = " + i);
			if (i>5) continue; //계속 대박이는 반복시행 
			System.out.println("쪽박 i = " + i);
		}

	}

}


// 컨티뉴는 로직의 첫구문으로 가서 계속 반복