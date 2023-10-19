package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPesoP;
	private JTextField textValorQ;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnCalculo;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5 frame = new Ex5();
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
	public Ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoP = new JLabel("Peso do Prato (kg): ");
		lblPesoP.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblPesoP.setBounds(41, 76, 161, 37);
		contentPane.add(lblPesoP);
		
		JLabel lblValorQ = new JLabel("Valor do kg: ");
		lblValorQ.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblValorQ.setBounds(41, 124, 113, 37);
		contentPane.add(lblValorQ);
		
		textPesoP = new JTextField();
		textPesoP.setForeground(new Color(46, 139, 87));
		textPesoP.setBounds(212, 86, 48, 20);
		contentPane.add(textPesoP);
		textPesoP.setColumns(10);
		
		textValorQ = new JTextField();
		textValorQ.setForeground(new Color(46, 139, 87));
		textValorQ.setBounds(212, 134, 48, 20);
		contentPane.add(textValorQ);
		textValorQ.setColumns(10);
		
		lblNewLabel = new JLabel("Restaurante ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Sylfaen", Font.ITALIC, 17));
		lblNewLabel.setBounds(27, 11, 92, 31);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fomelândia");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_1.setBounds(68, 28, 134, 28);
		contentPane.add(lblNewLabel_1);
		
		btnCalculo = new JButton("Calcular");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String PesoPr = textPesoP.getText ();
				float Prato = Float.valueOf(PesoPr);
				
		    String PesoT = textValorQ.getText ();
				float ValorQ = Float.valueOf(PesoT);
				
			float ValorT = Prato * ValorQ;
			JOptionPane.showMessageDialog(null, "Valor a pagar: " +ValorT);
			}
		
			
			
		});
		btnCalculo.setBounds(181, 197, 89, 37);
		contentPane.add(btnCalculo);
		
		lblNewLabel_3 = new JLabel("--------------------------------------");
		lblNewLabel_3.setBounds(3, 41, 167, 14);
		contentPane.add(lblNewLabel_3);
	}

}