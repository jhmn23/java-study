package throwing_Runtime_Exception;

public class App {
	public static void main(String[] args) {
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
