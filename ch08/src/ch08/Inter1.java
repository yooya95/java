package ch08;
//구현체들이 존재하지 않고 추상메서드들로 존재
public interface Inter1 {

	// Static Final
	int AAA = 3;
	// Abstract methods 들임 
	void display(); 
	void print();
	
}
// 클라스로 인터페이스를 상속받을 때는 implements 
class ImplClass1 implements Inter1 {

	@Override
	public void display() {
		System.out.println("재정의 했으..AAA->"+AAA);
		// AAA ++;  상수이기 때문에 ++ 안됨
	}

	@Override
	public void print() {
		System.out.println("Interface 상속받아 구현");
		
	}
}