import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PoleDanych extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField poleLogin;
	private JPasswordField poleHaslo;
	
	public PoleDanych() {
		JLabel login = new JLabel("Login: ");
		JLabel haslo = new JLabel("Haslo: ");
		poleLogin = new JTextField();
		poleHaslo = new JPasswordField();
		
		setLayout(new GridLayout(2, 2));
		add(login);
		add(poleLogin);
		add(haslo);
		add(poleHaslo);
	}
	
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
}
