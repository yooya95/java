package ch04;
//복습해보기 문제. 
public class VarArr01 {

	public static void main(String[] args) {
		int[][]a = new int[3][]; // 2차원 배열 행의 갯수가 3행 []열로 생성된 a배열
		a[0] = new int[3];       // 0,0 0,1 0,2, >>a의 0번째 행에 3개의 열을 가지고 있음
		a[1] = new int[2];       // 1,0 1,1	     >>a의 1번째 행에 2개의 열을 가지고 있음
		a[2] = new int[4];       // 2,0 2,1 2,2 2,3  >>a의 2번째 행에 4개의 열을 가지고 있음

		a[0][0] = 7;  a[0][1] = 23; a[0][2] = 13;
		a[1][0] = 23; a[1][1] = 3;
		a[2][0] = 2 ; a[2][1] = 21; a[2][2] = 56; a[2][3] = 71;
		
		//행은 가변 불가, 열은 가변 가능 (중요함)
		//int[][] b = new int[][5] ; 불가능
		
		
		//           행 3
		for(int i=0; i< a.length; i++) {
			//                 열 3/2/4
			for (int j =0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	
	}

}
