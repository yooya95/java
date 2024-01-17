package ch08;

abstract class AbsClass{
	int kkk=0;
	public void setKkk(int kkk) {
		this.kkk = kkk;
	}
	public AbsClass() {
		System.out.println("추상자Class 생성자");
	}
	// 하나이상의 추상 메소드가 존재 필요( 필수는아님)
	abstract void print();
}

class ImplAbsClass extends AbsClass {

	@Override
	void print() {
		System.out.println("ImplAbsClass kkk--->"+kkk);
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		// 추상 class는 추상 메서드가 하나라도 존재하면 instance 생성 안됨
		// AbsClass absClass 3 = new AbsClass(); xxx
		AbsClass absClass = new ImplAbsClass();
		absClass.setKkk(12);
		absClass.print();
		
	}

}
