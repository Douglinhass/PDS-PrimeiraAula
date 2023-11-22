package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import modelo.Combustivel;
import modelo.SistemaDePosto;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;

public class JanelaPosto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecoDiesel;
	private JTextField txtPrecoGasComum;
	private JTextField txtPrecoGasAditivada;
	private JTextField txtPrecoEtanol;
	private JTextField txtPrecoOleo500;
	private JTextField txtPrecoOleo1;
	private JTextField txtQuantidadeOleo500;
	private JTextField txtQuantidadeOleo1;
	private JTextField txtQuantidadeLitros;
	private JTextField txtDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPosto frame = new JanelaPosto();
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
	public JanelaPosto() {
		setTitle("Posto de Combustivel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		// JPanel
		
		JPanel TabelaCombustivel = new JPanel();
		TabelaCombustivel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel TabelaOleoMotor = new JPanel();
		TabelaOleoMotor.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel OleoMotorLabel = new JPanel();
		OleoMotorLabel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel Abastecimento = new JPanel();
		Abastecimento.setToolTipText("Selecionar");
		Abastecimento.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel FormasPagamento = new JPanel();
		FormasPagamento.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		// Objeto PostoCombustivel
		
		SistemaDePosto p = new SistemaDePosto();
		
		//RadioButton
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		rdbtnVista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDias.setEnabled(false);
				txtDias.setEditable(false);
			}
		});
		buttonGroup.add(rdbtnVista);
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		rdbtnPrazo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDias.setEnabled(true);
				txtDias.setEditable(true);
			}
		});
		buttonGroup.add(rdbtnPrazo);
		
		//JLabel
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		
		JLabel lblLitros = new JLabel("Quantidade Litros:");
		
		JLabel lblCombustivelTotal = new JLabel("Total Combustivel:");
		
		JLabel lblTotalCombustivel = new JLabel("-");
		lblTotalCombustivel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblOleo500 = new JLabel("Frasco 500ml:");
		
		JLabel lblOleo1 = new JLabel("Frasco 1L:");
		
		JLabel lblDias = new JLabel("Dias:");
		
		JLabel lblTotalPagar = new JLabel("Total a pagar:");
		
		JLabel lblTotal = new JLabel("-");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblFrasco500 = new JLabel("Frasco de 500ml");
		
		JLabel lblFrasco1 = new JLabel("Frasco de 1L");
		
		JLabel lblValorOleo1 = new JLabel("-");
		lblValorOleo1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTotalOleo = new JLabel("Total Oleo");
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		
		JLabel lblValorPagar = new JLabel("Valor a pagar");
		
		JLabel lblOleoTotal = new JLabel("-");
		lblOleoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblValorOleo500 = new JLabel("-");
		lblValorOleo500.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblOleoDiesel = new JLabel("Óleo diesel:");
		
		JLabel lblGasComum = new JLabel("Gasolina Comum:");
		
		JLabel lblGasAditivada = new JLabel("Gasolina Aditivada:");
		
		JLabel lblEtanol = new JLabel("Etanol:");
		
		// ComboBox
		
		JComboBox<Combustivel> comboBoxCombustivel = new JComboBox<Combustivel>();
		comboBoxCombustivel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(p.getQuantidadeLitros() != 0) {
					Combustivel cSelecionado = (Combustivel) comboBoxCombustivel.getSelectedItem();
					p.calcularCombustivel(p, cSelecionado);
					lblTotalCombustivel.setText(String.valueOf(p.getTotalCombustivel()));
				}
			}
		});
		comboBoxCombustivel.setToolTipText("");
		comboBoxCombustivel.addItem(Combustivel.OLEO_DIESEL);
		comboBoxCombustivel.addItem(Combustivel.ETANOL);
		comboBoxCombustivel.addItem(Combustivel.GASOLINA_ADITIVADA);
		comboBoxCombustivel.addItem(Combustivel.GASOLINA_COMUM);
		
		//Text
	
		txtPrecoDiesel = new JTextField();
		txtPrecoDiesel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float preco = 0;
				try {
					preco = Float.parseFloat(txtPrecoDiesel.getText());
				} catch(Exception ex2){
					JOptionPane.showMessageDialog(null, "O tipo do preço precisa ser float.");
					return;
				}
				Combustivel.OLEO_DIESEL.setPreco(preco);
			}
		});
		txtPrecoDiesel.setColumns(10);
		
		txtPrecoGasComum = new JTextField();
		txtPrecoGasComum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float preco = Float.parseFloat(txtPrecoGasComum.getText());
				Combustivel.GASOLINA_COMUM.setPreco(preco);
			}
		});
		txtPrecoGasComum.setColumns(10);
		
		txtPrecoGasAditivada = new JTextField();
		txtPrecoGasAditivada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float preco = 0;
				try {
					preco = Float.parseFloat(txtPrecoGasAditivada.getText());
				} catch(Exception ex2){
					JOptionPane.showMessageDialog(null, "O tipo do preço precisa ser float.");
					return;
				}
				Combustivel.GASOLINA_ADITIVADA.setPreco(preco);
			}
		});
		txtPrecoGasAditivada.setColumns(10);
		
		txtPrecoEtanol = new JTextField();
		txtPrecoEtanol.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float preco = 0;
				try {
					preco = Float.parseFloat(txtPrecoEtanol.getText());
				} catch(Exception ex2){
					JOptionPane.showMessageDialog(null, "O tipo do preço precisa ser float.");
					return;
				}
				Combustivel.ETANOL.setPreco(preco);
			}
		});
		txtPrecoEtanol.setColumns(10);
	
		txtPrecoOleo500 = new JTextField();
		txtPrecoOleo500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float preco = 0;
				try {
					preco = Float.parseFloat(txtPrecoOleo500.getText());
				} catch(Exception ex2){
					JOptionPane.showMessageDialog(null, "O tipo do preço precisa ser float.");
					return;
				}
				p.setPrecoOleo500(preco);;
			}
		});
		txtPrecoOleo500.setText("");
		txtPrecoOleo500.setColumns(10);
		
		txtPrecoOleo1 = new JTextField();
		txtPrecoOleo1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float preco = 0;
				try {
					preco = Float.parseFloat(txtPrecoOleo1.getText());
				} catch(Exception ex2){
					JOptionPane.showMessageDialog(null, "O tipo do preço precisa ser float.");
					return;
				}
				p.setPrecoOleo1(preco);;
			}
		});
		txtPrecoOleo1.setColumns(10);
		
		txtQuantidadeOleo500 = new JTextField();
		txtQuantidadeOleo500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				p.setQuantidadeOleo500(Float.parseFloat(txtQuantidadeOleo500.getText()));
				p.calcularValorPagarOleo500(p);
				lblValorOleo500.setText(String.valueOf(p.getValorPagarOleo500()));
				if(p.getValorPagarOleo1() != 0) {
					p.calcularTotalOleo(p);
					lblOleoTotal.setText(String.valueOf(p.getTotalOleo()));
				} else {
					lblOleoTotal.setText(String.valueOf(p.getValorPagarOleo500()));
				}
			}
		});
		txtQuantidadeOleo500.setColumns(10);
		
		txtQuantidadeOleo1 = new JTextField();
		txtQuantidadeOleo1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				p.setQuantidadeOleo1(Float.parseFloat(txtQuantidadeOleo1.getText()));
				p.calcularValorPagarOleo1(p);
				lblValorOleo1.setText(String.valueOf(p.getValorPagarOleo1()));
				if(p.getValorPagarOleo500() != 0) {
					p.calcularTotalOleo(p);
					lblOleoTotal.setText(String.valueOf(p.getTotalOleo()));
				} else {
					lblOleoTotal.setText(String.valueOf(p.getValorPagarOleo1()));
				}
			}
		});
		txtQuantidadeOleo1.setColumns(10);
		
		txtQuantidadeLitros = new JTextField();
		txtQuantidadeLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float quantidade = Float.parseFloat(txtQuantidadeLitros.getText());
				p.setQuantidadeLitros(quantidade);
				Combustivel cSelecionado = (Combustivel) comboBoxCombustivel.getSelectedItem();
				p.calcularCombustivel(p, cSelecionado);
				lblTotalCombustivel.setText(String.valueOf(p.getTotalCombustivel()));
			}
		});
		txtQuantidadeLitros.setColumns(10);
		
		txtDias = new JTextField();
		txtDias.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Integer.parseInt(txtDias.getText()) > 30) {
					JOptionPane.showMessageDialog(null, "Pagamento a prazo mais de 30 dias juros de 10%.");
				}
				p.setDias(Integer.parseInt(txtDias.getText()));
			}
		});
		txtDias.setColumns(10);
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				lblValorOleo1.setText("-");
				lblValorOleo500.setText("-");
				lblOleoTotal.setText("-");
				lblTotalCombustivel.setText("-");
				lblTotal.setText("-");	
				
				txtDias.setText(null);
				txtPrecoDiesel.setText(null);
				txtPrecoEtanol.setText(null);
				txtPrecoGasAditivada.setText(null);
				txtPrecoGasComum.setText(null);
				txtPrecoOleo1.setText(null);
				txtPrecoOleo500.setText(null);
				txtQuantidadeLitros.setText(null);
				txtQuantidadeOleo1.setText(null);
				txtQuantidadeOleo500.setText(null);
				
				buttonGroup.clearSelection();
			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnVista.isSelected()) {
					p.calcularTotalVista(p);
					lblTotal.setText(String.valueOf(p.getTotal()));
				}
				if(rdbtnPrazo.isSelected()) {
					p.calcularTotalPrazo(p);
					lblTotal.setText(String.valueOf(p.getTotal()));
				}
			}
		});
		
		
		GroupLayout gl_Abastecimento = new GroupLayout(Abastecimento);
		gl_Abastecimento.setHorizontalGroup(
			gl_Abastecimento.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Abastecimento.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_Abastecimento.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Abastecimento.createSequentialGroup()
							.addComponent(lblCombustivel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBoxCombustivel, 0, 170, Short.MAX_VALUE))
						.addGroup(gl_Abastecimento.createSequentialGroup()
							.addGroup(gl_Abastecimento.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLitros)
								.addComponent(lblCombustivelTotal))
							.addGap(30)
							.addGroup(gl_Abastecimento.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblTotalCombustivel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtQuantidadeLitros, Alignment.LEADING))))
					.addContainerGap())
		);
		gl_Abastecimento.setVerticalGroup(
			gl_Abastecimento.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Abastecimento.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_Abastecimento.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCombustivel)
						.addComponent(comboBoxCombustivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Abastecimento.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLitros)
						.addComponent(txtQuantidadeLitros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Abastecimento.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCombustivelTotal)
						.addComponent(lblTotalCombustivel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Abastecimento.setLayout(gl_Abastecimento);
		
		GroupLayout gl_TabelaOleoMotor = new GroupLayout(TabelaOleoMotor);
		gl_TabelaOleoMotor.setHorizontalGroup(
			gl_TabelaOleoMotor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TabelaOleoMotor.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_TabelaOleoMotor.createParallelGroup(Alignment.LEADING)
						.addComponent(lblOleo500)
						.addComponent(lblOleo1))
					.addGap(18)
					.addGroup(gl_TabelaOleoMotor.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPrecoOleo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPrecoOleo500, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_TabelaOleoMotor.setVerticalGroup(
			gl_TabelaOleoMotor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TabelaOleoMotor.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_TabelaOleoMotor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOleo500)
						.addComponent(txtPrecoOleo500, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_TabelaOleoMotor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOleo1)
						.addComponent(txtPrecoOleo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		TabelaOleoMotor.setLayout(gl_TabelaOleoMotor);
		
		
		GroupLayout gl_FormasPagamento = new GroupLayout(FormasPagamento);
		gl_FormasPagamento.setHorizontalGroup(
			gl_FormasPagamento.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_FormasPagamento.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_FormasPagamento.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnVista)
						.addComponent(rdbtnPrazo))
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addComponent(lblDias)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
				.addGroup(Alignment.LEADING, gl_FormasPagamento.createSequentialGroup()
					.addGap(78)
					.addComponent(lblTotalPagar)
					.addGap(18)
					.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_FormasPagamento.setVerticalGroup(
			gl_FormasPagamento.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FormasPagamento.createSequentialGroup()
					.addGroup(gl_FormasPagamento.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_FormasPagamento.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_FormasPagamento.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDias)
								.addComponent(txtDias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_FormasPagamento.createSequentialGroup()
							.addGap(18)
							.addComponent(rdbtnVista)
							.addGap(1)
							.addComponent(rdbtnPrazo)))
					.addGap(25)
					.addGroup(gl_FormasPagamento.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalPagar)
						.addComponent(lblTotal))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		FormasPagamento.setLayout(gl_FormasPagamento);
		
		
		GroupLayout gl_OleoMotorLabel = new GroupLayout(OleoMotorLabel);
		gl_OleoMotorLabel.setHorizontalGroup(
			gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OleoMotorLabel.createSequentialGroup()
					.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_OleoMotorLabel.createSequentialGroup()
							.addGap(171)
							.addComponent(lblQuantidade))
						.addGroup(gl_OleoMotorLabel.createSequentialGroup()
							.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_OleoMotorLabel.createSequentialGroup()
									.addGap(28)
									.addComponent(lblFrasco500))
								.addGroup(gl_OleoMotorLabel.createSequentialGroup()
									.addGap(42)
									.addComponent(lblFrasco1)))
							.addGap(46)
							.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtQuantidadeOleo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtQuantidadeOleo500, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(72)
					.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblValorPagar)
						.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblValorOleo1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblValorOleo500, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
					.addGap(64)
					.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTotalOleo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOleoTotal, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		gl_OleoMotorLabel.setVerticalGroup(
			gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OleoMotorLabel.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade)
						.addComponent(lblValorPagar)
						.addComponent(lblTotalOleo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblFrasco500)
							.addComponent(txtQuantidadeOleo500, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblOleoTotal)
							.addComponent(lblValorOleo500)))
					.addGap(18)
					.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_OleoMotorLabel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblFrasco1)
							.addComponent(txtQuantidadeOleo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblValorOleo1))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		OleoMotorLabel.setLayout(gl_OleoMotorLabel);
		
		
		GroupLayout gl_TabelaCombustivel = new GroupLayout(TabelaCombustivel);
		gl_TabelaCombustivel.setHorizontalGroup(
			gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TabelaCombustivel.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TabelaCombustivel.createSequentialGroup()
							.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOleoDiesel)
								.addComponent(lblGasComum))
							.addGap(28)
							.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPrecoGasComum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPrecoDiesel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_TabelaCombustivel.createSequentialGroup()
							.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGasAditivada)
								.addComponent(lblEtanol))
							.addGap(18)
							.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPrecoEtanol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPrecoGasAditivada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_TabelaCombustivel.setVerticalGroup(
			gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TabelaCombustivel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOleoDiesel)
						.addComponent(txtPrecoDiesel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGasComum)
						.addComponent(txtPrecoGasComum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGasAditivada)
						.addComponent(txtPrecoGasAditivada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_TabelaCombustivel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEtanol)
						.addComponent(txtPrecoEtanol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		TabelaCombustivel.setLayout(gl_TabelaCombustivel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(TabelaCombustivel, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
					.addGap(9)
					.addComponent(TabelaOleoMotor, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
					.addGap(7))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(OleoMotorLabel, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
					.addGap(7))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(Abastecimento, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
					.addGap(9)
					.addComponent(FormasPagamento, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
					.addGap(7))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(95)
					.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(67)
					.addComponent(btnNovoCalculo, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(69)
					.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(91))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(TabelaCombustivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TabelaOleoMotor, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(OleoMotorLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Abastecimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(FormasPagamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFechar)
						.addComponent(btnNovoCalculo)
						.addComponent(btnCalcular)))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}
