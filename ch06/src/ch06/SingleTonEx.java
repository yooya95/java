package ch06;
//***
//자원 절감
// 싱글톤 패턴? 어떤 클래스의 인스턴스는 하나임을 보장하고 어디서든 참조할 수 있도록 함

class SingleTon {
	String str;
	private static SingleTon instance;
	// 인스턴스 생성하기전에 사용할 수 있는 게 static 이기 때문에 써야함
	// 아무나 나를 생성하지 못함
	private SingleTon() {
	}
	//getInstance를 통해서만 접근할 수 있음 , new singleton 불가능 
	public static SingleTon getInstance() {
		if(instance == null) instance = new SingleTon();
		return instance;
	}
}


public class SingleTonEx {

	public static void main(String[] args) {
		//                      new SingleTon() 생성 불가! private 접근제어자임
		//
		SingleTon singleTon1 = SingleTon.getInstance(); //getInstance를 통해서만 인스턴스 만들수 있음	
		// 인스턴스에 같은 주소값을 참조하고 있음
		SingleTon singleTon2 = SingleTon.getInstance();
		singleTon1.str = "스스로 있는자";
		System.out.println("singleTon2.str-> "+singleTon2.str);
		
		if(singleTon1 == singleTon2) System.out.println("같다");
		else						  System.out.println("다르다");
		
	}

}
