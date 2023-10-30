package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2Operações extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField num1Field;
    private JTextField num2Field;
    private JRadioButton radioAdicao;
    private JRadioButton radioSubtracao;
    private JRadioButton radioMultiplicacao;
    private JRadioButton radioDivisao;
    private JLabel resultadoLabel;

    public Ex2Operações() {
        setTitle("Calculadora de Operações");
        setSize(405, 232);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel num1Label = new JLabel("Primeiro número:");
        num1Field = new JTextField();
        num1Field.setForeground(new Color(128, 0, 128));
        JLabel num2Label = new JLabel("Segundo número:");
        num2Field = new JTextField();
        num2Field.setForeground(new Color(128, 0, 128));

        ButtonGroup radioGroup = new ButtonGroup();
        radioAdicao = new JRadioButton("Adição");
        radioAdicao.setForeground(new Color(128, 0, 128));
        radioSubtracao = new JRadioButton("Subtração");
        radioSubtracao.setForeground(new Color(128, 0, 128));
        radioMultiplicacao = new JRadioButton("Multiplicação");
        radioMultiplicacao.setForeground(new Color(128, 0, 128));
        radioDivisao = new JRadioButton("Divisão");
        radioDivisao.setForeground(new Color(128, 0, 128));
        radioGroup.add(radioAdicao);
        radioGroup.add(radioSubtracao);
        radioGroup.add(radioMultiplicacao);
        radioGroup.add(radioDivisao);

        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setForeground(new Color(128, 0, 128));
        resultadoLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
        resultadoLabel.setBounds(20, 160, 247, 30);

        num1Label.setBounds(20, 27, 100, 30);
        num1Field.setBounds(130, 31, 100, 23);
        num2Label.setBounds(20, 68, 100, 30);
        num2Field.setBounds(130, 72, 100, 23);
        radioAdicao.setBounds(277, 20, 79, 30);
        radioSubtracao.setBounds(277, 53, 100, 30);
        radioMultiplicacao.setBounds(277, 86, 100, 30);
        radioDivisao.setBounds(277, 119, 90, 30);
        
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setFont(new Font("Verdana", Font.PLAIN, 11));
        calcularButton.setBounds(277, 164, 100, 23);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        getContentPane().add(num1Label);
        getContentPane().add(num1Field);
        getContentPane().add(num2Label);
        getContentPane().add(num2Field);
        getContentPane().add(radioAdicao);
        getContentPane().add(radioSubtracao);
        getContentPane().add(radioMultiplicacao);
        getContentPane().add(radioDivisao);
        getContentPane().add(calcularButton);
        getContentPane().add(resultadoLabel);
    }

    private void calcular() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultado = 0.0;

            if (radioAdicao.isSelected()) {
                resultado = num1 + num2;
            } else if (radioSubtracao.isSelected()) {
                resultado = num1 - num2;
            } else if (radioMultiplicacao.isSelected()) {
                resultado = num1 * num2;
            } else if (radioDivisao.isSelected()) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    resultadoLabel.setText("  { Erro: Divisão por zero }  ");
                    return;
                }
            } else {
                resultadoLabel.setText("  { Selecione uma operação }  ");
                return;
            }

            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("  { Digite valores válidos }  ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Ex2Operações frame = new Ex2Operações();
                frame.setVisible(true);
            }
        });
    }
}
