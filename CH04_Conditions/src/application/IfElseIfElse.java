package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// IF 문
		Scanner scanner = new Scanner(System.in); //스캐너 생성
		
		System.out.print("사과의 갯수는 ? ");
		int apples = scanner.nextInt();
		
		System.out.print("바나나의 갯수는 ? ");
		int bananas = scanner.nextInt();
		
		scanner.close(); //스캐너 사용후 닫기
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else if(apples < bananas) { //if문의 조건이 false일때 실행
			System.out.println("바나나가 사과보다 많음");
		}
		else { //같을 경우
			System.out.println("갯수가 같음");
		}
		System.out.println("프로그램 종료.");
		
	}

}
