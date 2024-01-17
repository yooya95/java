package ch07;
//* 복습대상
public class EngineCarEx {
	String kind;
	// 객체 member 변수 OK
	// 객체에서 객체 사용 방법
	// 1. 상속 관계 사용
	// 2. 연관 관계(Association) 사용   클라스간의 관계 Engine과 EngineCaEx
	
	Engine eg; //타입과 배기량을 같이 가지고 옴, class Engine (상자박스 개념)
	int    kkk = 0; //Debug용도
	// static int   kkk=0; // 디버그 용도
	// 생성자: 필드 초기화, 메모리 생성        //String type, int cc
	public EngineCarEx(String kind , Engine eg) {
		   this.kind = kind;
		   this.eg   = eg; // this.type = type; this.cc = cc;
		   
	}
	void    print(){
		System.out.println("종류 : " +kind);
		kkk++;
		eg.print();
		System.out.println("=========== kkk->"+kkk);
	}
	
	
	public static void main(String[] args) {
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		
		// ---------------------------------------
		// 나 자신을 배열로 선언, 
		EngineCarEx[] engineCars = new EngineCarEx[3];
		//각각에 따른 인스턴스 
		engineCars[0] = new EngineCarEx("모닝",   eg1);
		engineCars[1] = new EngineCarEx("소나타",  eg1);
		engineCars[2] = new EngineCarEx("그랜저",  eg2);
		// 							 모닝, 소나타, 그랜저
		for(EngineCarEx engineCarEx : engineCars) {
			engineCarEx.print();
		}
		
	}

}
