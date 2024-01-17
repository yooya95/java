package hw; //숙제

//설계도
class Person {
	String name;
	int    age;
	String gender;
	
	void print() {
		System.out.println("이름: "+name+" 나이: "+age+" 성별 :" +gender);
	}


}
// 선언
public class PersonEx {

	public static void main(String[] args) {
		
		Person aPerson = new Person();
		// Person의 class를 시행시킴 myPerson을 인스턴트 값으로 지정함
		

		
		aPerson.name = "홍길순";
		aPerson.age = 22;
		aPerson.gender = "M";
		aPerson.print();
		
		Person bPerson = new Person();
		bPerson.name = "연개소문";
		bPerson.age = 32;
		bPerson.gender = "M";
		bPerson.print();

		Person cPerson = new Person();
		cPerson.name = "선덕여왕";
		cPerson.age = 42;
		cPerson.gender = "F";
		cPerson.print();

		
		
			// HW01  교수님 답안
			// Person Instance  -> per1 ,per2,per3
//			이름:홍  길동 나이 :22 성별 :M
//			이름:연개소문 나이 :32 성별 :M
//			이름:선덕여왕 나이 :42 성별 :F

			Person per1 = new Person();
			Person per2 = new Person();
			Person per3 = new Person();
			per1.name = "홍  길동";   per1.age = 22;  per1.gender = "M";
			per2.name = "연개소문";    per2.age = 32;  per2.gender = "M";
			per3.name = "선덕여왕";    per3.age = 42;  per3.gender = "F";
			per1.print();
			per2.print();
			per3.print();
		
		
		
	}

}

//이름:홍  길동 나이 :22 성별 :M
//이름:연개소문 나이 :32 성별 :M
//이름:선덕여왕 나이 :42 성별 :F
