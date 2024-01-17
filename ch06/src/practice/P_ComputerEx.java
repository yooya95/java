package practice;

class P_Computer {
	 double sum1(int[] values) {
		 int sum    = 0;
		 double avg = 0;
	 
	 
	 for(int i=0; i<values.length; i++) {
		 sum+= values[i];		 
	 }
	 avg = (double)sum/values.length;
	 return avg;
 }

	 
	 int sum2(int kk, int...values) {
		 int sum = 0;
		 System.out.println("kk :"+kk);
		 for(int i=0; i<values.length; i++) {
			 sum += values[i];
			 
		 }
		 return sum;
	 }
 }




public class P_ComputerEx {

	public static void main(String[] args) {
		P_Computer myCom = new P_Computer();
		int[]arrays = {1,2,4};
		
	
		
		
	}

}
