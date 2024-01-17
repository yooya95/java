package ch06;

public class Computer {
 //배열의 주소값을 넘겨줌, call by reference
	// int sum1(int[] values) {
	
	double sum1(int[] values) {	
		int sum = 0; //지역변수
		double avg = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		avg = (double)sum / values.length;
		//return sum;
		return avg;
	}


//  가변변수를 먼저 잡아버리면 끝이 없음.. 먼저 잡으면 안됨
	//           kk는 1 , 나머지는 가변변수
	int sum2(int kk,int ... values) {
		int sum = 0;
		System.out.println("kk ->"+kk);
		// 내부적->배열처리     1,2
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}


}
