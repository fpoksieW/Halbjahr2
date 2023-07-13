package PR1.KA6.projekt;

import java.sql.*;

public class DBTabelleLesen implements Daten {

    public static Connection baueVerbindungAuf () {

        Connection verbindung = null;

        try {

            Class.forName(dbTreiber);

            String s = "jdbc:mariadb://" + host + ":" + port + "/" + db + "?user=" + user + "&password=" + passwd;

            verbindung = DriverManager.getConnection(s);

        } catch ( ClassNotFoundException e ) {
            System.out.println("Treiber nicht gefunden!");
        } catch ( SQLException e ) {
            System.out.println("Verbindung nicht möglich!" + e.getMessage());
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        return verbindung;

    }

    public static void leseTabelle ( Connection dbVerbindung ) {

        String sQuery = "SELECT * FROM gerichte";

        try ( Statement stmt = dbVerbindung.createStatement() ) {

            ResultSet rs = stmt.executeQuery(sQuery);

            while ( rs.next() ) {
                int Nr = rs.getInt("Nr");
                double Preis = rs.getDouble("Preis");
                String Name = rs.getString("Name");


                System.out.println(Nr + " " + Preis + " " + Name);
            }

        } catch ( SQLException e ) {
            System.out.println(e.getMessage());
        }

    }

}
