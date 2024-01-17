package homework;

public class MultiArr02 {
//homework2
	public static void main(String[] args) {
		int[][] a = new int[2][3]; //행이2 열이 3인 a 배열 선언
		a[0][0] = 1;			  // {1,  2,   3}
		a[0][1] = 2;              // {11, 12, 13}
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		
	for(int i =0; i <a.length; i++) {
		for(int j=0; j < a[i].length; j++) {
			System.out.print("일반 For "+a[i][j]+"\t");
		}
		System.out.println();
	}
		
	
	for(int[]i : a) {
		for(int j : i) {
			System.out.print("향상형 for"+j+"\t");
		}
		System.out.println();
	}
	
	
	}
	
}


//결과 
//일반 For 1	일반 For 2	일반 For 3	
//일반 For 11	일반 For 12	일반 For 13	
//향상 For->1	향상 For->2	향상 For->3	
//향상 For->11	향상 For->12	향상 For->13