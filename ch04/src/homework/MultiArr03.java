package homework;

public class MultiArr03 {

	public static void main(String[] args) {
		
		String[] m = {"이름","국어","영어","수학","총점","평균"}; //행크기 6 
		String[] name = {"김준수","이하이","안예은","국카스텐"};   //열크기 5
		int[][] score = {{80, 70, 90},
				         {70,90,90},
				         {80,70,80},
				         {90,90,70}
				         };
		
	
		int [] sum = new int [score.length]; 
		int [] colSum = new int[score[0].length];
		int avg = 0; 
		int totalAvg = 0; 
		int totSum = 0;

		System.out.println("                   성적표");
		for (int i=0; i<m.length; i++) {
			System.out.print(m[i]+"\t");	
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {	
				System.out.print(score[i][j]+"\t");
				sum[i] += score[i][j];	
				colSum[j] += score[i][j];
				}
				avg = sum[i]/score[i].length;
				System.out.print(sum[i]+"\t");
				System.out.print(avg);
				System.out.println();
				totSum += sum[i];
				
			}
		System.out.println("-----------------------------------------------");
		
		System.out.print("총계"+"\t");
		for (int kk : colSum) {
			System.out.print(kk +"\t");
		}
		System.out.print(totSum+"\t");
			int numSubject = m.length-3;
			int numStudent = name.length;
			
			
			totalAvg = (totSum / numSubject) / numStudent;
			
		System.out.print(totalAvg);
		
	}

}


//이름	국어	영어	수학	총점	평균	  
//--------------------------------------------
//김준수	80	70	90	240	80
//이하이	70	90	90	250	83
//안예은	80	70	80	230	76
//국카스텐	90	90	70	250	83
//--------------------------------------------
//총계	    320	320	330	970	80