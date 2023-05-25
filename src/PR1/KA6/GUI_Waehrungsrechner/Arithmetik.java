package PR1.KA6.GUI_Waehrungsrechner;

public class Arithmetik {
    public static String umrechnen(String betrag) {
        double zahl = Double.parseDouble(betrag);
        double ergebnis = zahl * 0.68;
        return String.valueOf(ergebnis);
    }
}
