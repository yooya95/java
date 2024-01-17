package operator;
//비교연산자 코딩실습2
public class CompareOperatorExam2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);                         //1과 1.0은 같음, true
		
		double v4 = 0.1;					  
		float v5 = 0.1f;
		System.out.println(v4 == v5);                         //fasle 부동소수점 표현방식의 한계가 있음(시스템 오류라고 기억하자!) 
		System.out.println((float)v4== v5);                   //true  0.1f와 0.1f는 같음
		System.out.println((int)(v4*10) == (int)v5*10);       //true  1과 1은 같음 >>????? 왜 false지?
	}

}
