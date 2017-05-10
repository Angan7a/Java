import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
	private JButton buttonLogin;
	private JButton buttonCancel;
	private LoginListener sluchacz;
	
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
	public PoleLogowania(LoginListener sluchacz) {
		super();
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints contraints = new GridBagConstraints();
		contraints.fill = GridBagConstraints.CENTER;
		gridBag.setConstraints(this, contraints);
		setLayout(gridBag);
		this.sluchacz = sluchacz;
		this.sluchacz.setPanel(this);
	}
	public void utworzKomponenty(Ramka ramka) {
		JLabel login = new JLabel("Login: ");
		JLabel haslo = new JLabel("Haslo: ");
		poleLogin = new JTextField();
		poleHaslo = new JPasswordField();
		
		JPanel wejPanel = new JPanel();
		wejPanel.setLayout(new GridLayout(2, 2));
		wejPanel.add(login);
		wejPanel.add(haslo);
		wejPanel.add(poleLogin);
		wejPanel.add(poleHaslo);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonLogin = new ButtonLogin();
		buttonCancel = new ButtonCancel(ramka);
		buttonLogin.addActionListener((ActionListener) sluchacz);
		buttonCancel.addActionListener((ActionListener) sluchacz);
		buttonPanel.add(buttonLogin);
		buttonPanel.add(buttonCancel);
		
		JPanel helperPanel = new JPanel();
		helperPanel.setLayout(new BorderLayout());
		helperPanel.add(wejPanel, BorderLayout.CENTER);
		helperPanel.add(buttonPanel, BorderLayout.AFTER_LAST_LINE);
		
		this.add(helperPanel);
	}
}
