package ch11;
// 배열과비교
import java.util.ArrayList;

public class ArrayList2 {

	public static void print(ArrayList<String> listPrint) {
		// 					바나나 수박 사과  바나나    수박 대추 바나나
		for (String str : listPrint){
			System.out.print(str +"\t");
		}
		System.out.println("\n---------------------------5--------------------------");
	}
	
	public static void main(String[] args) {
		String myString = "바나나";
		ArrayList<String>	list = new ArrayList<>();
		list.add("바나나");
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수 : " + list.size());
		// 바나나 수박 사과 바나나    수박 대추 바나나
		print(list);
		//   0   1   2    3  4   5   6
		// 바나나	수박	사과	바나나	 수박	대추	바나나
		//1번 자리에 끼워 넣기 가능하다.
		list.add(1,"키위"); //키위 들어가고 뒤로 밀림 
		print(list);
		list.set(4, "복숭아"); //복숭아 들어가고 뒤로 밀리지 않음
		print(list);
		list.remove(0); //set 결과값에서 0번째를 제거하고 차례대로 들어감
		print(list);
		
		
		System.out.println("3번 인덱스-->" + list.get(3));
		System.out.println("바나나 문의 : " +list.contains("바나나"));
		//System.out.println("바나나 문의 indexOf : " + list.indexOf("바나나",0));
		System.out.println("바나나 문의 indexof : " + list.indexOf("수박"));
		System.out.println("바나나 문의 : " + list.lastIndexOf("수박"));
		// HomeWork    (수박 --> 메론 for )
		for( int i =0 ; i < list.size(); i++) {
			if(list.get(i).equals("수박")) {
				list.set(i, "메론");
			}
		}
		print(list);
		
		
	}
	
}

