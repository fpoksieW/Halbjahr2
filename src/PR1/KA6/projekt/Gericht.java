package PR1.KA6.projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Gericht {

    private int Nr;
    private double Preis;
    private String Name;

    public Gericht(int Nr, double Preis, String Name) {
        this.Nr = Nr;
        this.Preis = Preis;
        this.Name = Name;
    }

    public static List<Gericht> arrayErstellen (Connection dbVerbindung ) {

        String sQuery = "SELECT * FROM gerichte";
        List<Gericht> gerichte = new ArrayList<Gericht>();

        try ( Statement stmt = dbVerbindung.createStatement() ) {

            ResultSet rs = stmt.executeQuery(sQuery);

            while ( rs.next() ) {
                int Nr = rs.getInt("Nr");
                double Preis = rs.getDouble("Preis");
                String Name = rs.getString("Name");


                gerichte.add(new Gericht(Nr, Preis, Name));

                //System.out.println(Nr + " " + Preis + " " + Name);
            }

        } catch ( SQLException e ) {
            System.out.println(e.getMessage());
        }
        return gerichte;
    }

    public int getNr() {
        return Nr;
    }

    public void setNr(int nr) {
        Nr = nr;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
