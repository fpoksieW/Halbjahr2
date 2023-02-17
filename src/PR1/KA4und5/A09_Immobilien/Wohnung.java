package PR1.KA4und5.A09_Immobilien;

public class Wohnung {

    protected String ort;
    protected int baujahr;
    protected double wohnflaeche;
    protected double preis;

    public Wohnung(String ort, int baujahr, double wohnflaeche, double preis) {
        this.ort = ort;
        this.baujahr = baujahr;
        this.wohnflaeche = wohnflaeche;
        this.preis = preis;
    }

    public String getInfo() {
        return "Wohnung{" +
                "ort='" + ort + '\'' +
                ", baujahr=" + baujahr +
                ", wohnflaeche=" + wohnflaeche +
                ", preis=" + preis +
                '}';
    }
}
