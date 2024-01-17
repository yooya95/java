package ch03;

public class For04 {

	public static void main(String[] args) {
		for (int i=0; i <=10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
	for (int i=10; i>=0; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		for (int i=0; i<=10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i=1; i<=10; i*=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
