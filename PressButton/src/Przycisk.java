import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Przycisk extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button1;
	private JButton button2;
	private JButton button3	;
	
	
	public Przycisk() {
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(300, 300));
		add(button1);
		add(button2);
		add(button3);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object source = arg0.getSource();
		if(source == button1) {
			setBackground(Color.GREEN);
			button1.setText("Zielony");
			button1.setBackground(Color.GREEN);
			
		} else if(source == button2) {
			setBackground(Color.BLUE);
			button1.setText("1");
		} else if(source == button3){
			setBackground(Color.RED);
		 	button1.setText("1");
		}
	}

	

	

}
