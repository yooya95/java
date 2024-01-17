package ch02;

public class VariableExchangeExam {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		// x:3, y,5
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		// x: 5, y:3
		// 11라인: 변수 x값 3을 변수 temp에 저장
		// 12라인: 변수 y값 5를 변수 x에 저장
		// 13라인: 변수 temp값 3을 y에 저장

	}

}
