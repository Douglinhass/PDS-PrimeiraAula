package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;

public class CalculadoraInvestimentoGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDeposito;
	private JTextField textMes;
	private JTextField textJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentoGrid frame = new CalculadoraInvestimentoGrid();
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
	public CalculadoraInvestimentoGrid() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 239);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda ");
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton_1 = new JButton("Sobre ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSobre frame = new FormSobre();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(btnNewButton_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepMes = new JLabel("Depósito mensal R$: ");
		lblDepMes.setFont(new Font("Verdana", Font.PLAIN, 11));
		contentPane.add(lblDepMes);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textDeposito = new JTextField();
		textDeposito.setForeground(new Color(0, 128, 0));
		panel_2.add(textDeposito);
		textDeposito.setColumns(10);
		
		JLabel lblNumMes = new JLabel("Num. de meses: ");
		lblNumMes.setFont(new Font("Verdana", Font.PLAIN, 11));
		contentPane.add(lblNumMes);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textMes = new JTextField();
		textMes.setForeground(new Color(0, 128, 0));
		panel_3.add(textMes);
		textMes.setColumns(10);
		
		JLabel lblJuros = new JLabel("Juros ao mês R$: ");
		lblJuros.setFont(new Font("Verdana", Font.PLAIN, 11));
		contentPane.add(lblJuros);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textJuros = new JTextField();
		textJuros.setForeground(new Color(0, 128, 0));
		panel_4.add(textJuros);
		textJuros.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total investido + juros R$: ");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblTotal = new JLabel("");
		contentPane.add(lblTotal);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(new Color(0, 128, 0));
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 11));
		panel.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Dep = textDeposito.getText();
				String Juros = textJuros.getText();
				String Mes = textMes.getText();
				
				Double DepMes = Double.valueOf(Dep);
				Double JuMes = Double.valueOf(Juros);
				Integer NumMes= Integer.valueOf(Mes);
				
				Investimento calc = new Investimento(NumMes, JuMes, DepMes);
				Double CalcFim = calc.calculaTotal();
				String CalcTotal = String.valueOf(CalcFim);
				
				lblTotal.setText(CalcTotal); 
				
				
			}
		});
	}

}