package homework;

public class VarArr02 {

	public static void main(String[] args) {
		
		int[][] a = {{12,34,32},      //행이 3개 열이 4개 행의 합계와 평균 값을 구하는 것임 0,0 0,1 0,2
				     {21,54,76,23,},  //1,0 1,1 1,2
				     {12,65}          //2,0 2,1
		            };
		
		int maxcol = 0;
		for (int i =0; i <a.length; i++) {
			if(maxcol<a[i].length)
				maxcol = a[i].length;
		}
		
		int[]cols =new int[maxcol];
		for(int i=0; i<a.length; i++) {
			int sum=0;
			for(int j=0; j<a[i].length; j++) { 
				sum += a[i][j]; 
				cols[j]+=a[i][j];
				System.out.print(a[i][j]+"\t");	
				} 
			
			System.out.print("합계 :"+sum+"\t");
			System.out.println();
				
			} 
		

	}

}

		
		
		// 2차원 가변 배열을 향상형 for 문으로 구현하기
		// 결과 
			//	12	34	32	    합계:78	  평균:26  //행의 합계 평균
			//	21	54	76	23	합계:174	  평균:43
			//	12	65	        합계:77	  평균:38
		
