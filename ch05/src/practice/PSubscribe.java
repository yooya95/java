package practice;

class Subscribe {
	String name;
	String telnum;
	int age;
	
	Subscribe(){	
	}
	Subscribe(String name, String t){
		this.name = name;
		this.telnum = t;
	}
	
	void ChgTelNum(String t) {
		telnum = t;
	}
	void ChgAge(int age1) {
		if(age1<0) {
			System.out.println("당신은 -값을 입력하셨네요");
			 return;
			}
		age = age1;
		}
		void print() {
			System.out.printf("이름: %s 전화번호: %d 나이: %d \n", name, telnum,age);
		}
	

}


public class PSubscribe {

	public static void main(String[] args) {
		
		Subscribe s1 = new Subscribe();
		s1.print();
		
		Subscribe s2 = new Subscribe();
		s2.name  = "유연아";
		s2.ChgAge(-10);
		s2.ChgTelNum("010-3488-1111");
		s2.print();
		
		
	}

}
