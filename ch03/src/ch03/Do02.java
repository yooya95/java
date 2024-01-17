package ch03;

public class Do02 {
// while03을 보고 바꿔보기
	   public static void main(String[] args) {
		      System.out.println("구구단 DoWhile ");
		      int i = 1, j = 2;
		      do {
		         do {
		            System.out.print(j+" * "+i+" = " +i*j + "\t" );
		            j++;
		         } while(j <=9);
		         System.out.println();
		         i++;
		         j = 2;
		      } while(i <=9);
		      
		   }
		}
