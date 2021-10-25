package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");

		redButton.addActionListener(new ActionListener() { //�͸�Ŭ����
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.RED); //���콺Ŭ���� ����
			}			
		});
														   // ���ٽ�
		blueButton.addActionListener(e->colorChanger.changeColor(Color.BLUE));

		add(redButton);
		add(blueButton);
	}

}
