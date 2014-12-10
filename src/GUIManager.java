import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class GUIManager extends JFrame{

	private static final long serialVersionUID = 1L;
	private final Dimension BUTTONS_DIMENSION = new Dimension(100,100);
	private JLabel label;
	private JButton team_button, scout_button;

	public GUIManager(){
		label = new JLabel("Escolha a função representa");
		team_button = new JButton("CLUBE");
		scout_button = new JButton("OLHEIRO");		
		config();
		build();
		listeners();
		setVisible(true);
	}

	private void config(){
		setSize(200, 200);
		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void build(){
		team_button.setPreferredSize(BUTTONS_DIMENSION);
		scout_button.setPreferredSize(BUTTONS_DIMENSION);

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;		
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.ipady = 50;
		add(label, gbc);

		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.ipady = 0;
		gbc.insets = new Insets(3, 3, 3, 3);
		add(team_button, gbc);

		gbc.gridx = 1;
		add(scout_button,gbc);

		pack();
	}

	private void listeners() {
		team_button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				new GUI_TEAM().init();
				dispose();
			}});

		scout_button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				new GUI_SCOUT().init();
				dispose();
			}});
	}


	public static void main(String[] args) {
		new GUIManager();
	}

}

