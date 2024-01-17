package ch03;
//파라미터(입력값)을 이용한 예제2
public class If03 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		// 문자열 선언
		String grade = "";
		if (score > 90 )     grade = "A";
		else if(score >= 80) grade = "B";
		else if(score >=70)  grade = "C";
		else grade = "F";
		
		System.out.println("당신점수는 "+ score + "이고" + " 학점은 "+grade+"입니다");

	}

}

//grade 라는 문자열을 선언함 ,  학점의 등급을 표현할 것