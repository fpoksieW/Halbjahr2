package PR1.KA4und5.A18_JFrame;

import javax.swing.*;
import java.util.Date;

public class UhrAnwender {
    public static void main(String[] args) {
        JFrame andiFrame = new JFrame("Uhrzeit in der ADV");

        andiFrame.setSize(400, 300);
        andiFrame.setBounds(200, 200, 400, 400);
        andiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Uhrzeit ist:");
        JLabel label1 = new JLabel(String.format("%tT", new Date()));
        andiFrame.add(label);
        andiFrame.add(label1);
        label.setBounds(10, 10, 100, 20);

        andiFrame.setVisible(true);
        while(true) {
            label1.setText(String.format("%tT", new Date()));
            label1.setSize(100, 20);
            andiFrame.setTitle(String.format("%tT", new Date()));
        }
    }
}
