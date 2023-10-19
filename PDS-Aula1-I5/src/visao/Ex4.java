package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ex4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPago;
	private JTextField textGasolina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 frame = new Ex4();
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
	public Ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 181, 56));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor = new JLabel("Valor pago: ");
		lblValor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValor.setFont(new Font("Verdana", Font.ITALIC, 13));
		lblValor.setForeground(new Color(0, 0, 0));
		lblValor.setBounds(15, 74, 97, 27);
		contentPane.add(lblValor);
		
		textPago = new JTextField();
		textPago.setBounds(155, 78, 86, 20);
		contentPane.add(textPago);
		textPago.setColumns(10);
		
		JLabel lblGasolina = new JLabel("Valor da gasolina: ");
		lblGasolina.setFont(new Font("Verdana", Font.ITALIC, 13));
		lblGasolina.setForeground(new Color(0, 0, 0));
		lblGasolina.setBounds(30, 122, 146, 34);
		contentPane.add(lblGasolina);
		
		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorP = textPago.getText ();
					float Pago = Float.valueOf(ValorP);
					
			    String ValorL = textGasolina.getText ();
					float Gasolina = Float.valueOf(ValorL);
					
				float ValorT = Pago / Gasolina;
				JOptionPane.showMessageDialog(null, "Quantidade de litros: " +ValorT);
				

			}
		});
		btnCalculo.setBackground(new Color(0, 0, 0));
		btnCalculo.setBounds(165, 196, 98, 34);
		contentPane.add(btnCalculo);
		
		textGasolina = new JTextField();
		textGasolina.setBounds(157, 128, 86, 20);
		contentPane.add(textGasolina);
		textGasolina.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("POSTO IPIRANGA");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel.setBounds(24, 20, 173, 20);
		contentPane.add(lblNewLabel);
	}

}