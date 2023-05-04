package PR1.KA6.GUI_Button_Zahlenschloss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zahlenschloss extends javax.swing.JFrame implements ActionListener{

    StringBuilder sb = new StringBuilder();
    String eingabe = "";
    String code = "123";
    int zaehler = 0;


    public Zahlenschloss(String title){
        super(title);

        for (int i = 0; i < 10; i++) {
            JButton b = new JButton(String.valueOf(i));
            b.addActionListener(this);
            this.add(b);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        for (int i = 0; i < 10; i++) {
            if (e.getActionCommand().equals(String.valueOf(i))){
                sb.append(i);
            }
        }

        eingabe = sb.toString();

        if (eingabe.equals(code)){
            this.getContentPane().setBackground(Color.GREEN);
            zaehler++;
        }
        zaehler++;
        if (zaehler == code.length() ){
            this.getContentPane().setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {
        Zahlenschloss frame = new Zahlenschloss("Zahlenschloss");
        frame.setBounds(800, 400, 300, 200);
        frame.setVisible(true);
    }
}
