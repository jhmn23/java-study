package application;

import java.util.Scanner;

public class Hangman {
	
	private RandomWord word = new RandomWord();
	private boolean running = true;
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		do {
			displayWord(); 		//화면에 단어표시
			getUserInput();		//입력받음
			checkUserInput();	//맞는지 체크 다맞으면 running=false
		} while (running);
	}

	private void checkUserInput() {
		System.out.println("체크");
	}

	private void getUserInput() {
		//유저에게 한 문자 입력 요구
		//입력받은 문자열에서 그 문자를 뽑아서 RandomWord 객체에 전달 => addguess(문자) 메소드
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
	}

	private void displayWord() {
		//랜덤 단어 출력
		System.out.println(word.toString());
	}
}
