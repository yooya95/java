package ch05;


class OverLoading {
	String name;
	int    age;
	String gender;
	
	//생성자 OverLoading 파라메타 개수가 다르다.
	OverLoading() {	
	}
	OverLoading(int a){
		age = a;
	}
	 
	OverLoading(String str){
		name = str;
	}
	void print() {
		System.out.println("-----------------");
		System.out.println("name->"+name);
		System.out.println("age->"+age);
	}
	
}
public class OverLoadingEx {
	public static void main(String[] args) {
	//기본생성자로 
	OverLoading ov1 = new OverLoading();
	ov1.age = 30;
	
	//새로운 생성자 지정
	OverLoading ov2 = new OverLoading(25);
	OverLoading ov3 = new OverLoading("홍길동");
	
	ov1.print();
	ov2.print();
	ov3.print();
	
	
	}
}
	