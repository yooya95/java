package ch03;

public class Switch03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String season = "";
		// 12,1,2 ->겨울2,3
		// 3,4,5  ->봄
		// 6,7,8  ->여름
		// 9,10,11 ->가을
		// else --> 무어라
		switch (num) {
			case 12 :
			case 1  :
			case 2  : season = "겨울";
			break;
			case 3  :
			case 4  :
			case 5  : season = "봄";
			break;
			case 6  :
			case 7  :
			case 8  : season = "여름";
			break;
			case 9   :
			case 10  :
			case 11  : season = "가을";
			break;
		default : season = "무어라";
		break;
		
		}
		
		System.out.println(num+"월은 "+ season +"입니다");

	}

}
