import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyFrame() {
		super("Moje okno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 300);
        setLocation(450, 200);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        add(b1);
        add(b2);
        add(b3);
        setLayout(new GridLayout(4, 2));
	}
	
}
