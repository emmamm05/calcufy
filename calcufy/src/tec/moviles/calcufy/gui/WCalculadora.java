package tec.moviles.calcufy.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class WCalculadora {

	private JFrame frame;
	private JLabel dataDisplay;
	
	public final static String CHAR_0 = "0";
	public final static String CHAR_1 = "1";
	public final static String CHAR_2 = "2";
	public final static String CHAR_3 = "3";
	public final static String CHAR_4 = "4";
	public final static String CHAR_5 = "5";
	public final static String CHAR_6 = "6";
	public final static String CHAR_7 = "7";
	public final static String CHAR_8 = "8";
	public final static String CHAR_9 = "9";
	public final static String CHAR_DOT = ".";
	public final static String CHAR_C = "C";
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WCalculadora window = new WCalculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WCalculadora() {
		initialize();
	}
	
	/**
	 *  Agregar Texto con los botones
	 */
	private void addSymbolToDisplay(String pNewSymbol){
		String actualText = dataDisplay.getText();
		actualText += pNewSymbol;
		dataDisplay.setText(actualText);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		dataDisplay = new JLabel();
		dataDisplay.setOpaque(true);
		dataDisplay.setBackground(UIManager.getColor("Button.background"));
		dataDisplay.setBorder(UIManager.getBorder("TextField.border"));
		dataDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		dataDisplay.setText("0");
		dataDisplay.setBounds(32, 12, 303, 50);
		frame.getContentPane().add(dataDisplay);
		
		JButton btnNewButton = new JButton(CHAR_0);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 addSymbolToDisplay(CHAR_0);
			}
		});
		btnNewButton.setBounds(32, 260, 50, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(CHAR_DOT);
		button.setBounds(112, 260, 50, 50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 addSymbolToDisplay(CHAR_DOT);
			}
		});
		frame.getContentPane().add(button);
		
		JButton btnAc = new JButton(CHAR_C);
		btnAc.setBounds(197, 260, 50, 50);
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 addSymbolToDisplay(CHAR_C);
			}
		});
		frame.getContentPane().add(btnAc);
		
		JButton button_2 = new JButton(CHAR_1);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_1);
			}
		});
		button_2.setBounds(32, 198, 50, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(CHAR_2);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_2);
			}
		});
		button_3.setBounds(112, 198, 50, 50);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton(CHAR_3);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_3);
			}
		});
		button_4.setBounds(197, 198, 50, 50);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton(CHAR_4);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_4);
			}
		});
		button_5.setBounds(32, 136, 50, 50);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton(CHAR_5);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_5);
			}
		});
		button_6.setBounds(112, 136, 50, 50);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton(CHAR_6);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_6);
			}
		});
		button_7.setBounds(197, 136, 50, 50);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(CHAR_7);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_7);
			}
		});
		button_8.setBounds(32, 74, 50, 50);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton(CHAR_8);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_8);
			}
		});
		button_9.setBounds(112, 74, 50, 50);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(CHAR_9);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbolToDisplay(CHAR_9);
			}
		});
		button_10.setBounds(197, 74, 50, 50);
		frame.getContentPane().add(button_10);
		
		JButton button_1 = new JButton("/");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(285, 74, 50, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_11 = new JButton("X");
		button_11.setBounds(285, 136, 50, 50);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setBounds(285, 198, 50, 50);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_13.setBounds(285, 260, 50, 50);
		frame.getContentPane().add(button_13);
		

	}
}
