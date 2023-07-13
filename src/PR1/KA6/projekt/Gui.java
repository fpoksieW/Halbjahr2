package PR1.KA6.projekt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Gui extends JFrame implements ActionListener {
    private List<Gericht> gerichte;
    private List<Gericht> warenkorb;
    private JTable warenkorbTable;
    private DefaultTableModel warenkorbTableModel;
    JLabel SummeWarenkorb2;
    String wSumme = "0";


    public Gui(String title) {
        super(title);
        gerichte = Gericht.arrayErstellen(DBTabelleLesen.baueVerbindungAuf());
        warenkorb = new ArrayList<>();


        setBounds(100, 100, 789, 477);
        setLayout(new GridLayout(0, 3, 0, 0));

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JLabel txtrSpeisen = new JLabel("\tSpeisen\t");
        txtrSpeisen.setSize(200, 100);
        panel.add(txtrSpeisen);

        JPanel panel_1 = new JPanel();
        add(panel_1);
        panel_1.setLayout(new BorderLayout());

        warenkorbTableModel = new DefaultTableModel();
        warenkorbTableModel.addColumn("Name");
        warenkorbTableModel.addColumn("Preis");
        warenkorbTable = new JTable(warenkorbTableModel);
        JScrollPane scrollPane = new JScrollPane(warenkorbTable);
        panel_1.add(scrollPane, BorderLayout.CENTER);


        SummeWarenkorb2 = new JLabel("Gesamtbetrag in €: " + wSumme);
        panel_1.add(SummeWarenkorb2, BorderLayout.SOUTH);


        JPanel panel_2 = new JPanel();
        add(panel_2);
        panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        for (int i = 0; i < gerichte.size(); i++) {
            JButton button = new JButton(gerichte.get(i).getName() + " " + gerichte.get(i).getPreis() + "€");
            button.setSize(300, 100);
            button.setActionCommand(Integer.toString(i)); // Setze den Index des Gerichts als ActionCommand
            button.addActionListener(this);
            panel.add(button);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        int index = Integer.parseInt(command);

        if (index >= 0 && index < gerichte.size()) {
            Gericht ausgewaehltesGericht = gerichte.get(index);
            warenkorb.add(ausgewaehltesGericht);
            String newSumme = Methoden.PreisAddierer(wSumme, ausgewaehltesGericht.getPreis());
            wSumme = newSumme;
            SummeWarenkorb2.setText("Gesamtbetrag in €: " + newSumme);

            System.out.println("Gericht zum Warenkorb hinzugefügt: " + ausgewaehltesGericht.getName());



            Object[] rowData = {ausgewaehltesGericht.getName(), ausgewaehltesGericht.getPreis() + "€"};
            warenkorbTableModel.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        Gui gui = new Gui("Bäckerei");
    }
}
