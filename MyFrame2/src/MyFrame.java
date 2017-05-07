import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyFrame() {
		super("Rysowanie");
		JPanel panel = new MyPanel();
		add(panel);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 200);
		setVisible(true);
	}
	
}
