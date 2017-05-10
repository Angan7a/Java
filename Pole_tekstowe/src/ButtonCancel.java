import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonCancel extends JButton implements ActionListener{

	/**
	 * 
	 */
	public JFrame ramka;
	private static final long serialVersionUID = 1L;
	public ButtonCancel(Ramka ramka) {
		// TODO Auto-generated constructor stub
		super("Cancel");
		addActionListener(this);
		this.ramka = ramka;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Nacisnięto Cancel");
		
	}

}
