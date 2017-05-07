import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

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
		
		Rectangle2D rec = new Rectangle2D.Double(10, 10, 380, 380);
		Ellipse2D ellip = new Ellipse2D.Double(10, 10, 380, 380);
		g2d.draw(rec);
		g2d.draw(ellip);
		
		
	}
		
	
}
