package hw;

public class MyExceptiionEx2 {

	public static void main(String[] args) {
		
		
		try {
			int num = Integer.parseInt(args[0]);
			if     (num>1000)  throw new MyExceptiion2();
			if(num<150)  throw new MyExceptiion1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java MyExceptiionEx2 num1");
		} catch (MyExceptiion1 e) {
			System.out.println(e.getMessage());
		} catch (MyExceptiion2 e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {e.getMessage();
			
		}
		
		// 과제 --> 150 < 급여 < 1000
				// 급여 --> args[0]
		        // 1. 사용방법이 틀림 (오버라이딩x)
				//    실행 매개값의 수가 부족합니다.
				//    [실행 방법]
				//    java MyExceptionEx2 num1 
				
		// 2. 최저임금 오류  --> MyException1
				//    사장님 150만원 보다 적어요 !! 이 뭡니다
			
		// 3. 최고임금 오류  --> MyException2 
				//    사장님 1000만원 넘 많아요
	

}

	
	}
