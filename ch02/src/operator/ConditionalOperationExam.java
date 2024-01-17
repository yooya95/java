package operator;
//삼항연산자 코딩실습
public class ConditionalOperationExam {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // score가 구십 초과이면 A인데 85점이네? > 80점 초과이면 B (맞아)!
		System.out.println(score + "점은 " + grade + "등급입니다.");
		

		// 조건식(피연산자1) TRUE 일경우> : 값 또는 연산식(피연산자2) : FASLE일경우> 값또는 연산식(피연산자3)
	}

}
