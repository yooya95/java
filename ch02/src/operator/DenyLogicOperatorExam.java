package operator;
//논리부정연산자 실습
public class DenyLogicOperatorExam {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); //true
		
		play = !play; //!는 부정형 진실의 부정형은
		System.out.println(play); //fasle 
		
		play = !play; //거짓의 부정형은
		System.out.println(play); //true

	}

}
