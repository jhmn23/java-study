package application;

import java.util.Random;

public class RandomWord {
	private String books = "reputation childhood conversation grandmother environment audience administration judgment decision accident comparison homework indication elevator revolution employer construction professor temperature election bathroom argument historian secretary awareness";
	private String[] words = books.split(" ");
	
	private String selectWord; //������ �ܾ�
	private Random rand = new Random(); //���� ��ü�� ����
	
	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)]; //�������� �ܾ ���� 
	}
	
	public String toString() {
		return selectWord;
	}
	
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
}
