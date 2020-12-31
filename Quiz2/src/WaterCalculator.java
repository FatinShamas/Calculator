import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.Color;
public class WaterCalculator {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("Water calculator");
	private JTextField textField_weight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
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
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 102, 204));
		frame.setBounds(100, 100, 554, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(204, 11, 148, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How much water should i drink?");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(156, 68, 263, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("My weight is (Kg):");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2.setBounds(156, 113, 133, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_weight = new JTextField();
		textField_weight.setHorizontalAlignment(SwingConstants.CENTER);
		textField_weight.setBackground(Color.PINK);
		textField_weight.setBounds(299, 116, 86, 20);
		frame.getContentPane().add(textField_weight);
		textField_weight.setColumns(10);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int weight;
				double water_need;
				try {
					weight=Integer.parseInt(textField_weight.getText());
					
					water_need=weight*0.033;
					
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water_need+ " L of a water a day!");
				}catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
					
				}
				
				
				
		
			}
		
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(224, 171, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
