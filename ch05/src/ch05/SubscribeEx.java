package ch05;

class Subscribe {
	  String name;
	  String telnum;
	  int    age;
	  // 생성자 overLoading >>Subscribe
	  Subscribe () {
	  }
	  Subscribe (String name, String t) {
		  this.name = name;    //this 나의 멤버변수를 정확하게 지칭해줌 (변수이름이 같을경우 오류뜸)
		  this.telnum = t;	  //이름이 파라메타 변수와 나의 멤버변수와 같을 때 this 를 붙여서 구분
	  }
	  
	  
	  void ChgTelNum(String t) {
		  telnum = t;
	  }
	  void ChgAge (int age1) {
		  if (age1 <0) {
			  System.out.println("당신은 - 나이를 넣고 있네요");
			  return;
		  }
		  age = age1;
	  }
	  void print() {
		  System.out.printf("이름: %s 전화번호: %s 나이: %d \n",name,telnum,age);
	  }
}


public class SubscribeEx {

	public static void main(String[] args) {
		// 생성자 생성 메모리할당과 멤버변수 같이 초기화시켜주고 있음
		Subscribe s1 = new Subscribe("이성계","010-2223-5567");
		s1.print();
		
		//기본생성자를 활용하여 결과값 도출
		Subscribe s2 = new Subscribe();
		s2.name ="김유신";
		s2.ChgAge(-10);
		s2.ChgTelNum("010-2267-6789");
		s2.print();
	}

}
