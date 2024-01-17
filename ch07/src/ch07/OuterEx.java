package ch07;

public class OuterEx {

	public static void main(String[] args) {
		Outer out1 = new Outer(100, 100);
		Outer.Inner in1 = out1.getInner();
		System.out.println("부피 : " + in1.volume());

		Outer out2      = new Outer(200, 100);
		Outer.Inner in2 = out2.new Inner();
		System.out.println("부피 : " + in2.volume());

	}

}

/*
.getIneer() 는 outer클래스의 인스턴스를 기반으로 inner 클래스의 인스턴스를 생성
.new Inner()는 독립적으로 inner 클래스의 인스턴스를 생성
 */
