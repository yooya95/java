package ch05;
//Var 설계도
class Var {
	//class 변수 (인스턴스들이 공유 하는 변수)
	static int classVar = 10;
	
	//Instance 변수,member 변수, 필드 (인스턴스 생성 후에서 사용할 수 있는 멤버변수)
	String color= "멋있어";
	int speed = 33;
	
	void scope() {
		//지역변수 , 메소드 내에서만 실행
		int localVar =77;
		System.out.println(localVar+"scope method");
	}
}


public class Variable {

	public static void main(String[] args) {
		// Instance 생성 전 사용 가능 한 것이 class 변수임
		System.out.println("classVar->"+Var.classVar);
	
		// var1이라는 Instance 생성 후 사용 가능 한 것이 Member 변수 
		// speed, color 등을 말하는 것

		Var var1 = new Var();
		var1.speed = 55;
		var1.color = "파란색";
		
		System.out.println("speed->"+var1.speed);
		System.out.println("color->"+var1.color);
		
		var1.scope();
		// 지역변수인 scope는 사용할 수 없음, 지역변수는 메서드 호출로만 사용 가능함
		// System.out.println("scope.localVar->"+var1.localVar); 에러남
	}

}
