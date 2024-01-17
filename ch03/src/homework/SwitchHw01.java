package homework;

public class SwitchHw01 {

	public static void main(String[] args) {
		// 주사위 던짐 --> Random(렌덤)으로 6이하의 숫자
		// switch 문을 이용해서 --> M번이 나왔습니다
		
		System.out.println("주사위를 던지세요");
		int num = ((int)(Math.random()*6)+1);
			switch(num){
				case 1 : 
				case 2 : 
				case 3 : 
				case 4 : 
				case 5 : 
				case 6 :
					System.out.println(num+"번이 나왔습니다");
				break;
		}
	}

}
 //Scanner sc = new Scanner(System.in);???