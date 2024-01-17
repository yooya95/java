package hw;

public class Math3 {

	public static void main(String[] args) {
		int[] i = new int[6];
		//*로또를 i[]에 넣는과정
		//for(int j=0; j<6; j++) {
		//	int lotto = (int)(Math.random()*45) + 1;
		//	i[j] = lotto;
			
		//}
		// 중첩 발생 않도록 수정 -> while
		int count = 0;
		
		while(count<6) { 
			int lotto = (int)(Math.random()*45) + 1;
			for(int j=0; j<6; j++) {
				if(lotto == i[j]) {
					lotto = 0;
					break;
				}
			}
			if (lotto>0) {
				i[count] = lotto;
				count ++;
			}
		} 
		
		
	System.out.println("----Lotto 당첨번호 조회----");
	for( int j=0; j<i.length; j++) {
		System.out.println(j+"번쩨:"+i[j]);
	}
	
	}

}
