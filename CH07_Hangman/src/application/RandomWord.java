package application;

import java.util.Random;

public class RandomWord {
	private String books = "reputation childhood conversation grandmother environment audience administration judgment decision accident comparison homework indication elevator revolution employer construction professor temperature election bathroom argument historian secretary awareness";
	private String[] words = books.split(" ");

	private String selectWord; // ������ �ܾ�
	private Random rand = new Random(); // ���� ��ü�� ����
	private char[] characters;

	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)]; // �������� �ܾ ����
		characters = new char[selectWord.length()];// ���ڹ迭 ��������
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();

		for (char c : characters) {
//			if(c == '\u0000') { //�ι��� �����ڵ�
//				sb.append('_');
//			} else {
//				sb.append(c);
//			} 
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' ');
		}

		System.out.println(selectWord);
		return sb.toString();
	}

	public void getWords() {
		for (String w : words) {
			System.out.println(w);
		}
	}

	public void addGuess(char c) {
		// ����ڰ� �Է��� �� ���ڸ� ���õ� �ܾ�� ������ �ִ��� Ȯ��
		// ������ characters �� �ε��� ��ġ�� �Է�
		for(int i=0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}
}
