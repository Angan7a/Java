import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ButtonLogin extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PoleLogowania poleLogowania;
	private JFrame frame;
	
	public ButtonLogin(JFrame frame) {
		// TODO Auto-generated constructor stub
		super("Login");
		addActionListener(this);
		this.frame = frame;
	}
	
	public void setPanel(PoleLogowania poleLogowania) {
		// TODO Auto-generated method stub
		this.poleLogowania = poleLogowania;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Nacisnięto Login");
		String login = poleLogowania.getLogin();
		String haslo = poleLogowania.getHaslo();
		if(UserValidator.autoryzacja(login, haslo)) {
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("jesteś w środku");
					frame.getContentPane().removeAll();	
					frame.add(new PoleTextowe());
					frame.validate();
				}
			});
		}
	}

}
