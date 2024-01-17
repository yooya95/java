package ch03;
//scanner do while 다시 공부해보자!
import java.util.Scanner;

public class Do03 {

	public static void main(String[] args) {
		// 1. 객체선언
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0, num; //cnt는 몇번째 맞췄는지
		int answer = (int) (Math.random()*100)+1;
		do {
			System.out.println("1~100중 어떤 숫자일까요? "); //1~100정수
			//num = sc.nextInt();
			//2. 관련 method 사용 이름과 비슷한 메서드를 만드는 것이 좋음
			// Math.random()은 0-1사이의 숫자를 렌덤으로 출력시킴
			num = sc.nextInt();
			if(answer == num) {
				System.out.println(cnt+"번에 맞췄습니다 축하!!");
				break; // do while 문에 이렇게 빠져나오는 구문이 없으면 잘못 된 것 ,
			} else if (answer > num) {
				System.out.println("더 큰 수를 입력하세요");
			} else System.out.println("작은 수를 입력하세요");
			cnt ++;
		} while (true);
		sc.close();
		
	}

}

//(int)(Math.random() *(최댓값-최소값+1) + 최소값
