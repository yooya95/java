package ch13;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명을 입력");
		String fileName = sc.nextLine();
		FileReader fr = new FileReader(fileName);
		int data = 0;
		while((data=fr.read())!= -1) {
			System.out.print((char)data);
		}
		fr.close();
		System.out.println("출력 끝");
		
		sc.close();
	}

}
