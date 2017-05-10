import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonNew extends JButton implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ButtonNew() {
		// TODO Auto-generated constructor stub
		super("New");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
