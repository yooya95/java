package ch12;

class ThreadExample1 extends Thread {
	public ThreadExample1(String str) {
		super(str);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for(int i = 1; i <= 100; i++) {
			System.out.print(getName() + i + "\t");
			if (i%10==0) System.out.println();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
				//e.printStackTrace();
			}
				
		}
	
	}
}


public class Threadtest1 {

	public static void main(String[] args) {
		ThreadExample1 a1 = new ThreadExample1("subThreadA");
		ThreadExample1 a2 = new ThreadExample1("subThreadB");
		
		a1.start();
		a2.start();
//		a1.run();
//		a2.run();
		for(int i = 1; i <= 100; i++) {
			System.out.print("Main" + i + "\t");
			if (i%10==0) System.out.println();
		}
	}

}
