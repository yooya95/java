package ch09;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person(111, "김준수");
		Person person2 = new Person(111, "김준타");
		
		if (person1.equals(person2)) System.out.println("같다");
		else System.out.println("다르다");
		
		System.out.println("person1->"+person1);
		System.out.println("person1->"+person1.toString());

	}

}
