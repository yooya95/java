package ch03;

public class For01 {

	public static void main(String[] args) {
		int sum = 0;
		// 초기값은 for문 전체에 단 한번 수행, 그 이후에 수행범위 체크 그다음부터는 증감값 수행범위 수행
		//      초기값     수행범위   증감값
   		for (int i = 1; i <=10; i ++) {
			sum += i; //sum = 0+1+2+3
			System.out.println(i+"까지 함: "+ sum);
   		}
		System.out.println("합계:" + sum);
	}

}
 
 	// 초기값 i=1 대입
	// i는 10보다 작같음
	// 1++ =2
    // 1까지의 합은 1
    // i= 2 대입
    // i 는 10보다 작같음
    // 2++ =3
   //  2까지의 합은 1+2 = 3 ............
