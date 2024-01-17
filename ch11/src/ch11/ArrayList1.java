package ch11;
//list 순서가 있는 데이터 집합, 중복을 허용한다.
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("고양이");
		a1.add("길양이");
		a1.add("강아지");
		a1.add("진돗개");
		a1.add("고양이");
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("=========향상형============");
		for(String str : a1) {
			System.out.println(str);
		}
	}

}
