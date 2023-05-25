package PR1.KA6.GUI_Waehrungsrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Waehrungsrechner extends JFrame implements ActionListener{

    JButton button;
    JTextField singapur;
    JTextField euro;
    JLabel label1 = new JLabel("Betrag in Singapurdollar");
    JLabel label2 = new JLabel("Betrag in Euro");


    public Waehrungsrechner(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());



        singapur = new JTextField();
        singapur.setPreferredSize(new Dimension(250, 40));

        euro = new JTextField();
        euro.setPreferredSize(new Dimension(250, 40));

        String[] laender = { "Singapur Dollar","USA Dollar", "Schweizer Franken"};
        JComboBox<String> cb = new JComboBox<String>(laender);


        button = new JButton("Umrechnen");
        button.addActionListener(this);

        //JPanel panel = new JPanel();

        this.add(label1);
        this.add(singapur);
        //panel.add(cb);
        //cb.setVisible(true);
        this.add(label2);
        this.add(euro);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Umrechnen")){
            String erg = Arithmetik.umrechnen(singapur.getText());
            euro.setText(erg);
        }
    }

    public static void main(String[] args) {
        Waehrungsrechner frame = new Waehrungsrechner("Waehrungsrechner");
        frame.setBounds(800, 400, 300, 230);
        frame.setVisible(true);
    }
}
