package ch04;

public class AdvancedForExam {
//향상형for문
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		               //95 ,71,84,93,87
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
