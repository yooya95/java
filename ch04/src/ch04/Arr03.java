package ch04;

public class Arr03 {
	// 연습 배열의 크기가 5인 배열을 생성하고, 일반형 for문과 향상형 for문을 사용하여  나타내시오.
	public static void main(String[] args) {
		String[] str = {"코로나","이강인","손흥민","김민재","우영우"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
			System.out.println("-------향상형 kk for문---------------");
		for(String kk : str) {
			System.out.println(kk);
			
		}
	}

}
