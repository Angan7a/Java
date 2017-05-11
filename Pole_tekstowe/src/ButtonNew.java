import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonNew extends JButton implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	
	public ButtonNew(JFrame frame) {
		// TODO Auto-generated constructor stub
		super("New");
		addActionListener(this);
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.getContentPane().removeAll();	
		frame.add(new PoleTextowe("Otworzyłeś nową stronę", frame));
		frame.validate();
	}
}
