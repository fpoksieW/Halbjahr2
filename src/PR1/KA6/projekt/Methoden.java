package PR1.KA6.projekt;

public class Methoden {

    public static String PreisAddierer(String preis1, double preis2) {
        double preis1_double = Double.parseDouble(preis1);
        double preis_summe = preis1_double + preis2;
        String preis_summe_string = String.valueOf(preis_summe);
        return preis_summe_string;
    }
}
