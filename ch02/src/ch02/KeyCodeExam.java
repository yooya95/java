package ch02;

import java.io.IOException;

public class KeyCodeExam {

	public static void main(String[] args) throws IOException {
		int keyCode;
		int keyCode2;
		int keyCode3;
		
		System.out.println("keyCode를 입력해 주세요");
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode2 = System.in.read();
		System.out.println("keyCode2: " + keyCode2);
		
		keyCode3 = System.in.read();
		System.out.println("keyCode3: " + keyCode3);
		
		
	}

}
