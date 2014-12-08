import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;


public abstract class GUI extends JFrame{

	private static final long serialVersionUID = 1L;
	private final Dimension WINDOW_SIZE = new Dimension(500,500);
	private final String WINDOW_TITLE = "Scouts Zone";

	public void init(){
		config();
		build();
		setVisible(true);
	}

	private void config(){
		setSize(WINDOW_SIZE);
		setTitle(WINDOW_TITLE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public abstract void build();
}
