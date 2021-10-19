package arrayEx;

public class Bacteria {
	public static void main(String[] args) {
		// 배열 생성
		int[] bacteriaCountLogs = new int[10];

		// 개체 수 기록
		writeLog(bacteriaCountLogs);

		// 결과 출력
		printLog(bacteriaCountLogs);
	}

	// 박테리아의 개체 수를 기록
	public static void writeLog(int[] logs) {
		/* 해당 메소드를 완성하세요. */
		for(int i=0; i<10; i++) {
			logs[i] = (int)Math.pow(2, i);
		}
	}

	// 배열을 입력받아, 해당 요소를 모두 출력
	public static void printLog(int[] arr) {
		System.out.printf("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d", arr[i]);
			if (i != arr.length - 1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("]");
	}
}
