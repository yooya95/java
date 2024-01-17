package ch08;

public class LenderableEx {

	public static void main(String[] args) {
		SeperateVolume SV = new SeperateVolume ( "젊은 베르베르 슬픔");
		SV.checkout("정승환/박윤하", "2023/07/25");
		SV.checkin();
		

	}

}
