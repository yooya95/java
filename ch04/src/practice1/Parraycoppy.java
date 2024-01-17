package practice1;

public class Parraycoppy {
// 실습 1. 배열복사 해보기. (for문과 arraycopy 활용)
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6,7};
		int[]b = new int[10];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}

		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+"\t");
		}
	System.out.println();
		int[]c = {1,2,3,4,5,6,7,8};
		int[]d = new int[10];
		
		System.arraycopy(c, 0, d, 0, c.length);
		pr(b);
	
	}

	private static void pr(int[] b) {
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		
	}

}
