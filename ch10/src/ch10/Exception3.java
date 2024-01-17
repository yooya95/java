package ch10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception3 {

	public static void main(String[] args) {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int num1;
			int i = 0;
			try {
				i++;
				if(i>3) break;
				System.out.print("첫 번째 값을 입력하세요 => ");
				num1 = Integer.parseInt(in.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				// 출력 후 라인 바꿈
				System.out.println(num1 + " / " + num2 +" = " + num1/num2);
				
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해야 합니다."+e.getMessage());
		
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누면 안돼요."+e.getMessage());
			
			} catch (Exception e) {
				System.out.println("값을 잘못 입력했습니다."+e.getMessage());
			}	
			
		}

	}

}
