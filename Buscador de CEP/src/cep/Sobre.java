package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		getContentPane().setBackground(SystemColor.control);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP ver 1.0");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setBounds(28, 51, 367, 34);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Author Professor Jos\u00E9 de Assis");
		lblNewLabel_1.setBounds(28, 95, 346, 34);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("WEB Service:");
		lblNewLabel_3.setBounds(28, 139, 84, 34);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("republicavirtual.com.br");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBounds(122, 139, 149, 34);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/img/youtube.png")));
		btnNewButton.setBounds(38, 173, 85, 63);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnNewButton_1.setBounds(132, 173, 85, 63);
		getContentPane().add(btnNewButton_1);

	}

}
