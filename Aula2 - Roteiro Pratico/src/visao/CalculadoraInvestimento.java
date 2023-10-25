package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class CalculadoraInvestimento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDéposito;
	private JTextField textFieldMeses;
	private JTextField textFieldJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimento frame = new CalculadoraInvestimento();
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
	public CalculadoraInvestimento() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Depósito mensal R$:");
		lblNewLabel.setBounds(66, 7, 118, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNumMeses = new JLabel("Num. meses:");
		lblNumMeses.setBounds(78, 52, 106, 14);
		contentPane.add(lblNumMeses);

		JLabel lblJurosAoMes = new JLabel("Juros ao mês %:");
		lblJurosAoMes.setBounds(66, 97, 106, 14);
		contentPane.add(lblJurosAoMes);

		JLabel lblTotalInvestido = new JLabel("Total investido + juros R$:");
		lblTotalInvestido.setBounds(46, 146, 154, 14);
		contentPane.add(lblTotalInvestido);

		JButton ButtonCalcular = new JButton("Calcular");
		ButtonCalcular.setFont(new Font("Verdana", Font.PLAIN, 11));
		ButtonCalcular.setForeground(new Color(255, 0, 128));
		ButtonCalcular.setBackground(new Color(255, 255, 255));
		ButtonCalcular.setBounds(66, 171, 89, 23);
		contentPane.add(ButtonCalcular);

		textFieldDéposito = new JTextField();
		textFieldDéposito.setBounds(46, 21, 139, 20);
		contentPane.add(textFieldDéposito);
		textFieldDéposito.setColumns(10);

		textFieldMeses = new JTextField();
		textFieldMeses.setBounds(45, 66, 139, 20);
		textFieldMeses.setColumns(10);
		contentPane.add(textFieldMeses);

		textFieldJuros = new JTextField();
		textFieldJuros.setBounds(45, 115, 139, 20);
		textFieldJuros.setColumns(10);
		contentPane.add(textFieldJuros);
	}
}