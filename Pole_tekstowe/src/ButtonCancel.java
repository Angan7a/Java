
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonCancel extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ButtonCancel() {
		// TODO Auto-generated constructor stub
		super("Cancel");
		addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Nacisnięto Cancel");
		System.exit(0);
		
	}

}
