package application;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// ���α׷� ����
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});
	}

}
