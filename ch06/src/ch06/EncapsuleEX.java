package ch06;
//캡슐화 접근제어자 (private 와 public)***
class Encapsule {
	private String name;
	private int    age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;	
	}
	public void setAge(int age) {
		if (age <0 ) System.out.println("나이입력오류");
		else this.age = age;
	}
}



public class EncapsuleEX {

	public static void main(String[] args) {
		Encapsule encapsule = new Encapsule();
//		encapsule .name = "홍길동"; 
//		--->name은 private 접근제어자로 되어있음! 같은 클래스 내에서만 가능함 그렇기 때문에 에러 뜸
		
		//public으로 되어 있는 접근제어자임. 접근 제한이 없기 때문에 에러 발생 없음
		encapsule.setName("홍길동");
		encapsule.setAge(-10);
		System.out.println("이름 "+encapsule.getName());
		System.out.println("나이 "+encapsule.getAge());
		

	}

}
