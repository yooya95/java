package ch03;
// do =while문 / while 01과 비교해서 보기
// do while 은 false 값일 경우 종료하지만, while은 false일경우 조건식으로 돌아가서 반복됨. 
// do while 권유! (false일 경우 오류값을 발견할 수 있음)
public class Do01 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		do {                                           //1까지의 합은 1
			sum += i;
			System.out.println(i + "까지의 합" + sum);
			i++; 		                               //2까지의 합은 .... 1ㅐ까지의 합
		} while( i <=10);
		System.out.println("합계:" + sum);

	}

}

// do while문을 이용하여 1까지의 합, 2까지의 합, 3까지의합 ... 10까지의 합을 나타내고, 
// 총 합계의 값을 나타내시오  