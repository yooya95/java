package ch04;

public class Arr01 {
//배열 코딩실습
	public static void main(String[] args) {
		// 크기가 5인 배열 a 생성
		int[] a = new int[5]; 
		a[0] = 7;  //0에는 7을 넣고.. 
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 234;
		//size 측정 --> a.length
		for(int i=0; i < a.length; i++) {
			System.out.println("a[" +i+"] = " + a[i]);
		}
		
		
		int[] b = new int[5];
		b[0]=7;
		b[1] = 34;
		b[2] = 67;
		b[3] = 6;
		b[4] = 234;
		for(int i=0; i < b.length; i++) {
			//System.out.println("b[" +i+"] = " + b[i]);
			System.out.printf("b[%d] = %d" , i, b[i]); 
			//포인터와 배열 ???이건 뭐야... printf는 16진수로 출력 가능함
			//%d 10진수 정수형식  .{%5d] 5자리 출력, 오른쪽 정렬, -5이면 왼쪽 정렬 05d면 빈곳에 0codna
			System.out.println();
		}
	}

}
