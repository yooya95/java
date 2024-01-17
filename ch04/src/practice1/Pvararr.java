package practice1;

public class Pvararr {
// 행별 합계와 평균 구하기 (for문 , 향상형 for문)
	public static void main(String[] args) {
		
		int [][]a= {{12,34,32},{21,54,76,23},{12,65}};
		int [] sum = new int[a.length];
		int avg = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
				sum[i] += a[i][j];
			}
		avg = sum[i]/a[i].length;
		System.out.println("합계: " + sum[i] + "\t평균: " + avg);
		}
	
		
	System.out.println("======향상형 for문 연습============="); //System.out.println("합계: " + tot + "\t평균: " + ave);
	
		int [][]b= {{12,34,32},{21,54,76,23},{12,65}};
		
		int ave=0;
		for(int[]num:b) {
			int tot=0;
			for(int num1:num) {
				System.out.print(num1+"\t");
				tot+=num1;
			}
		ave= tot / num.length;
		System.out.println("합계: " + tot + "\t평균: " + ave);
		}
		
	}

}



// 2차원 가변 배열을 향상형 for 문으로 구현하기
// 결과 
	//	12	34	32	    합계:78	  평균:26  //행의 합계 평균
	//	21	54	76	23	합계:174	  평균:43
	//	12	65	        합계:77	  평균:38
