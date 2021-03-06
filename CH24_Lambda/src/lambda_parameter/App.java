package lambda_parameter;

interface Runner {
	void execute(String s);
}

public class App {
	public static void main(String[] args) {
		// 파라미터(매개변수) 있는 추상메소드
		Runner run1 = (a) -> System.out.println(a);
		run1.execute("펭수");

		Runner run2 = (t) -> System.out.println(t);
		run2.execute("길동");
		
	}

}
