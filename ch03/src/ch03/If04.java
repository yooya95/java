package ch03;

public class If04 {
//HOMEWORK 한번해보기,이중 if문
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		

		if (score >=90 ) {     
			if(score >97 )      grade = "A+"; 
			else if(score <94)  grade ="A-";
			else                grade="A0";
		} else if (score >=80) {
			if(score >87)       grade = "B+";
			else if(score <84)  grade = "B-";
			else                grade = "B0";
		} else if (score >=70) {
			if(score >77)       grade = "D+";
			else if(score <74)  grade = "D-";
			else                grade = "D0";
		} else if (score >=60) {
			if(score >67)       grade = "D+";
			else if(score <64)  grade = "D-";
			else                grade = "D0";
		}
		else grade = "F";
	
		
		System.out.println("점수는"+ score +"이고" + "학점은" + grade);
	}

}
//1. 90점이상이고 
		//     97 >  --> A+   
		//     94 <  --> A-   
		//     else  --> A0   
		// 2. 80점이상이고 
		//     87 >  --> B+   
		//     84 <  --> B-   
		//     else  --> B0   
		// 3. 70점이상이고 
		//     77 >  --> C+   
		//     74 <  --> C-   
		//     else  --> C0   
		// 4. 60점이상이고 
		//     67 >  --> D+   
		//     64 <  --> D-   
		//     else  --> D0   
		// ELSE --> F