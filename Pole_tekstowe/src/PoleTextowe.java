import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PoleTextowe extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PoleTextowe(String tresc, JFrame frame) { 
		JLabel inSystem = new JLabel(tresc);
		JButton buttonCancel = new ButtonCancel(frame);
				
		setLayout(new BorderLayout());
		add(inSystem, BorderLayout.CENTER);
		add(buttonCancel, BorderLayout.AFTER_LAST_LINE);
	}
}
