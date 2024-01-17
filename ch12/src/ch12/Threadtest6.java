package ch12;
//멀티쓰레드
import javax.swing.JOptionPane;

class ThreadExample6 extends Thread {
	@Override
	public void run() {
		for( int i =0; i<10 ; i ++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


public class Threadtest6 {

	public static void main(String[] args) {
		ThreadExample6 te6 = new ThreadExample6();
		te6.start();

		String name = JOptionPane.showInputDialog("너 이름이 뭐니?");
		System.out.println("당신의 이름은 " + name +"입니다");
	}

}
