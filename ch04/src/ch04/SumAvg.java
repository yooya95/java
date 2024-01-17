package ch04;

public class SumAvg {

	public static void main(String[] args) {
		int []a= {85,90,75,100,95};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {  
			sum += a[i];
		}
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum/a.length);
	}

}


//    a.length:배열 길이 확인 =5임 
  //>>85,90,75,100,95 총 5개