package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Calculo;

public class Ex1Retangulo extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField baseFieldResposta;
    private JTextField alturaFieldResposta;
    private JRadioButton radioPerimetro;
    private JRadioButton radioArea;
    private JLabel resultadoLabel;

    public Ex1Retangulo() {
        
        setTitle("Calculadora de Retângulo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel LabelBase = new JLabel("Base:");
        LabelBase.setFont(new Font("Verdana", Font.PLAIN, 12));
        LabelBase.setBounds(90, 11, 53, 26);
        
        baseFieldResposta = new JTextField();
        baseFieldResposta.setForeground(new Color(0, 128, 0));
        baseFieldResposta.setBounds(80, 48, 70, 21);
        
        JLabel LabelAltura = new JLabel("Altura:");
        LabelAltura.setFont(new Font("Verdana", Font.PLAIN, 12));
        LabelAltura.setBounds(235, 11, 45, 26);
        
        alturaFieldResposta = new JTextField();
        alturaFieldResposta.setForeground(new Color(0, 128, 0));
        alturaFieldResposta.setBounds(223, 48, 70, 21);

        ButtonGroup radioGroup = new ButtonGroup();
        radioPerimetro = new JRadioButton("Perímetro");
        radioPerimetro.setFont(new Font("Verdana", Font.PLAIN, 12));
        radioPerimetro.setBounds(67, 90, 99, 26);
        radioArea = new JRadioButton("Área");
        radioArea.setFont(new Font("Verdana", Font.PLAIN, 12));
        radioArea.setBounds(222, 90, 90, 26);
        radioGroup.add(radioPerimetro);
        radioGroup.add(radioArea);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setFont(new Font("Verdana", Font.PLAIN, 11));
        calcularButton.setForeground(new Color(0, 128, 0));
        calcularButton.setBounds(10, 174, 113, 26);
        JButton limparButton = new JButton("Limpar");
        limparButton.setFont(new Font("Verdana", Font.PLAIN, 11));
        limparButton.setForeground(new Color(0, 0, 0));
        limparButton.setBounds(133, 174, 121, 26);
        JButton fecharButton = new JButton("Fechar");
        fecharButton.setFont(new Font("Verdana", Font.PLAIN, 11));
        fecharButton.setForeground(new Color(255, 0, 0));
        fecharButton.setBounds(266, 174, 108, 26);

        resultadoLabel = new JLabel("");
        resultadoLabel.setForeground(new Color(0, 0, 0));
        resultadoLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
        resultadoLabel.setBounds(10, 137, 339, 26);
        getContentPane().setLayout(null);

        getContentPane().add(LabelBase);
        getContentPane().add(baseFieldResposta);
        getContentPane().add(LabelAltura);
        getContentPane().add(alturaFieldResposta);
        getContentPane().add(radioPerimetro);
        getContentPane().add(radioArea);
        getContentPane().add(calcularButton);
        getContentPane().add(limparButton);
        getContentPane().add(fecharButton);
        getContentPane().add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

            fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void calcular() {
        try {
            float base = Float.parseFloat(baseFieldResposta.getText());
            float altura = Float.parseFloat(alturaFieldResposta.getText());

            Calculo calculadora = new Calculo();

            if (radioPerimetro.isSelected()) {
                float perimetro = calculadora.calculoPe(altura, base);
                resultadoLabel.setText(" Perímetro = " + perimetro);
            } else if (radioArea.isSelected()) {
                float area = calculadora.calculoA(altura, base);
                resultadoLabel.setText(" Área = " + area);
            } else {
                resultadoLabel.setText(" > Selecione Perímetro ou Área <");
            }
        } catch (NumberFormatException ex) {
            resultadoLabel.setText(" > Digite valores corretos <");
        }
    }

    private void limparCampos() {
        baseFieldResposta.setText("");
        alturaFieldResposta.setText("");
        resultadoLabel.setText("");
        radioPerimetro.setSelected(false);
        radioArea.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Ex1Retangulo frame = new Ex1Retangulo();
                frame.setVisible(true);
            }
        });
    }
}
