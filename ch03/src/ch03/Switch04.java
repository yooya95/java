package ch03;

public class Switch04 {

	public static void main(String[] args) {
		// 1. parameter 3개 받음
		String str = args[0];
		int a1 = Integer.parseInt(args[1]);
		int b1 = Integer.parseInt(args[2]);
		// 2. 사칙연산 수행  
		//   + -> System.out.println("덧셈: "+ (a1 + b1 ))
		//   - -> System.out.println("뺄셈: "+ (a1 - b1 ))
		//   X -> System.out.println("곱셈: "+ (a1 * b1 ))
		//   / -> System.out.println("나눗셈: "+ (a1 / b1 ))
		//   % -> System.out.println("나머지: "+ (a1 % b1 ))
		// default  : System.out.println("없는연산자: "+ (a1 + b1 ));
		switch(str) {
			case "+" : System.out.println("덧셈: : "+ (a1 + b1));
			break;
			case "-" : System.out.println("뻴셈: "+ (a1 - b1));
			break;
			case "X" : System.out.println("곱셉: "+ (a1 * b1));
			break;
			case "/" : System.out.println("나눗셈: "+ (a1 / b1));
			break;
			case "%" : System.out.println("나머지: "+ (a1 * b1));
			break;
			default  : System.out.println("없는연산자: " + (a1 + b1));
			
			
				
		
		}
		

	}

}
