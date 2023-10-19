package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JInternalFrame;

public class Ex2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 236, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sobrenome: ");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(43, 105, 156, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNome.setBounds(43, 41, 156, 35);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtNome.setBounds(176, 46, 194, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setHorizontalAlignment(SwingConstants.CENTER);
		txtSobrenome.setBounds(176, 114, 194, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Noto Serif Light", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Nome = txtNome.getText ();
				String Sobrenome = txtSobrenome.getText ();
				JOptionPane.showMessageDialog(null, "Nome completo: " +Nome+" "+Sobrenome);

			}
		});
		btnNewButton.setBounds(303, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtSobrenome.setText("");

				
				
			}
		});
		btnLimpar.setFont(new Font("Noto Serif Light", Font.BOLD | Font.ITALIC, 13));
		btnLimpar.setForeground(new Color(0, 0, 0));
		btnLimpar.setBounds(43, 200, 89, 23);
		contentPane.add(btnLimpar);
	}
}