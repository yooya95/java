package ch03;

public class Switch02 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]); //arg[]값은 무조건 0으로! 0이 첫번째, 1이 두번째 run 할때 한값만 입력하면 에러뜸
		String grade = "";
		
		switch (score/10) {
			case 10 :
			case 9 : grade = "A";
			break;
			case 8 : grade = "B";
			break;
			case 7 : grade = "C";
			break;
			case 6 : grade = "D";
			default: grade = "F";	
		}
		System.out.println("점수 Case는"+score/10+" 이고 학점은 "+ grade);
	}

}
