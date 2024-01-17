package ch12;

class ThreadExample2 extends Thread {
	@Override
	public void run() {
		for (int i= 1; i <=20 ; i ++){
			System.out.print("대뱍"+i+"\t");
			if(i%5==0) System.out.println();
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
	
			} 
		}
	}
}

class ThreadExample3 extends Thread {
	@Override
	public void run() {
		for (int i= 1; i <=20 ; i ++){
			System.out.print("화요일" +i+"\t");
			if(i%5==0) System.out.println();
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}


public class Threadtest3 {

	public static void main(String[] args) {
		ThreadExample2 te2 = new ThreadExample2();
		ThreadExample3 te3 = new ThreadExample3();
		te2.start();
		te3.start();

	}

}
