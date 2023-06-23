package PR1.KA6.Lamda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LamdaButton extends JFrame{
    public  LamdaButton(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);

        JButton button = new JButton("Lamda Auslöser");
        button.addActionListener(e -> System.exit(0));
        this.add(button);
        this.setLayout(new FlowLayout());
        setVisible(true);


    }


    public static void main(String[] args) {
        LamdaButton button = new LamdaButton("Lamda Auslöser");

    }
}
