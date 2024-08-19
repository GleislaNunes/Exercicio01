import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class novo {
    public JRadioButton adicaoRadioButton1;
    public JRadioButton subtracaoRadioButton2;
    public JRadioButton multiplicacaoRadioButton3;
    public JRadioButton divisaoRadioButton4;
    public JTextField jValor1;
    public JTextField jValor2;
    public JPanel painelPrincipal;
    public JButton button1;
    private double resultadoFinal = 0;


        public novo() {


            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, resultadoFinal);
                }
            });

            adicaoRadioButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double valor1 = Double.parseDouble(jValor1.getText());
                    double valor2 = Double.parseDouble(jValor2.getText());
                    double resultado = valor1 + valor2;
                    resultadoFinal = resultado;
                }

            });
            subtracaoRadioButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double valor1 = Double.parseDouble(jValor1.getText());
                    double valor2 = Double.parseDouble(jValor2.getText());
                    double resultado = valor1 - valor2;
                    resultadoFinal = resultado;
                }
            });
            multiplicacaoRadioButton3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double valor1 = Double.parseDouble(jValor1.getText());
                    double valor2 = Double.parseDouble(jValor2.getText());
                    double resultado = valor1 * valor2;
                    resultadoFinal = resultado;
                }
            });

            divisaoRadioButton4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double valor1 = Double.parseDouble(jValor1.getText());
                    double valor2 = Double.parseDouble(jValor2.getText());
                    double resultado = valor1 / valor2;
                    resultadoFinal = resultado;
                }
            });
        }
    }
