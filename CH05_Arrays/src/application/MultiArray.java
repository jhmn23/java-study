package application;

public class MultiArray {

	public static void main(String[] args) {
		// ÀÌÁß ¹è¿­
		String[][] texts = {
				{"ÇÏ³ª","µÑ","¼Â"},
				{"³Ý","´Ù¼¸","¿©¼¸"},
				{"ÀÏ°ö","¿©´ü","¾ÆÈ©"}
		};
		
		for(int i=0; i<texts.length; i++) {
			//System.out.println(texts[i]);
			String[] innerArray = texts[i];
			
			for(int j=0; j<innerArray.length; j++) {
				System.out.printf("%s\t",innerArray[j]);
			}
			
			System.out.println();
		}

	}

}
