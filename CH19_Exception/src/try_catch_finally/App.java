package try_catch_finally;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		try {
			p1.setName(null);
			System.out.println("����� ����ȵ�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//���ܰ� �߻��ϵ� ���ϵ� ������ ����
			System.out.println("������ ����");
		}
		
		System.out.println("���α׷� ����.");
		
	}

}
