package application;

public class Hangman {
	
	private RandomWord word = new RandomWord();
	private boolean running = false;
	
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
		System.out.println("단어맞추기");		
	}

	private void displayWord() {
		//랜덤 단어 출력
		System.out.println(word.toString());
	}
}
