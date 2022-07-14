package cep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Cep extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cep() {
		setTitle("Buscar CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(-10002, -10026, 688, 319);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setBounds(-10002, -10026, 688, 319);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(-10002, -10026, 688, 319);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(-10002, -10026, 688, 319);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(-10002, -10026, 688, 319);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(-10002, -10026, 688, 319);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(-10002, -10026, 688, 319);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setBounds(-10002, -10026, 688, 319);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(-10002, -10026, 688, 319);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setBounds(-10002, -10026, 688, 319);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(-10002, -10026, 688, 319);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(69, 37, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Endere\u00E7o");
		lblNewLabel_5.setToolTipText("Endere\u00E7o");
		lblNewLabel_5.setBounds(48, 73, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 34, 134, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(124, 70, 391, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Bairro");
		lblNewLabel_6.setBounds(69, 119, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(124, 116, 391, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Cidade");
		lblNewLabel_7.setBounds(69, 174, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(124, 171, 262, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(451, 170, 64, 26);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_8 = new JLabel("UF");
		lblNewLabel_8.setBounds(396, 174, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setBounds(286, 33, 85, 27);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Limpar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(124, 206, 85, 26);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setToolTipText("Sobre");
		btnNewButton_4.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(SystemColor.control);
		btnNewButton_4.setBounds(452, 0, 85, 60);
		contentPane.add(btnNewButton_4);
	}
}
