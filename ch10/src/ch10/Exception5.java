package ch10;
//** 공부해보기 예외 class 계층구조도 한번 확인해보기50
public class Exception5 {
	static void method(boolean  b) {
		try {
			System.out.println(1 + "b-->"+ b);	
			if(b) throw new ArithmeticException();
			System.out.println(2);
		//예외가 발생하면 실행되지 않는 문장
		} catch (RuntimeException r) {
			System.out.println("RuntimeException" + "-->" + 3);
			return;
		// 메서드를 빠져나간다.(finally블럭을 수행한 수에)
		} catch (Exception e) {
			System.out.println(4);
			return;	
		} finally {
		// 예외발생여부에 관계없이 항상 실행되는 문장
			System.out.println("예외발생여부에 관계없이 항상 실행되는 문장" + 5);
			
		}
		System.out.println("정상적으로 끝나야 실행되는 문장 ");
	
	}
	public static void main(String[] args) {
		method(true);
		method(false);

	}

}
