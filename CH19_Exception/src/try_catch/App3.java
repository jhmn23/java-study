package try_catch;

import java.util.Scanner;

public class App3 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();
	}

	private static int getNumber() {
		// 숫자를 입력받을 때까지 반복하여 숫자를 입력받아 리턴하는 메소드
		int number = 0;
		boolean isNumber = false; //숫자 인가? t / f

		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();

			try { // 에러가 날수있는 코드를 try문 안에 넣는다.
				number = Integer.parseInt(line); // 여기서 에러가 나지 않으면 숫자 입력이 맞음
				isNumber = true;
			} catch (Exception e) { // try에서 에러 발생시 catch문에서 처리
				System.out.println("숫자 입력이 아닙니다.");
			}
		} while (!isNumber);

		return number;
	}

}
