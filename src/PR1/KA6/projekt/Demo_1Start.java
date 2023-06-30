package PR1.KA6.projekt;

import java.sql.Connection;

public class Demo_1Start {

    public static void main(String[] args) {
        Connection dbVerbindung = null;
        dbVerbindung = DBTabelleLesen.baueVerbindungAuf();

        if (dbVerbindung != null) {
            DBTabelleLesen.leseTabelle(dbVerbindung);
        }
    }

}
