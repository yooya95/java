package ch09;

public class Math1 {

	public static void main(String[] args) {
		int[] i = new int[6];
		//로또를 i[]에 넣는과정
		for(int j=0; j<6; j++) {
			int lotto = (int)(Math.random()*45) + 1;
			i[j] = lotto;
			
		}
	System.out.println("----Lotto 당첨번호 조회----");
	for(int j=0; j<i.length; j++) {
		System.out.println(j+"번쩨:"+i[j]);
	}
	
	
	}

}
