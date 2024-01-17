package ch11;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		String[] pet = {"강아지","야옹이","물고기","야옹이"};
		
		Stack<String> st = new Stack<>();
		
		for(String str : pet) {
			System.out.println("push-->"+str);
			st.push(str); //st.push(str)을 사용하여 요소 st 스택에 추가
		}
		System.out.println("-----1--LIFO---");
		while(!st.isEmpty()) { // 스택이 비어있지 않는 동안, 스택에 요소가 남아있는동안 반복한다!
			System.out.println("pop->"+st.pop());//st.pop을 사용항혀 스택의 맨 위 요소부터 하나하나씩 꺼냄
		}
		System.out.println("-----2--------");
		while(!st.isEmpty()) {
			System.out.println("pop->"+st.pop());
		}
	}

}

