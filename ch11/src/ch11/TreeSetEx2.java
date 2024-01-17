package ch11;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		int i = 0;
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(52);
		ts.add(24);
		ts.add(72);
		ts.add(34);
		ts.add(52);
		
		for(Integer t : ts) {
			i++;
			System.out.println(i+"번째 t-->"+t);
		}
	}

}
// set 순서는 보장하지 않고, 중복은 허용하지 않는다!