package ch04;

public class ArrCopy {
//배열복사 실습문제 
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int [10]; //10개의 방만 {1,2,3,4,5,6,7,0,0,0} 
		//System.out.println(b);
		System.out.println("------------------1-----------");
		System.arraycopy(a, 0, b, 0, a.length);
		//a의 0번째부터 시작해서 복사를 하는데 a.length(7개)만큼 b의 0번째만큼 복사를 해라
		//b의 결과값 {1,2,3,4,5,6,7,0,0,0} 
		
		pr(a); //a배열이 가지고있는 주석값을 넘김
		pr(b); //b는 방이 10개이기 때문에 없으면 0
		cls(b); // b배열의 값 초기화
		System.out.println("-------------------2-----------");
		System.arraycopy(a, 0, b, 2, a.length);
		//a의 0부터 b의 2부터  a.length 만큼 copy
		//{0,0,1,2,3,4,5,6,7,0}
		pr(b);
		cls(b);
		System.out.println("-------------------3-----------");
		System.arraycopy(a, 1, b, 0, a.length-1);
		//a의 1부터 b의 0으로  a.length-1 만큼 copy
		//{2,3,4,5,6,7,0,0,0}
		pr(b);
		System.out.println("-------------------4-----------");
		System.arraycopy(a, 1, b, 3, a.length-1);
		//a의 1부터 b의 3으로  a.length-1 만큼 copy
		//{0,0,0,2,3,4,5,6,7,0}
		pr(b);
		cls(b);
		
	}
	
	//                       {1,2,3,4,5,6,7}
	//						 {1,2,3,4,5,6,7,0,0,0} 
	public static void pr(int[] kk) {
		for (int i = 0; i <kk.length; i ++) {
			System.out.print(kk[i] + "\t");
		}
		System.out.println();
		
	}
	//모든 원소 0으로 초기화
	//                            {1,2,3,4,5,6,7,0,0,0}
	public static void cls(int[] arr) {
		for (int i =0; i<arr.length; i++) { //arr.length = 10개값
			arr[i] = 0;
		}
	}



}
