package application;

public class BooleanOr {
	public static void main(String[] args) {
		// || or �� ������
		boolean isRaining = false; //�� ���°�?
		boolean mightRain = true; //�� �ü��� �ִ°�?
		
		boolean takeUmbrella = false; //����� ��������?
			
		takeUmbrella = isRaining || mightRain; // �� ���ų� �Ǵ� �ü��� �ְų� �ϳ��� ���̸� ��
		
		System.out.println(takeUmbrella);

	}

}
