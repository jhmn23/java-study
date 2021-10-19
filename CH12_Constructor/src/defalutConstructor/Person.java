package defalutConstructor;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("叼弃飘 积己磊肺 积己凳!");
		name = "葛抚";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("person 积己凳!");
		this.name = name;
		age = 0;
	}

	public Person(String name, int age) {
		System.out.println("person 积己凳!");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
