package ch11;

import java.util.ArrayList;

public class CarEx {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		
		//현장 work
		//1. print 출력
		//2. move 출력
		//         Car()   Bus() Taxi()
		for(Car c: al) {
			c.print();
			//3. move를 출력하기
			if(c instanceof Bus) { //c객체가 bus 클래스의 객체인지 아닌지 확인 맞으면 if문 안으로 들어감.
				Bus b =(Bus)c;		//c객체를 bus타입으로 캐스팅
				b.move();
				
				//한줄
				//((Bus)c).move();
			}
		}

	}

}
