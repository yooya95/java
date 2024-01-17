package ch07;

public class Outer {
	int width = 10;
	int height = 10;
	
	public Outer(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public Inner getInner() {  // inner 클래스에 대한 인스턴스 반환
		return new Inner();
	}
	// Inner class 선언 : class안에 class (클라스안에서 일회용을로 쓸때 쓰임)
	
	class Inner {
		int depth = 10;
		
		public int volume() {
			return width * height * depth;
			
		}
	}
}


