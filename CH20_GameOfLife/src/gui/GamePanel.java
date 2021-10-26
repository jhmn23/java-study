package application;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 50; // ������ ũ�⼳��
	private final static Color backgroundColor = Color.BLACK; // ��� ������
	private final static Color gridColor = Color.GRAY; // ���ڼ��� ȸ��

	private int topBottomMargin; // �� �Ʒ� ����
	private int leftRightMargin; // �� �� ����

	public GamePanel() {
		// setBackground(Color.BLUE); // �����г� ������ ���� �Ķ�������
	}

	@Override
	protected void paintComponent(Graphics g) {
		// �� �޼ҵ�� �ڵ����� ���� �� ���� �� �ڽ��� ����� �׸���.
		Graphics2D g2 = (Graphics2D) g; // 2D �׷����� ����ϱ� ����

		int width = getWidth(); // ���α���
		int height = getHeight(); // ���α���

		// System.out.println(width);
		// System.out.println(height);
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

		g2.setColor(backgroundColor); // �� ����
		g2.fillRect(0, 0, width, height); // �簢���� ��ǥ�� ���� ĥ��

		drowGrid(g2, width, height); // ���� �ߴ� �޼ҵ�

		fillCell(g2, 0, 0, true);
		fillCell(g2, 0, 2, true);
		fillCell(g2, 3, 4, true);

	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status) {
		// �簢���� ���� �ִ� �޼ҵ�(�׷��Ȱ�ü, ������, ������, ����(true���,false����))
		Color color = status ? Color.GREEN : backgroundColor; // ���׿����� status�� true�� ���
		g2.setColor(color);

		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);

		// x,y��ǥ ���� ���� ���� �Է��ؼ� �簢���� ���� ĥ�Ѵ�.
		g2.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);

	}

	private void drowGrid(Graphics2D g2, int width, int height) {
		// ���� ���� �ߴ� �޼ҵ�
		g2.setColor(gridColor); // �� ���� : ȸ��

		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			// ���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			// ���� �ߴ� �޼ҵ� (x1,y1) (x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}

	}

}
