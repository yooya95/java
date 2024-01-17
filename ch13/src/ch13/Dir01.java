package ch13;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file = new File("."); //.은 현재 나의 폴더 ..은 상위 폴더
		//C:\Java Programming\Sources\ch13\src\ch13
		File file = new File("../ch13/src/ch13");
		String[] fileList = file.list();
		for(String str : fileList) {
			System.out.println("file->"+str);
		}
	}

}
