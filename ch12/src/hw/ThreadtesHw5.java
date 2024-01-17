package hw;

//Thread 상속 --> System.out.print("-"); 20번 수행
class G1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
//Runnable 구현 --> System.out.print("+");  20번 수행
class G2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}

//Runnable 구현 --> System.out.print("*");  20번 수행
class G3 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}



public class ThreadtesHw5 {

	public static void main(String[] args) {
		// 각각 Thread 수행
		G1 ga1 = new G1();
		G2 ga2 = new G2();
		G3 ga3 = new G3();
		
		Thread th1 = new Thread(ga2);
		Thread th2 = new Thread(ga3);
		
		ga1.start();
		th1.start();
		th2.start();
	}

}
