import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ramka extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ramka() {
		super("Test Myszki");
		add(new Mysz());
		setResizable(false);
		setSize(400, 550);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ramka();
            }
        });
	}

}
