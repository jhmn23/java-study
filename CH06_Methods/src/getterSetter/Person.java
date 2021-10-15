package getterSetter;

public class Person {
	// 클래스 안에 만든 변수를 인스턴스 변수라 하고 => 객체 생성시 사용가능(생성됨)
	private String name;
	private int age;
	// get, set 메소드로 변수에 접근
	void setName(String name) {
		this.name = name;
		//this는 본인 클래스의 객체를 가르킴
	}
	String getName() {
		return name;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
}
