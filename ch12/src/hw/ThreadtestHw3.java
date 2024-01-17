package hw;


//1. 생성자이름을 가진  ThreadExample4 Thread 만들기
//2. 20번 돌아가면서 System.out.println(getName()+"대박" +i);
//3. 10/1000초 쉬

class ThreadExample4 extends Thread {
	@Override
	public void run() {
		for (int i= 1; i <=20 ; i ++){
			System.out.println(getName()+"대박"+ i);
			
		try {
			sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
}
//1. 생성자이름을 가진 ThreadExample5만들기
//2. 20번 돌아가면서 System.out.println(getName()+"월요일" +i );
//3. 50/1000초 쉬기
class ThreadExample5 extends Thread{
	@Override
	public void run() {
		for (int i= 1; i <=20 ; i ++){
			System.out.println(getName()+"월요일"+ i);
			
		try {
			sleep(50);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
}	
public class ThreadtestHw3 {
	public static void main(String[] args) {
		ThreadExample4 te4 = new ThreadExample4();
		ThreadExample5 te5 = new ThreadExample5();
		te4.start();
		te5.start();
		}
	}


