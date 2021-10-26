package custom_Exception;

import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooLowException;

public class App {
	public static void main(String[] args) {
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();

		try {
			stat.setTemperature(40);
		} catch (TempTooHighException e) {
			// �µ��� ������� ó�� �ڵ�
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// �µ��� ������� ó�� �ڵ�
			System.out.println(e.getMessage());
		}
	}

}
