package application;

import java.util.Scanner;

public class Hangman {
	
	private RandomWord word = new RandomWord();
	private boolean running = true;
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		do {
			displayWord(); 		//ȭ�鿡 �ܾ�ǥ��
			getUserInput();		//�Է¹���
			checkUserInput();	//�´��� üũ �ٸ����� running=false
		} while (running);
	}

	private void checkUserInput() {
		System.out.println("üũ");
	}

	private void getUserInput() {
		//�������� �� ���� �Է� �䱸
		//�Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ���� => addguess(����) �޼ҵ�
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
	}

	private void displayWord() {
		//���� �ܾ� ���
		System.out.println(word.toString());
	}
}