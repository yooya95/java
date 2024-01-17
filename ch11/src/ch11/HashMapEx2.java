package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
	HashMap<String, String> hm = new HashMap<>();
	hm.put("손흥민", "010-3333-3333");
	hm.put("조정은", "010-3456-7890");
	hm.put("김준수", "010-2222-3456");
	
	Set<String> st = hm.keySet();
	for(String str : st) {
		System.out.println(str+"의 전화[Set]-->"+hm.get(str));
	}
	
	System.out.println("======Iterator HashMap 조회===========");
	Iterator<String>it = hm.keySet().iterator();
	while(it.hasNext()) {
		String key = it.next();
		System.out.println(key +"의 전화 -->"+hm.get(key));
	}
	
	}
}	
// map 은 순서는 유지 되지 않기 때문에 무작위로 나옴 , key 중복값 허용x value 중복값 허용
