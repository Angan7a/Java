import java.awt.*;

import javax.swing.JPanel;


public class MyPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyPanel() {
		setPreferredSize(new Dimension(400, 400));
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Graphics2D g3d = (Graphics2D) g;
		// prostokat
		g2d.drawRect(10, 10, 380, 380);
		// kolo
		//g2d.drawOval(10, 10, 380, 380);
		g3d.fillOval(10, 10, 40, 30);
		g3d.drawOval(10, 10, 380, 380);
	}
		
	
}
