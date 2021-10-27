package application;

import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Creature;

public class App {

	public static void main(String[] args) {	
		//제네릭 타입 클래스는 객체를 만들때 타입을 지정한다.
		Wrapper<Cat> wrapper = new Wrapper<>(); //포장클래스 객체 생성
		Wrapper<Creature> wrapper2 = new Wrapper<>(); //포장클래스 객체 생성
		
		Cat cat = new Cat("마틸다"); //고양이마틸다 객체 생성 
		Creature creature = new Creature("생물");
		
		wrapper.set(cat); //포장객체에 set메소드 마틸다 입력
		wrapper2.set(creature);
		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.feed();
		r2.feed();
	}

}
