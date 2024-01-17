package ch10;

import java.util.Scanner;

public class MyExceptionEx {

	public static void main(String[] args) {
		int kkk = 0;
		// 1. 객체선언
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자 입력?");
		try {
			kkk = sc.nextInt();
			if (kkk > 10) throw new MyException();
			
		} catch (MyException e) {
			System.err.println("MyException-->"+e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception-->"+e.getMessage());	
		}
		System.out.println("kkk->"+kkk);
	}

}
