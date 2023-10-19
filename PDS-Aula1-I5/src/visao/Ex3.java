package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Calculo;
import modelo.ConversaoTemp;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textBase;
	private JButton btnLimpar;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(168, 182, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAltura = new JTextField();
		textAltura.setBackground(new Color(255, 255, 255));
		textAltura.setBounds(166, 84, 128, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textBase = new JTextField();
		textBase.setBackground(new Color(255, 255, 255));
		textBase.setBounds(166, 136, 128, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Calcule o seu triângulo");
		lblTitulo.setBackground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setBounds(131, 27, 260, 23);
		contentPane.add(lblTitulo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(new Color(0, 0, 0));
		lblAltura.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblAltura.setBounds(59, 87, 63, 14);
		contentPane.add(lblAltura);
		
		JLabel lblBase = new JLabel("Base: ");
		lblBase.setForeground(new Color(0, 0, 0));
		lblBase.setFont(new Font("Verdana", Font.ITALIC, 14));
		lblBase.setBounds(59, 139, 65, 14);
		contentPane.add(lblBase);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(255, 223, 223));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAltura.setText("");
				textBase.setText("");

			}
		});
		btnLimpar.setBounds(33, 204, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AltDigitada = textAltura.getText ();
				String BaseDigitada = textBase.getText ();

				float Altura = Float.valueOf(AltDigitada);
				float Base = Float.valueOf(BaseDigitada);
				
				Calculo calcular = new Calculo();
				float perimetroCalcular = calcular.calculoPe(Altura, Base);
				float alturaCalcular = calcular.calculoA(Altura, Base);
				JOptionPane.showMessageDialog(null, "O Calculo do Perímetro é: " +perimetroCalcular + "\nO calculo da Área é: " +alturaCalcular );

							}
		});
		btnCalcular.setBounds(294, 204, 89, 23);
		contentPane.add(btnCalcular);
	}
}