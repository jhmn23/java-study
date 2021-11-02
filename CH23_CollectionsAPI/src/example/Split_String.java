package example;

public class Split_String {
	public static void main(String[] args) {
		// 문자열.split(" ") => 문자열을 공백(space)으로 쪼개서 배열로 리턴
		String text1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "비트코인(영어: Bitcoin)은 블록체인 기술을 기반으로 만들어진 온라인 암호화폐이다. 비트코인의 화폐 단위는 BTC로 표시한다. 2008년 10월 사토시 나카모토라는 가명을 쓰는 프로그래머가 개발하여, 2009년 1월 프로그램 소스를 배포했다. 중앙은행이 없이 전 세계적 범위에서 P2P 방식으로 개인들 간에 자유롭게 송금 등의 금융거래를 할 수 있게 설계되어 있다. 또 중앙은행을 거치지 않아 수수료 부담이 적다. 거래장부는 블록체인 기술을 바탕으로 전 세계적인 범위에서 여러 사용자들의 서버에 분산하여 저장하기 때문에 해킹이 불가능하다. SHA-256 기반의 암호 해시 함수를 사용한다.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //정규표현식[] ^시작문자
		String[] words = text2.split("[^가-힣]+");
		
		for(String w : words) {
			
			if(w.length()<2) continue; //한 철자이하는 빼기
			
			System.out.println(w.toLowerCase()); //전부 소문자로 출력
			
		}
	}

}
