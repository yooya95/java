package practice;

class Car2 {
	String name;
	String color;
	int    speed;
	
public Car2 (String name, String color, int speed) {
	this.name=name;
	this.color=color;
	this.speed=speed;

}
	void print() {
	System.out.println(name + "\t" + color + "\t"+speed);

}
	
	int speedUp (int speed) {
		int incspeed = speed+10;
		System.out.println("incspeed->"+incspeed);
		return incspeed;
	}
}




public class P_Car2Ex {

	public static void main(String[] args) {
		Car2 c1 = new Car2("소나타","빨강",150);
		c1.print();
		int methodspeed = c1.speedUp(c1.speed);
		System.out.println("Main methodSpeed-> "+methodspeed);
		c1.print();
		
		
	}

}
