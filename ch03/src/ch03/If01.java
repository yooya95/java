package ch03;

public class If01 {

	public static void main(String[] args) {
		int a = -12;                                      //12일때도 비교해보기
		int b = 100;
		int c =   0;
		c = a+b;                                          //-12+100=88
		if(a>0) {                                         //a값이 0보다 크면
			System.out.println(a+"는 양수");                // a는 양수  >위에서 a는 -12이기 때문에 아래 else로 넘어감 
			System.out.println("두줄 이상일때 {} 감싸주..");   // 두줄 이상일 때 {} 감싸주...   
		}
		else {                                            // a값이 0보다 작거나 같다면
			System.out.println(a+"는 음수");                // -12는 음수
		}                                                 // 한줄일때는 중괄호 생략해도 됨
		System.out.println("C =>"+c);                     //C => 88
		System.out.println("프로그램 종료");                 // 프로그램 종료
		
	}



	
}
