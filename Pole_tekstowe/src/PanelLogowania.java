import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelLogowania extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelLogowania(JFrame frame) {
		super();
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints contraints = new GridBagConstraints();
		contraints.fill = GridBagConstraints.CENTER;
		gridBag.setConstraints(this, contraints);
		setLayout(gridBag);
	
		PoleDanych wejPanel = new PoleDanych();
		
		PolePrzyciskow buttonPanel = new PolePrzyciskow(frame);
	
		JPanel helperPanel = new JPanel();
		helperPanel.setLayout(new BorderLayout());
		helperPanel.add(wejPanel, BorderLayout.CENTER);
		helperPanel.add(buttonPanel, BorderLayout.AFTER_LAST_LINE);
		
		this.add(helperPanel);
		buttonPanel.buttonLogin.setPanel(wejPanel);
	}
}
