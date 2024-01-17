package operator;
//증감 연산자  실습 (꼭 다시 이해하고 넘어가기!!!)
public class IncreaseDecreaseOperatorExam {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		int aa,bb;
		
		System.out.println("--------------------------");
		aa = x++;                                            //1. aa=x >2.x++
		bb = ++x;                                            //1. ++x  >2.bb = x
		System.out.println("aa=" + aa);                     //aa=10
		System.out.println("bb=" + bb);                     //bb= 12
		System.out.println("x=" + x);                       //x=12

		System.out.println("--------------------------");
		y--;                                                 //9
		--y;                                                 //8
		System.out.println("y=" + y);                        //y=8
	
		System.out.println("--------------------------");
		z = ++x + y++;                                         //1. ++x>13 (위의 x12값,) 
		                                                       //2. y=8 3. z=21 4. y++=9
		System.out.println("z="+z);                            //21
		System.out.println("x="+x); 
		System.out.println("y="+y);
		
	}

}
