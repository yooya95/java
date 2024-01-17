package ch06;
//*** 면접 단골
class Data {
	int kor;
	int eng;
	int math;
	//call by reference 배열 일반 객체변수의 주소 값을 참조해서 넘겨주는 것
	void addRef(Data d1, Data d2) { //영어점수d2 를 꺼내서 국어점수로 바꾸겠다
		//d2.의 영어값을 국어값으로 넘기면 위의 data d1의 값이 바뀜
		d1.kor = d2.eng;
		System.out.println("call by reference addRef Method 국어점수 : "+d1.kor);
	}
	//call by value 기본타입의 변수를 넘겨주는 것, 값만 넘어가서 하기 메소드를 빠져나가면 값이 바뀌지 않음.
	void addValue(int kor, int eng) { 
		//영어점수를  국어점수로 바꾸겠다.  
		//여기 메소드에서는 점수가 바뀌어 55임
		// 주소에 있는 점수를 복사하여 넣어준거기 때문에 주소값은 변하지 않음
		kor = eng;
		System.out.println("call by reference addValuef Method 국어점수 :"+kor);
	}

}

public class DataEx {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor   = 50;
		d1.math  = 70;
		d2.eng   = 80;
		
		//Instance를 넘겨주면 주소값을 넘겨주는 효과 *****
		System.out.println("1. call by reference After ");
		d3.addRef(d1,   d2);
		System.out.println("Main 국어 점수 : " +d1.kor);
		System.out.println("2. call by value After ");
		d3.eng = 55;
		d3.kor = 70;
		d3.addValue(d3.kor,d3.eng); // 위의 addvale 메서드에 값을 넣어 준거기 때문에 다음 구문에서 바뀐 값으로 저장되어있지 않음.
		System.out.println("Main 국어 점수 : " +d3.kor); // 여기서는 국어점수가 70임, 본래 주소를 변경해주진 않음
	
	}

}
