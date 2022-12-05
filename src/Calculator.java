import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    JFrame frame = new JFrame();
    private JButton somma;
    private JButton moltiplicazione;
    private JButton sottrazione;
    private JButton divisione;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JPanel rootpanel;

    public Calculator(){
        frame.setTitle("Calculator");
        frame.setSize(350,300);
        rootpanel.setBackground(Color.BLACK); //commento

        somma.addActionListener(new ActionListener() {      //pulsante somma
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double sum = 0.0;
                sum = n1 + n2;
                String result = String.valueOf(sum);
                tf3.setText(result);
            }
        });
        frame.add(rootpanel);
        sottrazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double sum = 0.0;
                sum = n1 - n2;
                String result = String.valueOf(sum);
                tf3.setText(result);
            }
        });
        moltiplicazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double sum = 0.0;
                sum = n1 * n2;
                String result = String.valueOf(sum);
                tf3.setText(result);
            }
        });

        divisione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double sum = 0.0;
                sum = n1 / n2;
                String result = String.valueOf(sum);
                tf3.setText(result);
            }
        });
    }
}