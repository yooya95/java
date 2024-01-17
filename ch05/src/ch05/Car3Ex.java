package ch05;
//car3와 같이봥
public class Car3Ex {

	public static void main(String[] args) {
		// Car3(String n, int in, int out)생성자 없을 시 기본 생성자 만듦
		
		Car3 c1 = new Car3("소나타", 10, 14); 
		Car3 c2 = new Car3("그렌저", 9, 20);
		Car3 c3 = new Car3("아반테", 12, 13);
		Car3 c4 = new Car3();
		c4.name = "제네시스";
		
		// final 
		// c1.AMTPERTIME =2500 Car3에 상수 3000이 설정되어 있으므로, 선언 불가능함
		
		c1.print();
		c1.min30After(0);
		c2.print();
		c3.print();
		c4.print();

	}

}
