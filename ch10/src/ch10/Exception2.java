package ch10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int num1;
			
			try {	
				System.out.print("첫 번째 값을 입력하세요 => ");
				num1 = Integer.parseInt(in.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				// 출력 후 라인 바꿈
				System.out.println(num1 + " / " + num2 +" = " + num1/num2);
				
			} catch (Exception e) {
				System.out.println("값을 잘못 입력했습니다."+e.getMessage());
			}	//System.out.println("0 나은 세상을 위해 노력하고 있습니다");
		
			// 출력 후 라인 바꿈
			
		}
	}

}
