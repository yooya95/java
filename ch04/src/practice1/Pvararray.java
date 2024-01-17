package practice1;
//실습 2 결과값처럼 배열 코딩 연습해보기! 
public class Pvararray {

	public static void main(String[] args) {
		int[][]a= new int [3][];
		
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
		
		a[0][0]= 7; a[0][1]=23; a[0][2]=13;
		a[1][0]=23; a[1][1]=3;
		a[2][0]=2;  a[2][1]=21; a[2][2]=56; a[2][3]=71;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();	
		} 
	System.out.println("========================================");
		
		int[][]b= { {7,23,13},{23,3},{2,21,56,71}};
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
		}
		System.out.println();
		}
	
		
	}

		
	}	
	

// 결과값이 아래처럼 나오도록 배열코딩해보자!
/*
7	23	13	
23	3	
2	21	56	71	
*/