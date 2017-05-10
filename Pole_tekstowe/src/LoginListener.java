import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LoginListener implements ActionListener{
	private JFrame frame;
	private PoleLogowania poleLogowania;
	
	public void setPanel(PoleLogowania poleLogowania) {
		// TODO Auto-generated method stub
		this.poleLogowania = poleLogowania;
	}
	
	public LoginListener(JFrame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
	}
	

	@Override
	public void actionPerformed(ActionEvent wydarzenie) {
		// TODO Auto-generated method stub
		String login = poleLogowania.getLogin();
		String haslo = poleLogowania.getHaslo();
		if(UserValidator.autoryzacja(login, haslo)) {
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					frame.getContentPane().removeAll();	
					frame.add(new PoleTextowe());
					frame.validate();
				}
			});
		}
	}
	

}
