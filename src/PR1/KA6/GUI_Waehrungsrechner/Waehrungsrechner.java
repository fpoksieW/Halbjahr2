package PR1.KA6.GUI_Waehrungsrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Waehrungsrechner extends JFrame implements ActionListener{

    JButton button;
    JTextField tf;
    JTextField output;

    public Waehrungsrechner(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());



        tf = new JTextField();
        tf.setPreferredSize(new Dimension(250, 40));

        output = new JTextField();
        output.setPreferredSize(new Dimension(250, 40));




        JButton button = new JButton("Umrechnen");
        button.addActionListener(this);

        this.add(output);
        this.add(button);
        this.add(tf);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button){
            String zahlText = tf.getText();
            double zahl = Integer.parseInt(zahlText);
            double ergebnis = zahl * 0.68;
            output.setText(String.valueOf(ergebnis));

        }
    }

    public static void main(String[] args) {
        Waehrungsrechner frame = new Waehrungsrechner();
        frame.setBounds(800, 400, 300, 200);
        frame.setVisible(true);
    }
}
