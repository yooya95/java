package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		//HashSet은 중복된 값을 허용하지 않음,중복된 표범은 추가되지 않음
		HashSet<String> hs = new HashSet<>();
		hs.add("표범");
		hs.add("사자");		
		hs.add("호랑이");
		hs.add("하이에나");
		hs.add("표범");
		
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("=================");
		// hs.iterator() 메서드를 사용하여 hs의 요소에 접근하기 위한 Iterator<String> 타입인 it 객체를 생성합니다.
		Iterator<String> it = hs.iterator();
		
		//it.next() 메서드를 사용하여 출력후 이를 통해 hasset에 있는 요소들이 순차적으로 출력됨
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
