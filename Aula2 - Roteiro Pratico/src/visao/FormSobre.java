package visao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class FormSobre extends JFrame {

    public FormSobre() {
        setTitle("Sobre");
        setSize(260, 160);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CalcInvest - Calculado de Investimentos");
        lblNewLabel.setBounds(10, 11, 227, 14);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Versão: 1.0");
        lblNewLabel_1.setBounds(10, 31, 103, 14);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Autor: Andrei de Souza Inácio");
        lblNewLabel_2.setBounds(10, 50, 202, 14);
        getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Contato: andrei.inacio@ifsc.edu.br");
        lblNewLabel_3.setBounds(10, 69, 227, 14);
        getContentPane().add(lblNewLabel_3);
        
        JButton btnNewButton = new JButton("OK");
        btnNewButton.setBackground(new Color(244, 244, 255));
        btnNewButton.setBounds(97, 94, 56, 23);
        getContentPane().add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });
        
    }
}
