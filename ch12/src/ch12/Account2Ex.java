package ch12;

class Account2User extends Thread {
		Account2 act;
		boolean flag;
		
		public Account2User (Account2 act, String name) {
			super(name);
			this.act = act;
		}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (act) 
			{
				if(flag) act.deposit((int)Math.random()*10000, getName());
				else act.withdraw((int)(Math.random()*10000), getName());
				flag   =!flag; //flag SWAP	
			}
		}		
	}			
}

public class Account2Ex {

	public static void main(String[] args) {
		// 여자그룹 (박지연 , 조정은 , 정선아) / 남자그룹 (김준수 , 전동석 , 신성록 )
		Account2 act1 = new Account2(10000); //여자그룹 계좌
		Account2 act2 = new Account2(15000); //남자그룹 계좌 
		
		Account2User au1 = new Account2User(act1, "박지연");
		Account2User au2 = new Account2User(act1, "조정은");
		Account2User au3 = new Account2User(act1, "정선아");
		
		Account2User au4 = new Account2User(act2, "김준수");
		Account2User au5 = new Account2User(act2, "전동석");
		Account2User au6 = new Account2User(act2, "신성록");
		
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
		
	
	}

}
