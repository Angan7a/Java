import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PoleLogowania extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField poleLogin;
	private JPasswordField poleHaslo;
	
	public String getLogin() {
		return poleLogin.getText();
	}
	
	public String getHaslo() {
		String haslo = "";
		char[] has = poleHaslo.getPassword();
		for(int i = 0; i < has.length; ++i) {
			haslo += has[i];
		}
		return haslo;
	}
	public PoleLogowania() {
		super();
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints contraints = new GridBagConstraints();
		contraints.fill = GridBagConstraints.CENTER;
		gridBag.setConstraints(this, contraints);
		setLayout(gridBag);
	}
	public void utworzKomponenty(JFrame frame) {
		JLabel login = new JLabel("Login: ");
		JLabel haslo = new JLabel("Haslo: ");
		poleLogin = new JTextField();
		poleHaslo = new JPasswordField();
		
		
		JPanel wejPanel = new JPanel();
		wejPanel.setLayout(new GridLayout(2, 2));
		wejPanel.add(login);
		wejPanel.add(poleLogin);
		wejPanel.add(haslo);
		wejPanel.add(poleHaslo);
		
		PolePrzyciskow buttonPanel = new PolePrzyciskow(frame);
		
		
		JPanel helperPanel = new JPanel();
		helperPanel.setLayout(new BorderLayout());
		helperPanel.add(wejPanel, BorderLayout.CENTER);
		helperPanel.add(buttonPanel, BorderLayout.AFTER_LAST_LINE);
		
		this.add(helperPanel);
		buttonPanel.buttonLogin.setPanel(this);
	}
}
