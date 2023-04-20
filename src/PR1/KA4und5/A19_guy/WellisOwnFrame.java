package PR1.KA4und5.A19_guy;

import javax.swing.*;
import java.awt.*;

public class WellisOwnFrame extends javax.swing.JFrame{

    JLabel lb;

    public WellisOwnFrame(String title) throws HeadlessException { // Constructor
        super(title);
        this.setSize(400, 300);
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        lb = new JLabel("Hello World");
        this.add(lb);


    }


}
