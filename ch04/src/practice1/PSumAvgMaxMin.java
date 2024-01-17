package practice1;

public class PSumAvgMaxMin {
	// 76,45,34,89,100,50,90,92 8개의 값을 1차원 배열로 초기화 하고 값에 
	// 합계와 평균	그리고 최대값과 최소값을 구하는 프로그램을 작성
	public static void main(String[] args) {
		
		int[] arr = {76,45,34,89,100,50,90,92};
		
		int sum = 0, avg = 0, max = arr[0], min=arr[0];
		for(int i =0; i<arr.length; i++) {
			sum+= arr[i];
			if (arr[i]>max)
				max=arr[i];
			if (arr[i]<min)
				min=arr[i];	
		}
		avg = sum / arr.length;
		
		System.out.println("합계: "+ sum+" 평균:"+ avg); 
		System.out.println("최대값: "+ max +" 최소값:"+ min); 
		}

}



