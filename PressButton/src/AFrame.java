import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class AFrame extends JFrame implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel buttonPanel;
	
	
	public AFrame() {
		super("Test akcji");
		buttonPanel = new Przycisk();
		
		
		add(buttonPanel);
		addKeyListener(this);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		pack();
		
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()=='k'){
			System.out.println("released");
			setBackground(Color.RED);
	}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
