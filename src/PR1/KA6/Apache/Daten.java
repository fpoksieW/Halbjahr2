package PR1.KA6.Apache;


public interface Daten {

    // Datenbank-Verbindungsdaten

    // Treiberklasse
    String dbTreiber = "org.mariadb.jdbc.Driver";

    // Datenbankserver (DNS-Name oder IP Adresse angeben)
    String host = "localhost";

    // DBMS Server Port
    String port = "3306";

    // Datenbankbanke
    String db = "it_center_v2012";

    // Datenbankzugangsdaten
    String user = "root";
    String passwd = "";

}
