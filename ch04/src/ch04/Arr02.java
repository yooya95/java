package ch04;

public class Arr02 {
// 연습 배열의 크기가 5인 배열을 생성하고, 일반형 for문과 향상형 for문을 사용하여  나타내시오. 실습문제
	public static void main(String[] args) {
		int[] a = new int[] {23,45,67,789,2};
		System.out.println("------일반 For문 -----------");
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]"+ "=" + a[i]);
		}
		System.out.println("------향상형 For문-----------");
		for(int kk : a) {
			System.out.println("kk = "+kk);
		}
	}
}