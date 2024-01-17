package ch05;
//Car3 설계도 
public class Car3 {
	
	String name;    //차이름
	int    inTime;  //입고시간
	int   outTime;  //출고시간
	int   fee;      //주차요금
	
	//상수 (상수는 대문자로 쓰는것이 관례, 항상 같은 수)*
	final int AMTPERTIME = 3000; 
	// 시간당 3000원 주차요금, final은 이것 이상의 값 할당은 없다는 뜻임.
	
	//생성자 --->Constructor, 초기화 시켜줄 때 사용
	Car3() {
	}
	
	Car3(String n, int in, int out){
		name    = n;
		inTime  = in;
		outTime = out;
		
	} //overloading 생성자 오버로딩, 메소드 오버로딩 있음
	
	void print() {
		int fee = ( outTime - inTime) * AMTPERTIME;
		System.out.println("차 이름 :" + name);
		System.out.println("입고시간 :" + inTime);
		System.out.println("출고시간 :" + outTime);
		System.out.println("주차요금 :" + fee);
		
	}
	
	int min30After(int inTime) {
		int after30 = inTime + 30;
		System.out.println("after30 :" + after30);
		return after30;
	}
}

// 리턴타입이 없걸 void라고함