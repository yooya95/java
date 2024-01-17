package ch12;

import java.util.ArrayList;

class Before extends Thread {
	public Before(String str) {
		super(str);	
	}
	
	void addCar() {
		System.out.println("addCar");
		Jointest.carList.add("벤츠");
		Jointest.carList.add("아우디");
		Jointest.carList.add("sm7");
		Jointest.carList.add("포르쉐");

	}

	@Override
	public void run() {
		System.out.println("Before->"+getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		addCar();
	}
}
class After extends Thread {
	After (String str){
		super(str);
	}
	@Override
	public void run() {
		System.out.println("After Thread 이름 :" +getName());
		for(String car : Jointest.carList) {
			System.out.println(car);
		}
	}
}

	
	
public class Jointest {

	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		Before bf = new Before("우선");
		After af = new After("나중에");
		bf.start();
		
		try {
			bf.join();   //Before 끝날때까지 대기
		} catch (Exception e) {
			// TODO: handle exception
		}
		af.start();
	}
	
}
