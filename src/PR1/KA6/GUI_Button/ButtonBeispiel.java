package PR1.KA6.GUI_Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonBeispiel extends javax.swing.JFrame implements ActionListener{

    JButton bSchliessen;

    public ButtonBeispiel(String title, int x, int y) {
        super(title);
        this.setSize(x, y);
        this.setBounds(200, 200, x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        bSchliessen = new JButton("Schließen");
        bSchliessen.addActionListener(this);
        bSchliessen.setBounds(100, 100, 100, 50);
        this.add(bSchliessen);

    }

    public static void main(String[] args) {
        ButtonBeispiel frame = new ButtonBeispiel("3BKI11 Button Demo", 300, 150);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bSchliessen.setText("aus");
        //System.exit(0);

    }
}


