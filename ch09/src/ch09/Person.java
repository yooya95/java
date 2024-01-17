package ch09;

public class Person {
	int      id;     //key
	String   name;
	
	public Person (int id, String name) {
		this.id   = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		Person  P = null;
		Boolean b = false;
		if(obj instanceof Person)P = (Person) obj;
		if(obj != null && this.id==P.id)b = true;
		//return super.equals(obj);
		return b;
	}

	@Override
	public String toString() {
		String showText = "주민번호 :"+this.id +" 이름 :"+this.name;
		//return super.toString();
		return showText;
	}

}
		