package ch03;

public class While01 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		while ( i <=10) {
			// sum = sum + i
			sum += i; // 0+1+2+3+....+10
			System.out.println(i+"까지 합"+ sum);
			i ++;
		}
		System.out.println("총합계:" + sum);
	}

}
