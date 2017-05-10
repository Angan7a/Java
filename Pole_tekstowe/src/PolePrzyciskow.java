import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolePrzyciskow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ButtonLogin buttonLogin;
	public PolePrzyciskow(JFrame frame) {
		setLayout(new GridLayout(1, 3));
		buttonLogin = new ButtonLogin(frame);
		JButton buttonCancel = new ButtonCancel();
		JButton buttonNew = new ButtonNew();
		add(buttonLogin);;
		add(buttonCancel);
		add(buttonNew);
	}
	
}
