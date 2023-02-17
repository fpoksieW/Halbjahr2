package PR1.KA4und5.A09_Immobilien;

public class Wohnhaus extends Wohnung{

    private double grundstuecksFlaeche;

    public Wohnhaus(String ort, int baujahr, double wohnflaeche, double preis, double grundstuecksFlaeche) {
        super(ort, baujahr, wohnflaeche, preis);
        this.grundstuecksFlaeche = grundstuecksFlaeche;
    }

    @Override
    public String getInfo() {
        return "Wohnhaus{" +
                "ort='" + ort + '\'' +
                ", baujahr=" + baujahr +
                ", wohnflaeche=" + wohnflaeche +
                ", preis=" + preis +
                ", grundstuecksFlaeche=" + grundstuecksFlaeche +
                '}';
    }
}
