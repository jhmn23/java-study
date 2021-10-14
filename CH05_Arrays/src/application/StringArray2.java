package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String은 참조 자료형, 참조 변수는 주소값을 갖는다.
		String text = null; //널은 참조 변수에 주소값이 없음
		//text = new String("헬로우!");
		text = "헬로우!";
		System.out.println(text);
		
		String[] texts = null;
		//texts = "헬로우!"; 에러
		System.out.println(texts);
		
		texts = new String[3]; // 3개의 문자열 배열공간 생성
		System.out.println(texts); //배열의 주소값을 출력
		
		texts[0] = new String("하이");
		texts[1] = "안 녕?";
		texts[2] = "굿 바이!";
		
		for(String word : texts) {
			System.out.println(word);
		}
	}

}
