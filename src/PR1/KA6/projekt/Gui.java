package PR1.KA6.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Gui extends JFrame implements ActionListener {


    public Gui(String title) {
        super(title);
        List<Gericht> gerichte = Gericht.arrayErstellen(DBTabelleLesen.baueVerbindungAuf());

        for (int i = 0; i < gerichte.size(); i++) {
            JButton button = new JButton("<html>" + gerichte.get(i).getName() + "<br>" + gerichte.get(i).getPreis() + "€" + "</html>");
            button.addActionListener(this);
            this.add(button);
        }


        setLayout(new FlowLayout());
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        Gui gui = new Gui("Bäckerei");
    }
}
