import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ramka extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ramka(Ramka ramka) {
		super("Komponenty tekstowe");
		LoginListener sluchacz = new LoginListener(this);
		JPanel panel = new PoleLogowania(sluchacz);
		((PoleLogowania) panel).utworzKomponenty(ramka);
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 700);
		setPreferredSize(new Dimension(300, 300));
		setLocation(300, 300);
		pack();
		setVisible(true);
	}
	public void closeWindows() {
		this.dispose();
	}

}
