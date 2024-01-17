package ch03;

public class Switch05 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String season = "";
		
		switch (num){
		case 12: case 1: case 2:
			switch (num){
				case 12: System.out.println("초겨울");
				break;
				case 1: System.out.println("젤추워");
				break;
				case 2: System.out.println("추워");
				break;
			}
			season = "겨울" ; 
			break;
			
		case 3: case 4: case 5:
			switch(num){
				case 3: case 4:                    //3이나 사면 대박 그 외면 쪽
					System.out.println("초봄");
				break;
				case 5 : 
					System.out.println("따뜻해");
				break;
			}
			season = "봄" ;
			break;
			
		case 6: 
		case 7: 
		case 8: season = "여름" ;
		break;
		
		case 9: 
		case 10: 
		case 11: season = "가을" ;
		break;
		
		default : season = "없는 계절";
		break;
	}
	System.out.println(num+"월은 " + season + "입니다");
		
	}
	
}
