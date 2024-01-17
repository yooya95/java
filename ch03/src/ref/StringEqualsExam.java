package ref;

public class StringEqualsExam {
//문자열비교 코딩실습
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) { //equals는 문자열 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
	
		// 객체Type   인스턴스         메모리할당
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
	}

}

 // 주소번지 비교와 값의 비교는 다르다