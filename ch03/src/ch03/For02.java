package ch03;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		int  num = System.in.read() - '0'; //in은 아스키코드를 읽음
		// 아스키코드) 만약 5를 입력하면, 53(코드값)임
		//            0은        48(코드값)임
		// 결론   :  53 - 48 = 5가 됨
		// 따라서 5단이 나올 수 있도록 for문 구현됨
		
		// 선택한 구구단이 나올 수 있도록 for문 구현
		for (int i = 1; i<=9; i ++) {
			System.out.println(num + " * " +i+ " = "+num*i);
		}
	}

}
// system.in.read() 
// read() 메서드는 한글은 입력받지 못하고 영어, 숫자, 특수문자등을 입력받을 수 있음숫자 하나를 받아서 그대로 입력하고자 할때 사용 >> 아스키코드로 값을 받고, int 형으로 받는다.