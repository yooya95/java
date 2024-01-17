package hw;

class StrPrint {
	String name;
	int    sNum = 7;
	StrPrint (String name) {
		this.name = name;
	}
		//개발자가 오버라이드
		@Override	
	public String toString() {
		return"이름: " + name + " , 번호: " +sNum;
		
	
	}
}


public class ToStirngEx {

	//sp1->hw.StrPrint@782830e
	//sp2->hw.StrPrint@470e2030
	//hw

//	  sp1->이름: 경찰회의 , 번호: 7
//	  sp2->이름: 간부회의 , 번호: 7
	public static void main(String[] args) {
		StrPrint sp1 = new StrPrint("경찰회의");
		StrPrint sp2 = new StrPrint("간부회의");
	
		System.out.println("sp1->"+sp1);
		System.out.println("sp2->"+sp2);
	}

}

