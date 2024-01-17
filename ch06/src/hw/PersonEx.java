package hw;

import ch06.Manager;
import ch06.Student;
import ch06.Teacher;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student() ;
		Teacher tc1 = new Teacher() ;
		Manager ma1 = new Manager() ;
		
		
		st1.setName("수지");
		st1.setAge(21);
		st1.setSno("1234");
		st1.printALL();
		
		tc1.setName("길동");
		tc1.setAge(35);
		tc1.setSubject("Java");
		tc1.printALL();
	
		ma1.setName("원빈");
		ma1.setAge(19);
		ma1.setPart("청소");
		ma1.printAll();
	
		// st1.printAll();
		// tc1.printALL();
		// ma1.printAll();
	    // system. out 을 하지 않아도 됨
		
	}

}

