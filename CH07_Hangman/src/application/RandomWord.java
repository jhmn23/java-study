package application;

import java.util.Random;

public class RandomWord {
	private String books = "reputation childhood conversation grandmother environment audience administration judgment decision accident comparison homework indication elevator revolution employer construction professor temperature election bathroom argument historian secretary awareness";
	private String[] words = books.split(" ");

	private String selectWord; // 선택한 단어
	private Random rand = new Random(); // 랜덤 객체를 생성
	private char[] characters;

	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)]; // 랜덤으로 단어를 선택
		characters = new char[selectWord.length()];// 문자배열 공간생성
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();

		for (char c : characters) {
//			if(c == '\u0000') { //널문자 유니코드
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
		// 사용자가 입력한 한 문자를 선택된 단어에서 같은게 있는지 확인
		// 있으면 characters 의 인덱스 위치에 입력
		for(int i=0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}
}
