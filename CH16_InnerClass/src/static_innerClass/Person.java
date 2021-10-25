package static_innerClass;

public class Person {
	class Head { // ����Ŭ���� Head
		public void print() { // ����Ŭ���� Head�� �޼ҵ�
			System.out.println("���");
		}
	}
	
	static class Body { // ����ƽ����Ŭ���� Body
		public void print() { // ����ƽ����Ŭ���� Body�� �޼ҵ�
			System.out.println("�ٵ�");
		}
	}
	
	public void print() { // Ŭ���� Person�� �޼ҵ�
		Head head = new Head(); // ��� ��ü����
		Body body = new Body(); // �ٵ� ��ü����
		
		head.print();
		body.print();
	}
}
