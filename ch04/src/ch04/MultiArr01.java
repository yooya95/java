package ch04;

public class MultiArr01 {
//3차원 배열 확실히 해오기
	public static void main(String[] args) {
		int[][] score = {{80,70,90},
						 {70,90,90},
						 {80,70,80},
						 {90,90,70}
						};
		System.out.println("score.length[행의 개수]->"+score.length);
		for(int i = 0; i < score.length; i++ ) {
			//System.out.println("score[i].length[열의 개수]->"+score[i].length);
			for(int j = 0 ; j <score[i].length; j++) {
		
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	
	}

}
