package ch03;

public class Break01 {

	public static void main(String[] args) {
	int num = 0, sum = 0;
	while (true){
		num++;
		sum+= num; //sum+= ++num;과같음
		System.out.println("sum->"+sum);
		if(num==5) break;
		// break 반복문, 분기문 종료
	}
	System.out.println("합계):" +sum);
	System.out.println("끝");
	}

}
