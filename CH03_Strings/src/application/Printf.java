package application;

public class Printf {

	public static void main(String[] args) {
		// printf("출력서식(%d,%f,%c,%s),출력할값)
		int age = 25;
		String addr = "부산";
		
		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내 나이는 %d살 이고 %s에 살고 있습니다.\n", age, addr);
		
		double pi = 3.14592;
		System.out.printf("파이의 값은: %.2f", pi); //%f사이에 .2소수점 두자리
	}

}
