package hashmap;

import java.util.HashMap;

public class Iterating_Map {
	public static void main(String[] args) {
		// 맵의 아이템들을 전부 읽는 방법
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");

		// 1. 람다식
		months.forEach((code, name) -> System.out.println(code + ": " + name));
		System.out.println();

		// 2. entrySet() : key와 value값을 가져온다
		for(var entry : months.entrySet()) {
			String k = entry.getKey(); // 키값
			String v = entry.getValue(); // value값
			System.out.println(k + ": " + v);
		}
		System.out.println();
		// 3. keySet() : key값을 가져옴
		for(String k : months.keySet()) {
			String v = months.get(k);
			System.out.println(k + ": " + v);
		}
	}

}
