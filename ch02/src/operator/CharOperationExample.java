package operator;
//char 타입의 산술 연산
public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;  
		char c2 = 'A'; 
		//컴파일 에러 char c3 = c2 + 1; 1을 담기위해선 int로 변환
		//수정하면 int c3 = c2 + 1; 
		
		System.out.println("c1 =" +c1);    //A 다음(+1)은 B >> c1 = B
		System.out.println("c2 =" +c2);    //A			  ?? c2 = A


	}

}
