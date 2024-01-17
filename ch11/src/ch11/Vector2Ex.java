package ch11;

import java.util.Vector;

public class Vector2Ex {

	
	
	public static void print(Vector<String> vc) {
		for (String str : vc) {
			System.out.print(str + "\t");
		}
		System.out.println("\n-------------------------------------------");
	}
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		vc.add("수박");
		vc.add("고주");
		vc.add("수박");
		vc.add("대추");
		vc.add("오이");
		System.out.println("갯수 : " +vc.size());
		print(vc);
		
		//2번 자리에 끼워 넣기 가능하다 (대체아닌 끼워넣기!)
		vc.add(2,"키위");
		print(vc);
		vc.set(3, "참외");
		print(vc);
		vc.remove(1);
		print(vc);
		System.out.println("2번 인덱스 -->" +vc.get(2)); //인덱스 2에 해당하는 '요소' 반환
		System.out.println("수박 문의(포함여부) : "+vc.contains("수박")); //  contains는 true/false 반환
		System.out.println("수박 문의(Index) : "+vc.indexOf("수박")); //수박의 위치(인덱스 반환)
		
		System.out.println("수박 문의 :" + vc.lastIndexOf("수박")); //수박이 마지막으로 등장하는 위치(인덱스 반환)
		
	}
}
