package ch04;

public class SumAvgMaxMin {

	public static void main(String[] args) {
		// 76,45,34,89,100,50,90,92 8개의 값을 1차원 배열로 초기화 하고 값에 
		// 합계와 평균	그리고 최대값과 최소값을 구하는 프로그램을 작성
		int sum = 0, avg = 0, max = 0, min = 100; //최소, 최대 거꾸로 했음
		
		int []a = {76,45,34,89,100,50,90,92}; 
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i] > max) max = a[i];  //a[i]와 max(0)를 비교하여 a[i]가 더 크면 max= a[i] // a[i]를 max에 할당한다 
			if (a[i] < min) min = a[i];  //a[i]와 min(100)를 비교하여 a[i]가 더 작으면 min= a[i] // a[i]를 min에 할당한다 
		}	
		avg = sum / a.length;	
		

		System.out.println("합계 = "+ sum + "평균 = " + avg);
		System.out.println("최대값은 = " + max + "최소값은 = " +min);
	}


		
}


