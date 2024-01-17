package ch12;

class Ra1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=20; i ++) {
			//							실행중인 Thread의 주소값의 이름을 가져온다
			System.out.println(i+"대박"+Thread.currentThread().getName());
			try {
					Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}			
	}
}

class Ra2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 1; i <=20; i ++) {
			System.out.println(i+"화요일"+Thread.currentThread().getName());
			try {
					Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}	
	}
}


public class RunnableTest1 {

	public static void main(String[] args) {
		//Runnable을 상속받아 구현
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		// implement 한 것은 반드시 아래와 같이 선언 후 사용 --> Thread th1 = new Thread(R1)
		Thread th1 = new Thread(r1, "pr");
		Thread th2 = new Thread(r2, "no");
		th1.start();
		th2.start();
	}
}
