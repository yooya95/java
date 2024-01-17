package ch03;
//파라미터(입력값)을 이용한 예제
public class If02 {

	public static void main(String[] args) {   //main Parameter 함수 -> Int로 변환 수행 파라미터는 입력값을 말함..
		int a = Integer.parseInt(args[0]);	   // integer.parseint() 는 자바에서 문자열을 정수로 변환하기위해 만드는 방
		if (a > 0) {
			System.out.println(a+"는 양수");
		}
		else {
			System.out.println(a+"는 음수");
		}
		System.out.println("프로그램 종료");

	}

}


//메소드는 자판기에 돈을 넣으면 커피가 나온다와 같은 작업을 코드로 정의해 놓으것
//이렇게 만들어진 메소드를 만들면 그때그때 호출하여 사용할 수 있음.
//파라미터란 입력값을 말함
//예를들면 전화를 거는 작업이라고 가정
//1. 번호를 누른다 >> 파라미터 
//2. 전화가 걸린다.
