package anonymous_Class;

public class App {

	private String name = "���";
	
	public static void main(String[] args) {
		new App().start();

	}
	private void start() {		
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}
	private void activate(Runnable runnable) {
		runnable.run();//�߻�޼ҵ� run�� ����
	}
}
