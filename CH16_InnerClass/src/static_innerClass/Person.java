package static_innerClass;

public class Person {
	class Head { // 내부클래스 Head
		public void print() { // 내부클래스 Head의 메소드
			System.out.println("헤드");
		}
	}
	
	static class Body { // 스태틱내부클래스 Body
		public void print() { // 스태틱내부클래스 Body의 메소드
			System.out.println("바디");
		}
	}
	
	public void print() { // 클래스 Person의 메소드
		Head head = new Head(); // 헤드 객체생성
		Body body = new Body(); // 바디 객체생성
		
		head.print();
		body.print();
	}
}
