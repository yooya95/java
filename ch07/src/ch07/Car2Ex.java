package ch07;

public class Car2Ex {
	
	public static void main(String[] args) {
		// 부모형 --> Car2
		// Child형 --> Car3
		
		Car2[] cars = new Car2[3];
		//부모 객체에 자식 객체 대입 가능
		cars[0] = new Bus();
		cars[1] = new Ambulance();
		cars[2] = new FireEngine();
		//            Bus Ambulance FireEngine
		for(Car2 car : cars) {
			// 메소드 실행은 부모와 같은 이름의 자식 메소드가 실행
			car.move();
			//멤버(인스턴스)변수는 부모것만 적용
			System.out.println("for Car2-->" + car.a);
			
			// car.special[];
			// instanceof -->객체타입이 true or false Return --> Boolean
			/*부모타입 instanceof 자식타입
			 * 자식 타입에 맞으면 참(true)을 반환하고, 아니면 거짓(false)을 반환
			 * */
			if(car instanceof Ambulance ) {
				// 객체의 타입을 비교할때 instanceof를 사용함 / 참 거짓 결과값만 나옴 **
				Ambulance amb = (Ambulance) car;
				amb.special();
				amb.printa();
				System.out.println("amb Car2-->");
				
			}
		}
	}

}
